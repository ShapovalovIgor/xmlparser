package com.haulmont.testtask.UI;

import com.haulmont.testtask.DAO.Group;
import com.haulmont.testtask.DAO.Student;
import com.haulmont.testtask.MainUI;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.data.validator.StringLengthValidator;
import com.vaadin.server.Sizeable;
import com.vaadin.shared.ui.combobox.FilteringMode;
import com.vaadin.ui.*;
import com.vaadin.ui.declarative.converters.DesignObjectConverter;
import com.vaadin.ui.renderers.DateRenderer;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import static com.haulmont.testtask.MainUI.ui;


public class StudentTable extends UIHelper implements Table {
    private static final Label EDIT_STUDENT_LABLE = new Label("Edit Student");
    private static final Label FIRSTNAME_LABLE = new Label("Firstname: ");
    private static final Label LASTNAME_LABLE = new Label("Lastname: ");
    private static final Label SECONDNAME_LABLE = new Label("Secondname: ");
    private static final Label DOB_LABLE = new Label("Date of birthday: ");
    private static final Label GROUP_LABLE = new Label("Group: ");

    private static final VerticalLayout LAYOUT = new VerticalLayout();

    private Grid grid;
    private BeanItemContainer<Student> container;
    private TextField firstnameField;
    private TextField lastnameField;
    private TextField secondnameField;
    private PopupDateField dobDateField;
    private ComboBox groupComboBoxField;
    private Button addItemButton;
    private Button editItemButton;
    private Button removeItemButton;
    private Button createStudentButton;
    private Window modalWindow;
    private Student editStudent;

    @Override
    public Window getModalWindow() {
        return modalWindow;
    }

    public StudentTable() {
    }

    public VerticalLayout table() {
        container = new BeanItemContainer<>(Student.class, MainUI.hibernateUtil.getStudent());
        grid = new Grid(container);
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
        grid.setEditorEnabled(false);
        grid.getColumn("dob").setRenderer(new DateRenderer("%1$tY-%1$tm-%1$td"));
        removeItemButton = new Button("Remove student");
        removeItemButton.setStyleName("danger");
        removeItemButton.addClickListener(this::removeItemListener);
        addItemButton();
        editItemButton();
        addFilterColumnValue(grid, container);
        Grid.HeaderRow filterRow = grid.appendHeaderRow();
        grid.setWidth(100, Sizeable.Unit.PERCENTAGE);
        grid.setHeight(100, Sizeable.Unit.PERCENTAGE);
        LAYOUT.addComponents(EDIT_STUDENT_LABLE, grid, sortComponetsLayout());
        return LAYOUT;
    }

    private Button createStudentButton() {
        addItemButton = new Button("Add student");
        addItemButton.setStyleName("friendly");
        addItemButton.addClickListener(this::addItemListener);
        return addItemButton;
    }

    private Button saveStudentButton() {
        addItemButton = new Button("Save");
        addItemButton.setStyleName("friendly");
        addItemButton.addClickListener(this::saveItemListener);
        return addItemButton;
    }

    private void addItemButton() {
        createStudentButton = new Button("Add student");
        createStudentButton.addClickListener(this::openWindowsCreateStudent);
        createStudentButton.setStyleName("friendly");
    }

    private void editItemButton() {
        editItemButton = new Button("Edit student");
        editItemButton.addClickListener(this::openWindowsEditStudent);
        editItemButton.setStyleName("primary");
    }

    private HorizontalLayout sortComponetsLayout() {
        HorizontalLayout horizontalLayout = new HorizontalLayout();
        horizontalLayout.addComponents(createStudentButton, editItemButton, removeItemButton);
        return horizontalLayout;
    }

    private void addFirstNameField() {
        addFirstNameField(null);
    }

    private void addFirstNameField(Student student) {
        firstnameField = new TextField();
        if (null != student) {
            firstnameField.setValue(student.getFirstname());
        }
        firstnameField.setNullSettingAllowed(true);
        firstnameField.addValidator(new StringLengthValidator("The firstname must have 2 - 50", 2, 50, true));
        firstnameField.setValidationVisible(false);
        if (student != null) {
            firstnameField.setNullRepresentation(student.getFirstname());
        }
    }

    private void addSecondnameField() {
        addSecondnameField(null);
    }

    private void addSecondnameField(Student student) {
        secondnameField = new TextField();
        if (null != student) {
            secondnameField.setValue(student.getSecondname());
        }
        secondnameField.setNullSettingAllowed(true);
        secondnameField.addValidator(new StringLengthValidator("The secondname must have 2 - 50", 2, 50, true));
        secondnameField.setValidationVisible(false);
        if (student != null) {
            secondnameField.setNullRepresentation(student.getSecondname());
        }
    }

    private void addLastnameField() {
        addLastnameField(null);
    }

    private void addLastnameField(Student student) {
        lastnameField = new TextField();
        if (null != student) {
            lastnameField.setValue(student.getLastname());
        }
        lastnameField.setNullSettingAllowed(true);
        lastnameField.addValidator(new StringLengthValidator("The lastname must have 2 - 50", 2, 50, true));
        lastnameField.setValidationVisible(false);
    }

    private void addDOBField() {
        addDOBField(null);
    }

    private void addDOBField(Student student) {
        dobDateField = new PopupDateField();
        if (null != student) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            dobDateField.setInputPrompt(dateFormat.format(student.getDob()));
            dobDateField.setValue(student.getDob());
        } else {
            dobDateField.setInputPrompt("Select a date");
        }
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
        if (student != null) {
            dobDateField.setData(student.getDob());
        }
    }

    private void addGroupField() {
        addGroupField(null);
    }

    private void addGroupField(Student student) {
        groupComboBoxField = new ComboBox();
        groupComboBoxField.setNullSelectionAllowed(false);
        groupComboBoxField.setFilteringMode(FilteringMode.CONTAINS);
        groupComboBoxField.setItemCaptionMode(AbstractSelect.ItemCaptionMode.PROPERTY);
        groupComboBoxField.setContainerDataSource(GroupTable.container);
        groupComboBoxField.setItemCaptionPropertyId("id");
        groupComboBoxField.setValidationVisible(false);
        if (null != student) {
            List<Group> groupList = GroupTable.container.getItemIds();
            for (Group group : groupList) {
                if (group.getId() == student.getGroup().getId()) {
                    groupComboBoxField.setValue(group);
                }
            }
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
        modalWindow.close();
    }

    private void saveItemListener(Button.ClickEvent clickEvent) {
        String firstnameString = firstnameField.getValue();
        String lastnameString = lastnameField.getValue();
        String secondnameString = secondnameField.getValue();
        Date dobDate = dobDateField.getValue();
        Group group = (Group) groupComboBoxField.getValue();

        Student student = MainUI.hibernateUtil.updateStudent(editStudent, firstnameString, lastnameString, secondnameString, dobDate, group);
        firstnameField.clear();
        secondnameField.clear();
        lastnameField.clear();
        dobDateField.clear();
        groupComboBoxField.clear();
        grid.getContainerDataSource().addItem(student);
        grid.clearSortOrder();
        modalWindow.close();
    }

    private void removeItemListener(Button.ClickEvent clickEvent) {
        Student student = (Student) grid.getSelectedRow();
            MainUI.hibernateUtil.removeStudent(student);
            grid.getContainerDataSource().removeItem(student);
    }

    private void openWindowsCreateStudent(Button.ClickEvent clickEvent) {
        addGroupField();
        addFirstNameField();
        addSecondnameField();
        addLastnameField();
        addDOBField();
        VerticalLayout rootWindowsVerticalLayout = new VerticalLayout();
        HorizontalLayout fieldLayout = new HorizontalLayout();
        VerticalLayout verticalLayoutFirstname = new VerticalLayout();
        verticalLayoutFirstname.addComponents(FIRSTNAME_LABLE, firstnameField);
        VerticalLayout verticalLayoutLastname = new VerticalLayout();
        verticalLayoutLastname.addComponents(LASTNAME_LABLE, lastnameField);
        VerticalLayout verticalLayoutSecondname = new VerticalLayout();
        verticalLayoutSecondname.addComponents(SECONDNAME_LABLE, secondnameField);
        VerticalLayout verticalLayoutDOB = new VerticalLayout();
        verticalLayoutDOB.addComponents(DOB_LABLE, dobDateField);
        VerticalLayout verticalLayoutGroup = new VerticalLayout();
        verticalLayoutGroup.addComponents(GROUP_LABLE, groupComboBoxField);
        fieldLayout.addComponents(verticalLayoutFirstname,
                verticalLayoutLastname, verticalLayoutSecondname, verticalLayoutDOB, verticalLayoutGroup);
        HorizontalLayout buttons = new HorizontalLayout();
        buttons.addComponent(createStudentButton());
        buttons.addComponent(addCancelButton((Table) this));
        rootWindowsVerticalLayout.addComponents(fieldLayout, buttons);
        modalWindow = new Window("New Student", rootWindowsVerticalLayout);
        modalWindow.setModal(true);
        modalWindow.setResizable(false);
        modalWindow.setSizeUndefined();
        modalWindow.getContent().setSizeUndefined();
        modalWindow.center();
        ui.addWindow(modalWindow);
    }

    private void openWindowsEditStudent(Button.ClickEvent clickEvent) {
        editStudent = (Student) grid.getSelectedRow();
        if (editStudent == null) {
            Notification.show("Is select student.", Notification.Type.WARNING_MESSAGE);
        } else {
            addGroupField(editStudent);
            addFirstNameField(editStudent);
            addSecondnameField(editStudent);
            addLastnameField(editStudent);
            addDOBField(editStudent);
            VerticalLayout rootWindowsVerticalLayout = new VerticalLayout();
            HorizontalLayout fieldLayout = new HorizontalLayout();
            VerticalLayout verticalLayoutFirstname = new VerticalLayout();
            verticalLayoutFirstname.addComponents(FIRSTNAME_LABLE, firstnameField);
            VerticalLayout verticalLayoutLastname = new VerticalLayout();
            verticalLayoutLastname.addComponents(LASTNAME_LABLE, lastnameField);
            VerticalLayout verticalLayoutSecondname = new VerticalLayout();
            verticalLayoutSecondname.addComponents(SECONDNAME_LABLE, secondnameField);
            VerticalLayout verticalLayoutDOB = new VerticalLayout();
            verticalLayoutDOB.addComponents(DOB_LABLE, dobDateField);
            VerticalLayout verticalLayoutGroup = new VerticalLayout();
            verticalLayoutGroup.addComponents(GROUP_LABLE, groupComboBoxField);
            fieldLayout.addComponents(verticalLayoutFirstname,
                    verticalLayoutLastname, verticalLayoutSecondname, verticalLayoutDOB, verticalLayoutGroup);
            HorizontalLayout buttons = new HorizontalLayout();
            buttons.addComponent(saveStudentButton());
            buttons.addComponent(addCancelButton((Table) this));
            rootWindowsVerticalLayout.addComponents(fieldLayout, buttons);
            modalWindow = new Window("Edit Student", rootWindowsVerticalLayout);
            modalWindow.setModal(true);
            modalWindow.setResizable(false);
            modalWindow.setSizeUndefined();
            modalWindow.getContent().setSizeUndefined();
            modalWindow.center();
            ui.addWindow(modalWindow);
        }
    }
}
