package com.haulmont.testtask;


import com.haulmont.testtask.DAO.Groups;
import com.haulmont.testtask.UI.GroupsTable;
import com.haulmont.testtask.database.HibernateUtil;
import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;
import org.hibernate.Session;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@SuppressWarnings("serial")
@Theme(ValoTheme.THEME_NAME)
public class MainUI extends UI {

    @Override
    protected void init(VaadinRequest request) {
        HibernateUtil hibernateUtil = null;
        try {
            hibernateUtil = new HibernateUtil();


            hibernateUtil.executeSQLCommand("drop table students;");
            hibernateUtil.executeSQLCommand("drop table groups;");

            hibernateUtil.executeSQLCommandInFile(Constant.CREATE_TABLE_SCRIPT);
            hibernateUtil.executeSQLCommandInFile(Constant.DATA_SCRIPT);
          

        } catch (Exception e) {
            e.printStackTrace();
        }
        VerticalLayout layout = new VerticalLayout();
        layout.setSizeFull();
        layout.setMargin(true);

        layout.addComponent(new Label("Main UI"));


        hibernateUtil.newTestGroups();


        List list = Collections.singletonList(hibernateUtil.getGroups().get(0).getFaculty() + hibernateUtil.getGroups().get(0).getId()+
                hibernateUtil.getGroups().get(1).getFaculty() + hibernateUtil.getGroups().get(1).getId());

        ComboBox select = new ComboBox("", list);
        GroupsTable groupsTable = new GroupsTable();
layout.addComponent(groupsTable.table(hibernateUtil.getGroups()));
//        layout.addComponent(select);
        setContent(layout);
    }
}