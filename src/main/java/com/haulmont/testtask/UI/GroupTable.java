package com.haulmont.testtask.UI;

import com.haulmont.testtask.DAO.Group;
import com.haulmont.testtask.DAO.GroupImpl;
import com.haulmont.testtask.DAO.Student;
import com.haulmont.testtask.MainUI;
import com.haulmont.testtask.UI.vaadin.customvalidator.CustomIntegerRangeValidator;
import com.vaadin.data.fieldgroup.FieldGroup;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.data.validator.StringLengthValidator;
import com.vaadin.server.Sizeable;
import com.vaadin.ui.*;

import java.util.Collection;
import java.util.Date;

import static com.haulmont.testtask.MainUI.ui;


public class GroupTable extends UIHelper {
    private static final Label EDIT_GROUPS_LABLE = new Label("Edit Group");
    private static final Label NUMER_LABLE = new Label("Number: ");
    private static final Label FACULTY_LABLE = new Label("Faculty: ");
    private static final VerticalLayout LAYOUT = new VerticalLayout();

    private Grid grid;
    protected static BeanItemContainer<GroupImpl> container;
    private TextField numberField;
    private TextField facultyField;
    private Button createGroupButton;
    private Button addItemButton;
    private Button editItemButton;
    private Button removeItemButton;
    private CustomIntegerRangeValidator customIntegerRangeValidator;
    private Window modalWindow;
    private Group editGroup;

    public VerticalLayout table() {
        container = new BeanItemContainer<>(GroupImpl.class, MainUI.hibernateUtil.getGroup());
        grid = new Grid(container);
        grid.setColumnOrder("id", "number", "faculty");
        grid.setEditorEnabled(false);
        removeItemButton = new Button("Remove");
        removeItemButton.setStyleName("danger");
        removeItemButton.addClickListener(this::removeItemListener);
        editItemButton();
        grid.setWidth(100, Sizeable.Unit.PERCENTAGE);
        grid.setHeight(100, Sizeable.Unit.PERCENTAGE);
        LAYOUT.addComponents(EDIT_GROUPS_LABLE, grid, sortComponetsLayout());
        return LAYOUT;
    }

    private void editItemButton() {
        editItemButton = new Button("Edit group");
        editItemButton.addClickListener(this::openWindowsEditGroup);
        editItemButton.setStyleName("primary");
    }

    private Button saveStudentButton() {
        addItemButton = new Button("Save");
        addItemButton.setStyleName("friendly");
        addItemButton.addClickListener(this::saveItemListener);
        return addItemButton;
    }

    private Button addItemButton() {
        addItemButton = new Button("Add group");
        addItemButton.setStyleName("friendly");
        addItemButton.addClickListener(this::addItemListener);
        return addItemButton;
    }

    private void addAddItemButton() {
        createGroupButton = new Button("Add group");
        createGroupButton.addClickListener(this::openWindowsCreateGroup);
        createGroupButton.setStyleName("friendly");

    }

    private HorizontalLayout sortComponetsLayout() {
        HorizontalLayout horizontalLayout = new HorizontalLayout();
        horizontalLayout.addComponents(createGroupButton, editItemButton, removeItemButton);
        return horizontalLayout;
    }

    private void addNumberField() {
        numberField = new TextField();
        numberField.setNullRepresentation("0");
        customIntegerRangeValidator = new CustomIntegerRangeValidator("Value must be a integer between 1 and 999999999", 1, 999999999);
        numberField.addValidator(customIntegerRangeValidator);
        numberField.setValidationVisible(false);
    }

    private void addFacultyField() {
        facultyField = new TextField();
        facultyField.setNullSettingAllowed(true);
        facultyField.addValidator(new StringLengthValidator("The faculty must have 2 - 200", 2, 200, true));
        facultyField.setValidationVisible(false);
    }

    private void addItemListener(Button.ClickEvent clickEvent) {
        String numberString = numberField.getValue();
        if (!customIntegerRangeValidator.isValid(numberString)) {
            Notification.show("Error integer format!", Notification.Type.WARNING_MESSAGE);
        } else {
            String facultyString = facultyField.getValue();
            Group group = MainUI.hibernateUtil.addGroup(Integer.parseInt(numberString), facultyString);
            numberField.clear();
            facultyField.clear();
            grid.getContainerDataSource().addItem(group);
        }
        modalWindow.close();
    }

    private void saveItemListener(Button.ClickEvent clickEvent) {
        String numberString = numberField.getValue();
        String facultyString = facultyField.getValue();

        Group group = MainUI.hibernateUtil.updateGroup(editGroup, Integer.valueOf(numberString), facultyString);
        numberField.clear();
        facultyField.clear();
        grid.getContainerDataSource().addItem(group);
        grid.clearSortOrder();
        modalWindow.close();
    }

    private void removeItemListener(Button.ClickEvent clickEvent) {
        Collection<Object> selectedRows = grid.getSelectedRows();
        selectedRows.remove(null);
        for (Object item : selectedRows) {
            if (MainUI.hibernateUtil.removeGroup((Group) item)) {
                grid.getContainerDataSource().removeItem(item);
                Notification.show("Ok, remove group", Notification.Type.TRAY_NOTIFICATION);
            } else {
                Notification.show("Group have student! Is not remove Group.", Notification.Type.WARNING_MESSAGE);
            }

        }
    }

    private void openWindowsCreateGroup(Button.ClickEvent clickEvent) {
        addNumberField();
        addFacultyField();
        VerticalLayout rootWindowsVerticalLayout = new VerticalLayout();
        HorizontalLayout fieldLayout = new HorizontalLayout();
        VerticalLayout verticalLayoutNumber = new VerticalLayout();
        verticalLayoutNumber.addComponents(NUMER_LABLE, numberField);
        VerticalLayout verticalLayoutFaculty = new VerticalLayout();
        verticalLayoutFaculty.addComponents(FACULTY_LABLE, facultyField);
        fieldLayout.addComponents(verticalLayoutNumber, verticalLayoutFaculty);
        HorizontalLayout buttons = new HorizontalLayout();

        buttons.addComponent(addItemButton());
        buttons.addComponent(addCancelButton(modalWindow));
        rootWindowsVerticalLayout.addComponents(fieldLayout, buttons);
        modalWindow = new Window("New Group", rootWindowsVerticalLayout);
        modalWindow.setModal(true);
        modalWindow.setResizable(false);
        modalWindow.setSizeUndefined();
        modalWindow.getContent().setSizeUndefined();
        modalWindow.center();
        ui.addWindow(modalWindow);
    }


    private void openWindowsEditGroup(Button.ClickEvent clickEvent) {
        editGroup = (Group) grid.getSelectedRow();
        if (editGroup == null) {
            Notification.show("Is select student.", Notification.Type.WARNING_MESSAGE);
        } else {
            addNumberField();
            addFacultyField();
            addAddItemButton();
            VerticalLayout rootWindowsVerticalLayout = new VerticalLayout();
            HorizontalLayout fieldLayout = new HorizontalLayout();
            VerticalLayout verticalLayoutFirstname = new VerticalLayout();
            verticalLayoutFirstname.addComponents(NUMER_LABLE, numberField);
            VerticalLayout verticalLayoutLastname = new VerticalLayout();
            verticalLayoutLastname.addComponents(FACULTY_LABLE, facultyField);
            fieldLayout.addComponents(verticalLayoutFirstname, verticalLayoutLastname);
            HorizontalLayout buttons = new HorizontalLayout();
            buttons.addComponent(saveStudentButton());
            buttons.addComponent(addCancelButton(modalWindow));
            rootWindowsVerticalLayout.addComponents(fieldLayout, buttons);
            modalWindow = new Window("Edit Group", rootWindowsVerticalLayout);
            modalWindow.setModal(true);
            modalWindow.setResizable(false);
            modalWindow.setSizeUndefined();
            modalWindow.getContent().setSizeUndefined();
            modalWindow.center();
            ui.addWindow(modalWindow);
        }
    }
}
