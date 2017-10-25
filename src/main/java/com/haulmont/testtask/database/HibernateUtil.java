package com.haulmont.testtask.database;

import java.io.FileInputStream;
import java.io.InputStream;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.haulmont.testtask.Constant;
import com.haulmont.testtask.DAO.Group;
import com.haulmont.testtask.DAO.Student;
import com.vaadin.server.VaadinService;
import org.hibernate.*;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import javax.persistence.criteria.CriteriaQuery;
import javax.transaction.Transactional;

public class HibernateUtil {
    public HibernateUtil() {
    }

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

    public List<Group> getGroup() {
        SessionFactory sessFact = HibernateUtil.getSessionFactory();
        Session session = sessFact.getCurrentSession();
        org.hibernate.Transaction tr = session.beginTransaction();

        CriteriaQuery cq = session.getCriteriaBuilder().createQuery(Group.class);
        cq.from(Group.class);
        List groupList = session.createQuery(cq).getResultList();

        tr.commit();
        session.close();
        return groupList;
    }

    public List<Student> getStudent() {
        SessionFactory sessFact = HibernateUtil.getSessionFactory();
        Session session = sessFact.getCurrentSession();
        org.hibernate.Transaction tr = session.beginTransaction();

        CriteriaQuery cq = session.getCriteriaBuilder().createQuery(Student.class);
        cq.from(Student.class);
        List studentList = session.createQuery(cq).getResultList();

        tr.commit();
        session.close();
        return studentList;
    }

    public boolean updateGroup(Group group) {
        Session session = sessionFactory.getCurrentSession();
        Transaction tr = session.beginTransaction();
        session.update(group);
        tr.commit();
        session.close();
        return true;
    }

    public boolean updateStudent(Student student) {
        Session session = sessionFactory.getCurrentSession();
        Transaction tr = session.beginTransaction();
        session.update(student);
        tr.commit();
        session.close();
        return true;
    }

    public void newTestGroups() {
        Session session = sessionFactory.getCurrentSession();
        Transaction tr = session.beginTransaction();
        Group group = new Group();
        group.setId(14788);
        group.setNumber(000000);
        group.setFaculty("Delhi - India");
        session.save(group);
        tr.commit();
        session.close();
    }


    public Group addGroup(int number, String faculty) {
        Session session = sessionFactory.getCurrentSession();
        Transaction tr = session.beginTransaction();
        Group group = new Group(number, faculty);
        session.save(group);
        tr.commit();
        session.close();
        return group;
    }

    public Student addStudent(String firstname, String lastname, String secondname, Date dob, int group) {
        Session session = sessionFactory.getCurrentSession();
        Transaction tr = session.beginTransaction();
        Student student = new Student(firstname, lastname, secondname, dob, group);
        session.save(student);
        tr.commit();
        session.close();
        return student;
    }

    public void removeGroup(Group group) {
        Session session = sessionFactory.getCurrentSession();
        Transaction tr = session.beginTransaction();
        session.delete(group);
        tr.commit();
        session.close();
    }


    public void removeStudent(Student student) {
        Session session = sessionFactory.getCurrentSession();
        Transaction tr = session.beginTransaction();
        session.delete(student);
        tr.commit();
        session.close();
    }

    public boolean createDB() {
        try {
            executeSQLCommand("drop table student;");
            executeSQLCommand("drop table student_group;");

            executeSQLCommandInFile(Constant.CREATE_TABLE_SCRIPT);
            executeSQLCommandInFile(Constant.DATA_SCRIPT);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}