package com.haulmont.testtask.UI.vaadin.customfield;

import com.vaadin.ui.ComboBox;
import com.vaadin.ui.DateField;

public class CustomDateField extends DateField implements Cloneable {
    public CustomDateField(String s) {
        super();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
