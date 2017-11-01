package com.haulmont.testtask.database;

import java.io.FileInputStream;
import java.io.InputStream;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.haulmont.testtask.Constant;
import com.haulmont.testtask.DAO.Group;
import com.haulmont.testtask.DAO.Student;
import com.vaadin.server.VaadinService;
import com.vaadin.ui.Notification;
import org.hibernate.*;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.BootstrapServiceRegistry;
import org.hibernate.boot.registry.BootstrapServiceRegistryBuilder;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.exception.ConstraintViolationException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import javax.transaction.Transactional;

public class HibernateUtil {
    public HibernateUtil() {
    }

    private static final String PERSISTENT_UNIT_NAME = "item-manager-pu";

    private static final EntityManagerFactory emf;

    static {
        try {
            emf = Persistence.createEntityManagerFactory(PERSISTENT_UNIT_NAME);
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static EntityManager getEm() {
        return emf.createEntityManager();
    }


    @Transactional
    public void executeSQLCommand(String sql) throws Exception {
        EntityManager em = getEm();
        em.getTransaction().begin();
        em.createNativeQuery(sql).executeUpdate();
        em.getTransaction().commit();
        em.close();
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
        EntityManager em = getEm();
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery(Group.class);
        cq.from(Group.class);
        List groupList = em.createQuery(cq).getResultList();
        em.close();
        return groupList;
    }


    public List<Student> getStudent() {
        EntityManager em = getEm();
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery(Student.class);
        cq.from(Student.class);
        List studentList = em.createQuery(cq).getResultList();
        em.close();
        return studentList;
    }

    public boolean updateGroup(Group group) {
        EntityManager em = getEm();
        em.getTransaction().begin();
        em.merge(group);
        em.getTransaction().commit();
        em.close();
        return true;
    }

    public boolean updateStudent(Student student) {
        EntityManager em = getEm();
        em.getTransaction().begin();
        em.merge(student);
        em.getTransaction().commit();
        em.close();
        return true;
    }

    public Student updateStudent(Student student, String firstname, String lastname, String secondname, Date dob, Group group) {
        EntityManager em = getEm();
        em.getTransaction().begin();
        student.setFirstname(firstname);
        student.setLastname(lastname);
        student.setSecondname(secondname);
        student.setDob(dob);
        student.setGroup(group);
        em.merge(student);
        em.getTransaction().commit();
        em.close();
        return student;
    }

    public Group updateGroup(Group group, Integer number, String faculty) {
        EntityManager em = getEm();
        em.getTransaction().begin();
        group.setNumber(number);
        group.setFaculty(faculty);
        em.merge(group);
        em.getTransaction().commit();
        em.close();
        return group;
    }

    public void newTestGroups() {
        EntityManager em = getEm();
        Group group = new Group();
        group.setNumber(000000);
        group.setFaculty("Delhi - India");
        em.getTransaction().begin();
        em.persist(group);
        em.getTransaction().commit();
        em.close();
    }


    public Group addGroup(int number, String faculty) {
        EntityManager em = getEm();
        Group group = new Group(number, faculty);
        em.getTransaction().begin();
        em.persist(group);
        em.getTransaction().commit();
        em.close();
        return group;
    }

    public Student addStudent(String firstname, String lastname, String secondname, Date dob, Group group) {
        EntityManager em = getEm();
        em.getTransaction().begin();
        Student student = new Student(firstname, lastname, secondname, dob, group);
        em.persist(student);
        em.getTransaction().commit();
        em.close();
        return student;
    }

    public boolean removeGroup(Group group) {
        EntityManager em = getEm();
        List<Student> student = em.createQuery("SELECT n FROM student n WHERE n.group = ?1", Student.class)
                .setParameter(1, group).getResultList();
        Notification.show(student.toString() + student.size(), Notification.Type.TRAY_NOTIFICATION);

        if (student.isEmpty()) {
            em.getTransaction().begin();
            String deleteGroup = "delete from student_group where id = :id";
            Query query = em.createQuery(deleteGroup);
            query.setParameter("id", group.getId());
            query.executeUpdate();
            em.remove(em.contains(group) ? group : em.merge(group));
            em.close();
            return true;
        } else {
            em.close();
            return false;
        }

    }


    public void removeStudent(Student student) {
        EntityManager em = getEm();
        em.getTransaction().begin();
        em.remove(em.contains(student) ? student : em.merge(student));
        em.getTransaction().commit();
        em.close();
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