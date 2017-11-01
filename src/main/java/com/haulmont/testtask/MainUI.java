package com.haulmont.testtask;


import com.haulmont.testtask.UI.StudentTable;
import com.haulmont.testtask.UI.GroupTable;
import com.haulmont.testtask.database.HibernateUtil;
import com.vaadin.annotations.Theme;
import com.vaadin.server.Sizeable;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;

@SuppressWarnings("serial")
@Theme("vaadinbutton")
public class MainUI extends UI {
    public static HibernateUtil hibernateUtil = null;
    public static UI ui;
    private TabSheet tabs;

    @Override
    protected void init(VaadinRequest request) {

        hibernateUtil = new HibernateUtil();
        hibernateUtil.createDB();
        hibernateUtil.newTestGroups();
        VerticalLayout layout = new VerticalLayout();
        layout.setSizeFull();
        layout.setMargin(true);

        layout.addComponent(new Label("Main UI"));

        GroupTable groupTable = new GroupTable();
        VerticalLayout groupsTab = groupTable.table();

        StudentTable studentTable = new StudentTable();
        VerticalLayout studentsTab = studentTable.table();

        tabs = new TabSheet();
        tabs.setSizeFull();
        tabs.addTab(groupsTab, "Group");
        tabs.addTab(studentsTab, "Student");
        ui = this;

        this.setContent(tabs);
    }
}