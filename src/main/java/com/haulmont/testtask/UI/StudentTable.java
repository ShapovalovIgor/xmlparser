package com.haulmont.testtask.UI;

import com.haulmont.testtask.DAO.Group;
import com.haulmont.testtask.DAO.Student;
import com.haulmont.testtask.MainUI;
import com.vaadin.data.fieldgroup.FieldGroup;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.data.validator.DateRangeValidator;
import com.vaadin.data.validator.StringLengthValidator;
import com.vaadin.shared.ui.combobox.FilteringMode;
import com.vaadin.shared.ui.datefield.Resolution;
import com.vaadin.ui.*;
import com.vaadin.ui.renderers.DateRenderer;
import elemental.json.JsonValue;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;


public class StudentTable {
    private static final Label EDIT_STUDENT_LABLE = new Label("Edit Student");
    private static final Label FIRSTNAME_LABLE = new Label("FirstName: ");
    private static final Label LASTNAME_LABLE = new Label("Lastname: ");
    private static final Label SECONDNAME_LABLE = new Label("Secondname: ");
    private static final Label DOB_LABLE = new Label("Date of birthday: ");
    private static final Label GROUP_ID_LABLE = new Label("Group: ");

    private static final VerticalLayout LAYOUT = new VerticalLayout();

    Grid grid;
    BeanItemContainer<Student> container;
    TextField firstnameField;
    TextField lastnameField;
    TextField secondnameField;
    DateField dobDateField;
    ComboBox groupIDcomboBoxField;

    Button addItemButton;
    Button removeItemButton;

    public VerticalLayout table() {
        container = new BeanItemContainer<>(Student.class, MainUI.hibernateUtil.getStudent());
        grid = new Grid(container);
        grid.setColumnOrder("id", "firstname", "lastname", "secondname", "dob", "groupID");
        grid.setEditorEnabled(true);
        grid.getEditorFieldGroup().addCommitHandler(new FieldGroup.CommitHandler() {
            @Override
            public void preCommit(FieldGroup.CommitEvent commitEvent) throws FieldGroup.CommitException {
            }

            @Override
            public void postCommit(FieldGroup.CommitEvent commitEvent) throws FieldGroup.CommitException {
                Student student = (Student) grid.getEditedItemId();
                if (MainUI.hibernateUtil.updateStudent(student)) {
                    Notification.show("ok save");
                } else {
                    Notification.show("error save");
                }
            }
        });
        grid.getColumn("id").setEditable(false);
        grid.getColumn("dob").setRenderer(new DateRenderer("%1$tY-%1$tm-1$te") {
            @Override
            public JsonValue encode(Date value) {
                if (value == null) return encode("", String.class);
                else return super.encode(value);
            }
        });
        grid.setSelectionMode(Grid.SelectionMode.MULTI);
        addFirstNameField();
        addSecondnameField();
        addLastnameField();
        addDOBField();
        addGroupField();
        addItemButton = new Button("Add student");
        addItemButton.addClickListener(this::addItemListener);
        removeItemButton = new Button("Remove student");
        removeItemButton.addClickListener(this::removeItemListener);

        LAYOUT.addComponents(EDIT_STUDENT_LABLE, grid, sortComponetsLayout());
        return LAYOUT;
    }

    private HorizontalLayout sortComponetsLayout() {
        HorizontalLayout horizontalLayout = new HorizontalLayout();
        VerticalLayout verticalLayoutFullName = new VerticalLayout();
        verticalLayoutFullName.addComponents(FIRSTNAME_LABLE, firstnameField,
                LASTNAME_LABLE, lastnameField,
                SECONDNAME_LABLE, secondnameField);

        VerticalLayout verticalLayoutEquipment = new VerticalLayout();
        verticalLayoutEquipment.addComponents(DOB_LABLE, dobDateField, GROUP_ID_LABLE, groupIDcomboBoxField);

        VerticalLayout verticalLayoutButton = new VerticalLayout();
        verticalLayoutButton.addComponents(addItemButton, removeItemButton);
        horizontalLayout.addComponents(verticalLayoutFullName, verticalLayoutEquipment, verticalLayoutButton);
        return horizontalLayout;
    }

    private void addFirstNameField() {
        firstnameField = new TextField();
        firstnameField.setNullSettingAllowed(true);
        firstnameField.addValidator(new StringLengthValidator("The firstname must have 2 - 50", 2, 50, true));
        firstnameField.setValidationVisible(false);
    }

    private void addSecondnameField() {
        secondnameField = new TextField();
        secondnameField.setNullSettingAllowed(true);
        secondnameField.addValidator(new StringLengthValidator("The secondname must have 2 - 50", 2, 50, true));
        secondnameField.setValidationVisible(false);
    }

    private void addLastnameField() {
        lastnameField = new TextField();
        lastnameField.setNullSettingAllowed(true);
        lastnameField.addValidator(new StringLengthValidator("The lastname must have 2 - 50", 2, 50, true));
        lastnameField.setValidationVisible(false);
    }

    private void addDOBField() {
        dobDateField = new DateField();
        LocalDate localDate = LocalDate.now();
        LocalDate minLocalDate = localDate.minusYears(70);
        LocalDate maxLocalDate = localDate.minusYears(14);
        Date minDate = Date.from(minLocalDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        Date maxDate = Date.from(maxLocalDate.atStartOfDay(ZoneId.systemDefault()).toInstant());

        dobDateField.addValidator(new DateRangeValidator("The date of birthday must have "
                + minLocalDate.toString() +
                " - "
                + maxLocalDate.toString(), minDate, maxDate, Resolution.DAY));
        dobDateField.setValidationVisible(false);
    }

    private void addGroupField() {
        groupIDcomboBoxField = new ComboBox("Selected Group: ");
        groupIDcomboBoxField.setNullSelectionAllowed(false);
        groupIDcomboBoxField.setFilteringMode(FilteringMode.CONTAINS);
        groupIDcomboBoxField.addItems(getRefGroups());
//        groupIDcomboBoxField.setItemCaptionPropertyId("number");
        groupIDcomboBoxField.setValidationVisible(false);
    }


    private void addItemListener(Button.ClickEvent clickEvent) {
        String firstnameString = firstnameField.getValue();
        String lastnameString = lastnameField.getValue();
        String secondnameString = secondnameField.getValue();
        Date dobDate = dobDateField.getValue();
        Integer groupIdInteger = ((RefGroup) groupIDcomboBoxField.getValue()).getId();
        Student student = MainUI.hibernateUtil.addStudent(firstnameString, lastnameString, secondnameString, dobDate, groupIdInteger);
        firstnameField.clear();
        secondnameField.clear();
        grid.getContainerDataSource().addItem(student);

    }

    private void removeItemListener(Button.ClickEvent clickEvent) {
        Collection<Object> selectedRows = grid.getSelectedRows();
        selectedRows.remove(null);
        for (Object item : selectedRows) {
            MainUI.hibernateUtil.removeStudent((Student) item);
            grid.getContainerDataSource().removeItem(item);
        }
    }

    private List<RefGroup> getRefGroups() {
        List<RefGroup> refGroupList = new ArrayList<>();
        List<Group> groupList = MainUI.hibernateUtil.getGroup();
        for (Group group : groupList)
            refGroupList.add(new RefGroup(group.getId(), group.getNumber()));
        return refGroupList;
    }

    public final class RefGroup {

        private Integer id;
        private int number;

        public RefGroup(Integer id, int number) {
            super();
            this.id = id;
            this.number = number;
        }

        public Integer getId() {
            return id;
        }

        public int getNumber() {
            return number;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public void setNumber(int number) {
            this.number = number;
        }
    }

}
