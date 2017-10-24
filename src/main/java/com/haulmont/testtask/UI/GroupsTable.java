package com.haulmont.testtask.UI;

import com.haulmont.testtask.DAO.Groups;
import com.haulmont.testtask.MainUI;
import com.haulmont.testtask.UI.vaadin.customvalidator.CustomIntegerRangeValidator;
import com.vaadin.data.fieldgroup.FieldGroup;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.data.validator.StringLengthValidator;
import com.vaadin.ui.*;
import javafx.print.Collation;

import java.util.Collection;


public class GroupsTable {
    private static final Label EDIT_GROUPS_LABLE = new Label("Edit Groups");
    private static final Label NUMER_LABLE = new Label("Number:");
    private static final Label FACULTY_LABLE = new Label("Faculty:");
    private static final VerticalLayout LAYOUT = new VerticalLayout();

    Grid grid;
    BeanItemContainer<Groups> container;
    TextField numberField;
    TextField facultyField;
    Button addItemButton;
    Button removeItemButton;
    CustomIntegerRangeValidator customIntegerRangeValidator;

    public VerticalLayout table() {
        container = new BeanItemContainer<>(Groups.class, MainUI.hibernateUtil.getGroups());
        grid = new Grid(container);
        grid.setColumnOrder("id", "number", "faculty");
        grid.setEditorEnabled(true);
        grid.getEditorFieldGroup().addCommitHandler(new FieldGroup.CommitHandler() {
            @Override
            public void preCommit(FieldGroup.CommitEvent commitEvent) throws FieldGroup.CommitException {
            }

            @Override
            public void postCommit(FieldGroup.CommitEvent commitEvent) throws FieldGroup.CommitException {
                Groups group = (Groups) grid.getEditedItemId();
                if (MainUI.hibernateUtil.updateGroup(group)) {
                    Notification.show("ok save");
                } else {
                    Notification.show("error save");
                }
            }
        });
        grid.getColumn("id").setEditable(false);
        grid.setSelectionMode(Grid.SelectionMode.MULTI);
        numberField = new TextField();
        numberField.setNullRepresentation("0");
        customIntegerRangeValidator = new CustomIntegerRangeValidator("Value must be a integer between 1 and 999999999", 1, 999999999);
        numberField.addValidator(customIntegerRangeValidator);
        numberField.setValidationVisible(false);
        facultyField = new TextField();
        facultyField.setNullSettingAllowed(true);
        facultyField.addValidator(new StringLengthValidator("The faculty must have 2 - 200", 2, 200, true));
        facultyField.setValidationVisible(false);
        addItemButton = new Button("Add group");
        addItemButton.addClickListener(this::addItemListener);
        setRemoveItemButton();
        LAYOUT.addComponents(EDIT_GROUPS_LABLE, grid, NUMER_LABLE, numberField, FACULTY_LABLE, facultyField, addItemButton, removeItemButton);
        return LAYOUT;
    }

    private void addItemListener(Button.ClickEvent clickEvent) {
        String numberString = numberField.getValue();
        if (!customIntegerRangeValidator.isValid(numberString)) {
            Notification.show("Error integer format!", Notification.Type.WARNING_MESSAGE);
        } else {
            String facultyString = facultyField.getValue();
            Groups group = MainUI.hibernateUtil.addGroup(Integer.parseInt(numberString), facultyString);
            numberField.clear();
            facultyField.clear();
            grid.getContainerDataSource().addItem(group);
        }
    }

    private void setRemoveItemButton() {
        removeItemButton = new Button("Remove");
        removeItemButton.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent event) {
                Collection<Object> selectedRows = grid.getSelectedRows();
                selectedRows.remove(null);
                for (Object item : selectedRows) {
                    grid.getContainerDataSource().removeItem(item);
                    MainUI.hibernateUtil.removeGroup((Groups) item);
                }
            }
        });
    }

}
