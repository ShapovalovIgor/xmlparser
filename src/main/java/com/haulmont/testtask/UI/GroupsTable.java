package com.haulmont.testtask.UI;

import com.haulmont.testtask.DAO.EditObject;
import com.haulmont.testtask.DAO.Groups;
import com.vaadin.server.Sizeable;
import com.vaadin.server.VaadinRequest;

import com.vaadin.ui.Grid;
import com.vaadin.ui.Slider;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.renderers.NumberRenderer;
import com.vaadin.ui.renderers.ProgressBarRenderer;
import com.vaadin.ui.renderers.TextRenderer;
import elemental.json.JsonValue;

import java.util.List;

public class GroupsTable{


    public Grid<Groups> table(List<Groups> groupsList) {
        Grid<Groups> grid = new Grid<>();
        grid.setItems(groupsList);
        grid.setCaption("Groups");
        grid.setSizeFull();
        grid.setSelectionMode(Grid.SelectionMode.NONE);

        TextField textEditor = new TextField();

        grid.addColumn(Groups::getId, new NumberRenderer())
                .setCaption("ID")
                .setExpandRatio(0);

        grid.addColumn(Groups::getNumber, new NumberRenderer())
//                .setEditorComponent(nameEditor, Groups::setNumber)
                .setCaption("Number")
                .setExpandRatio(2);

        grid.addColumn(Groups::getFaculty, new TextRenderer())
                .setEditorComponent(textEditor, Groups::setFaculty)
                .setCaption("Faculty")
                .setExpandRatio(2);

        grid.getEditor().setEnabled(true);

        return grid;
    }
}
