package com.haulmont.testtask.database;

import java.io.FileInputStream;
import java.io.InputStream;

import java.util.List;
import java.util.Scanner;

import com.haulmont.testtask.DAO.Groups;
import com.vaadin.server.VaadinService;
import javafx.print.Collation;
import org.hibernate.*;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import javax.transaction.Transactional;

public class HibernateUtil {

    private static final SessionFactory sessionFactory;


    static {
        try {
            StandardServiceRegistry standardRegistry =
                    new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
            Metadata metaData =
                    new MetadataSources(standardRegistry).getMetadataBuilder().build();
            sessionFactory = metaData.getSessionFactoryBuilder().build();
        } catch (Throwable th) {

            System.err.println("Enitial SessionFactory creation failed" + th);
            throw new ExceptionInInitializerError(th);

        }
    }

    public static SessionFactory getSessionFactory() {

        return sessionFactory;

    }

    @Transactional
    public void executeSQLCommand(String sql) throws Exception {
        Session session = sessionFactory.openSession();
        org.hibernate.Transaction tr = session.beginTransaction();
        SQLQuery sqlQuery = session.createSQLQuery(sql);
        sqlQuery.executeUpdate();
        tr.commit();
        session.close();
    }

    @Transactional
    public void executeSQLCommandInFile(String pathFile) throws Exception {
        InputStream in = new FileInputStream(findQuery(pathFile));
        Scanner s = new Scanner(in);
        s.useDelimiter("(;(\r)?\n)|(--\n)");

        while (s.hasNext()) {
            String line = s.next();
            if (line.startsWith("/*!") && line.endsWith("*/")) {
                int i = line.indexOf(' ');
                line = line.substring(i + 1, line.length() - " */".length());
            }

            if (line.trim().length() > 0) {
                executeSQLCommand(line);
            }
        }
    }

    public String findQuery(String filePatch) {
        String queryFolder = "\\WEB-INF\\classes\\";
        String applicationFolder = VaadinService.getCurrent().getBaseDirectory().getAbsolutePath();
        return applicationFolder + queryFolder + filePatch;
    }

    public List<Groups> getGroups() {
        SessionFactory sessFact = HibernateUtil.getSessionFactory();
        Session session = sessFact.getCurrentSession();
        org.hibernate.Transaction tr = session.beginTransaction();

        CriteriaQuery cq = session.getCriteriaBuilder().createQuery(Groups.class);
        cq.from(Groups.class);
        List groupList = session.createQuery(cq).getResultList();

        tr.commit();
        System.out.println("Data printed");
        session.close();
        return groupList;
    }

    public boolean updateGroup(Groups groups){
        Session session = sessionFactory.getCurrentSession();
        Transaction tr = session.beginTransaction();
        session.update(groups);
        tr.commit();
        session.close();
        return true;
    }

    public void newTestGroups() {
        Session session = sessionFactory.getCurrentSession();
        Transaction tr = session.beginTransaction();
        Groups group = new Groups();
        group.setId(14788);
        group.setNumber(000000);
        group.setFaculty("Delhi - India");
        session.save(group);
        tr.commit();
        session.close();
    }


    public Groups addGroup(int number, String faculty) {
        Session session = sessionFactory.getCurrentSession();
        Transaction tr = session.beginTransaction();
        Groups group = new Groups();
        group.setNumber(number);
        group.setFaculty(faculty);
        session.save(group);
        tr.commit();
        session.close();
        return  group;
    }

    public void removeGroup(Groups group) {
        Session session = sessionFactory.getCurrentSession();
        Transaction tr = session.beginTransaction();
        session.delete(group);
        tr.commit();
        session.close();
    }
}