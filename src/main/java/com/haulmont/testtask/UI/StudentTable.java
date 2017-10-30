package com.haulmont.testtask.UI;

import com.haulmont.testtask.DAO.Group;
import com.haulmont.testtask.DAO.Student;
import com.haulmont.testtask.MainUI;
import com.haulmont.testtask.UI.vaadin.customfield.CustomComboBox;
import com.haulmont.testtask.UI.vaadin.customfield.CustomPopupDateField;
import com.vaadin.data.fieldgroup.FieldGroup;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.data.validator.StringLengthValidator;
import com.vaadin.server.Sizeable;
import com.vaadin.shared.ui.combobox.FilteringMode;
import com.vaadin.shared.ui.grid.HeightMode;
import com.vaadin.ui.*;
import com.vaadin.ui.declarative.converters.DesignObjectConverter;
import com.vaadin.ui.renderers.DateRenderer;
import elemental.json.JsonValue;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Collection;
import java.util.Date;
import java.util.Locale;


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
    CustomPopupDateField dobDateField;
    CustomPopupDateField dobDateTableField;
    CustomComboBox groupComboBoxField;
    CustomComboBox groupComboBoxTableField;
    Button addItemButton;
    Button removeItemButton;

    public VerticalLayout table() {
        container = new BeanItemContainer<>(Student.class, MainUI.hibernateUtil.getStudent());
        addGroupField();
        addFirstNameField();
        addSecondnameField();
        addLastnameField();
        addDOBField();
        grid = new Grid(container);
//        container
        grid.setColumnOrder("id", "firstname", "lastname", "secondname", "dob", "group");
        grid.getColumn("group").setConverter(new DesignObjectConverter() {
            @Override
            public String convertToPresentation(Object value,
                                                Class<? extends String> targetType, Locale locale)
                    throws com.vaadin.data.util.converter.Converter.ConversionException {
                if (value == null) {
                    return null;
                }

                return String.valueOf(((Group) value).getId());
            }
        });
        grid.setEditorEnabled(true);
        grid.setSelectionMode(Grid.SelectionMode.MULTI);
        grid.getEditorFieldGroup().addCommitHandler(new FieldGroup.CommitHandler() {
            @Override
            public void preCommit(FieldGroup.CommitEvent commitEvent) throws FieldGroup.CommitException {
            }

            @Override
            public void postCommit(FieldGroup.CommitEvent commitEvent) throws FieldGroup.CommitException {
                Student student = (Student) grid.getEditedItemId();
                if (MainUI.hibernateUtil.updateStudent(student)) {
                    Notification.show("ok save", Notification.Type.TRAY_NOTIFICATION);
                } else {
                    Notification.show("Error save!", Notification.Type.WARNING_MESSAGE);
                }
            }
        });
        grid.getColumn("id").setEditable(false);

        grid.getColumn("dob").setRenderer(new DateRenderer("%1$tY-%1$tm-%1$te") {
            @Override
            public JsonValue encode(Date value) {
                if (value == null) return encode("", String.class);
                else return super.encode(value);
            }
        });
        grid.getColumn("dob").setEditorField(dobDateTableField);
        grid.getColumn("group").setEditorField(groupComboBoxTableField);
        addItemButton = new Button("Add student");
        addItemButton.setStyleName("friendly");
        addItemButton.addClickListener(this::addItemListener);
        removeItemButton = new Button("Remove student");
        removeItemButton.setStyleName("danger");
        removeItemButton.addClickListener(this::removeItemListener);
        grid.setWidth(100, Sizeable.Unit.PERCENTAGE);
        grid.setHeight(100, Sizeable.Unit.PERCENTAGE);
        LAYOUT.addComponents(EDIT_STUDENT_LABLE, grid, sortComponetsLayout());
        return LAYOUT;
    }

    public static Integer getClassField(Group group) {
        return group.getId();
    }

    private HorizontalLayout sortComponetsLayout() {
        HorizontalLayout horizontalLayout = new HorizontalLayout();
        VerticalLayout verticalLayoutFullName = new VerticalLayout();
        verticalLayoutFullName.addComponents(FIRSTNAME_LABLE, firstnameField,
                LASTNAME_LABLE, lastnameField,
                SECONDNAME_LABLE, secondnameField);

        VerticalLayout verticalLayoutEquipment = new VerticalLayout();
        verticalLayoutEquipment.addComponents(DOB_LABLE, dobDateField, GROUP_ID_LABLE, groupComboBoxField);

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
        dobDateField = new CustomPopupDateField();
        dobDateField.setInputPrompt("Select a date");
        dobDateField.validate();
        dobDateField.setStyleName("{background: blue;}");
        dobDateField.setDateFormat("yyyy-MM-dd");
        LocalDate localDate = LocalDate.now();
        LocalDate minLocalDate = localDate.minusYears(70);
        LocalDate maxLocalDate = localDate.minusYears(14);
        Date minDate = Date.from(minLocalDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        Date maxDate = Date.from(maxLocalDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        dobDateField.setRangeStart(minDate);
        dobDateField.setRangeEnd(maxDate);
        dobDateField.setDateOutOfRangeMessage("The date of birthday must have "
                + minLocalDate.toString() +
                " - "
                + maxLocalDate.toString());
        dobDateField.setTextFieldEnabled(false);
        dobDateField.setValidationVisible(false);

        try {

            dobDateTableField = (CustomPopupDateField) dobDateField.clone();
        } catch (CloneNotSupportedException e) {
            Notification.show("Error Date Field!", Notification.Type.WARNING_MESSAGE);
        }
    }

    private void addGroupField() {
        groupComboBoxField = new CustomComboBox("Selected group: ");
        groupComboBoxField.setNullSelectionAllowed(false);
        groupComboBoxField.setFilteringMode(FilteringMode.CONTAINS);
        groupComboBoxField.setItemCaptionMode(AbstractSelect.ItemCaptionMode.PROPERTY);
        groupComboBoxField.setContainerDataSource(GroupTable.container);
        groupComboBoxField.setItemCaptionPropertyId("number");
        groupComboBoxField.setValidationVisible(false);
        try {
            groupComboBoxTableField = (CustomComboBox) groupComboBoxField.clone();
        } catch (CloneNotSupportedException e) {
            Notification.show("Error ComboBox!", Notification.Type.WARNING_MESSAGE);
        }

    }

    private void addItemListener(Button.ClickEvent clickEvent) {
        String firstnameString = firstnameField.getValue();
        String lastnameString = lastnameField.getValue();
        String secondnameString = secondnameField.getValue();
        Date dobDate = dobDateField.getValue();
        Group group = (Group) groupComboBoxField.getValue();

        Student student = MainUI.hibernateUtil.addStudent(firstnameString, lastnameString, secondnameString, dobDate, group);
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

}
