package com.haulmont.testtask.UI;

import com.vaadin.ui.*;


public class UIHelper {

    public UIHelper() {
    }

    public Button addCancelButton(Window closeWindows) {
        Button cancel = new Button("Cancel");
        cancel.setStyleName("danger");
        cancel.addClickListener(e -> {
            closeWindows.close();
        });
        return cancel;
    }
}
