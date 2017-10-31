package com.haulmont.testtask.UI;

import com.haulmont.testtask.DAO.Group;
import com.haulmont.testtask.UI.vaadin.customfilter.CustomSimpleStringFilter;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.data.util.filter.SimpleStringFilter;
import com.vaadin.ui.*;


public class UIHelper {

    public UIHelper() {
    }

    public Button addCancelButton(Table table) {
        Button cancel = new Button("Cancel");
        cancel.setStyleName("danger");
        cancel.addClickListener(e -> {
            table.getModalWindow().close();
        });
        return cancel;
    }

    public boolean isInteger(String s) {
        return isInteger(s, 10);
    }

    public boolean isInteger(String s, int radix) {
        if (s.isEmpty()) return false;
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 && s.charAt(i) == '-') {
                if (s.length() == 1) return false;
                else continue;
            }
            if (Character.digit(s.charAt(i), radix) < 0) return false;
        }
        return true;
    }

    public void addFilterColumnValue(Grid grid, BeanItemContainer container) {
        Grid.HeaderRow filterRow = grid.appendHeaderRow();
        // Set up a filter for all columns
        for (Object pid : grid.getContainerDataSource()
                .getContainerPropertyIds()) {
            Grid.HeaderCell cell = filterRow.getCell(pid);
            // Have an input field to use for filter
            TextField filterField = new TextField();
            filterField.setColumns(8);

            // Update filter When the filter input is changed
            Object finalPid = pid;
            filterField.addTextChangeListener(change -> {
                // Can't modify filters so need to replace
                container.removeContainerFilters(finalPid);

                // (Re)create the filter if necessary
                if (!change.getText().isEmpty())
                    container.addContainerFilter(
                            new CustomSimpleStringFilter(finalPid,
                                    change.getText(), true, false));
            });
            cell.setComponent(filterField);
        }
    }
}
