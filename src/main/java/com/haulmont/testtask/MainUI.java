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
    @Override
    protected void init(VaadinRequest request) {
        hibernateUtil = new HibernateUtil();
        hibernateUtil.createDB();
        hibernateUtil.newTestGroups();
        VerticalLayout layout = new VerticalLayout();
        layout.setSizeFull();
        layout.setMargin(true);

        layout.addComponent(new Label("Main UI"));

        GroupTable GroupTable = new GroupTable();
        VerticalLayout groupsTab = GroupTable.table();

        StudentTable studentTable = new StudentTable();
        VerticalLayout studentsTab = studentTable.table();
//        HorizontalLayout horizontalLayout = new HorizontalLayout();
//        horizontalLayout.addComponents(groupsTab, studentsTab);
//        layout.addComponent(horizontalLayout);
//        setContent(horizontalLayout);


        // Display content on screen.

        // If for simplicity you want to remove the TabSheet from the situation, swap this next line for all remaining code below.
        // this.setContent( layoutQuadrant ); // Copy-paste either Layout variable to try each version.

        TabSheet tabs = new TabSheet();
        tabs.setSizeFull(); // Make the TabSheet fill all available space. By default the height is fixed.
        tabs.addTab( groupsTab, "Group" );
        tabs.addTab( studentsTab, "Student" );
        ui = this;
        this.setContent( tabs );
    }
}