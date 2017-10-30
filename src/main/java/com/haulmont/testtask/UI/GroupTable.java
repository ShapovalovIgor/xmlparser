package com.haulmont.testtask.UI;

import com.haulmont.testtask.DAO.Group;
import com.haulmont.testtask.MainUI;
import com.haulmont.testtask.UI.vaadin.customvalidator.CustomIntegerRangeValidator;
import com.vaadin.data.fieldgroup.FieldGroup;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.data.validator.StringLengthValidator;
import com.vaadin.server.Sizeable;
import com.vaadin.ui.*;

import java.util.Collection;


public class GroupTable {
    private static final Label EDIT_GROUPS_LABLE = new Label("Edit Group");
    private static final Label NUMER_LABLE = new Label("Number: ");
    private static final Label FACULTY_LABLE = new Label("Faculty: ");
    private static final VerticalLayout LAYOUT = new VerticalLayout();

    Grid grid;
    protected static BeanItemContainer<Group> container;
    TextField numberField;
    TextField facultyField;
    Button addItemButton;
    Button removeItemButton;
    CustomIntegerRangeValidator customIntegerRangeValidator;

    public VerticalLayout table() {
        container = new BeanItemContainer<Group>(Group.class, MainUI.hibernateUtil.getGroup());
        grid = new Grid(container);
        grid.setColumnOrder("id", "number", "faculty");
        grid.setEditorEnabled(true);
        grid.getEditorFieldGroup().addCommitHandler(new FieldGroup.CommitHandler() {
            @Override
            public void preCommit(FieldGroup.CommitEvent commitEvent) throws FieldGroup.CommitException {
            }

            @Override
            public void postCommit(FieldGroup.CommitEvent commitEvent) throws FieldGroup.CommitException {
                Group group = (Group) grid.getEditedItemId();
                if (MainUI.hibernateUtil.updateGroup(group)) {
                    Notification.show("Ok save", Notification.Type.TRAY_NOTIFICATION);
                } else {
                    Notification.show("Error save!", Notification.Type.WARNING_MESSAGE);
                }
            }
        });
        grid.getColumn("id").setEditable(false);
        grid.setSelectionMode(Grid.SelectionMode.MULTI);
        addNumberField();
        addFacultyField();
        addItemButton = new Button("Add group");
        addItemButton.setStyleName("friendly");
        addItemButton.addClickListener(this::addItemListener);
        removeItemButton = new Button("Remove");
        removeItemButton.setStyleName("danger");

        removeItemButton.addClickListener(this::removeItemListener);
        grid.setWidth( 100, Sizeable.Unit.PERCENTAGE );
        grid.setHeight( 100, Sizeable.Unit.PERCENTAGE );
        LAYOUT.addComponents(EDIT_GROUPS_LABLE, grid, sortComponetsLayout());
        return LAYOUT;
    }

    private HorizontalLayout sortComponetsLayout() {
        HorizontalLayout horizontalLayout = new HorizontalLayout();
        VerticalLayout verticalLayoutNumber = new VerticalLayout();
        verticalLayoutNumber.addComponents(NUMER_LABLE, numberField);

        VerticalLayout verticalLayoutFaculty = new VerticalLayout();
        verticalLayoutFaculty.addComponents(FACULTY_LABLE, facultyField);

        VerticalLayout verticalLayoutButton = new VerticalLayout();
        verticalLayoutButton.addComponents(addItemButton, removeItemButton);
        horizontalLayout.addComponents(verticalLayoutNumber, verticalLayoutFaculty, verticalLayoutButton);
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
    }

    private void removeItemListener(Button.ClickEvent clickEvent) {
        Collection<Object> selectedRows = grid.getSelectedRows();
        selectedRows.remove(null);
        for (Object item : selectedRows) {
            if(MainUI.hibernateUtil.removeGroup((Group) item)){
                grid.getContainerDataSource().removeItem(item);
                Notification.show("Ok, remove group", Notification.Type.TRAY_NOTIFICATION);
            }else {
                Notification.show("Group have student! Is not remove Group.", Notification.Type.WARNING_MESSAGE);
            }

        }
    }

}
