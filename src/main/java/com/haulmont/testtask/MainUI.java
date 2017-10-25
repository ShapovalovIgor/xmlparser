package com.haulmont.testtask;


import com.haulmont.testtask.UI.StudentTable;
import com.haulmont.testtask.UI.GroupTable;
import com.haulmont.testtask.database.HibernateUtil;
import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;

@SuppressWarnings("serial")
@Theme(ValoTheme.THEME_NAME)
public class MainUI extends UI {
    public static HibernateUtil hibernateUtil = null;

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
        HorizontalLayout horizontalLayout = new HorizontalLayout();
        horizontalLayout.addComponents(groupsTab, studentsTab);
        layout.addComponent(horizontalLayout);
        setContent(horizontalLayout);
    }
}