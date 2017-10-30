package com.haulmont.testtask.UI.vaadin.customfield;

import com.vaadin.data.util.converter.Converter;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.DateField;
import com.vaadin.ui.PopupDateField;

import java.util.Date;
import java.util.GregorianCalendar;

public class CustomPopupDateField extends PopupDateField implements Cloneable {

    public CustomPopupDateField() {
        super();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
