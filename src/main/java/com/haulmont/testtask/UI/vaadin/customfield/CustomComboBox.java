package com.haulmont.testtask.UI.vaadin.customfield;

import com.vaadin.ui.ComboBox;

public class CustomComboBox extends ComboBox implements Cloneable {
    public CustomComboBox(String s) {
        super();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
