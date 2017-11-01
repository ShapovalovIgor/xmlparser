package com.haulmont.testtask.DAO;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.Collection;

@Entity(name = "student_group")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private long id;
    @Column(name = "number", nullable = true)
    private int number;
    @Column(name = "faculty", nullable = true)
    private String faculty;
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Cascade(org.hibernate.annotations.CascadeType.PERSIST)
    @OneToMany(mappedBy = "group", fetch = FetchType.EAGER)
    private Collection<Student> students;

    public Group(int number, String faculty) {
        this.number = number;
        this.faculty = faculty;
    }

    public Group() {
    }

    public long getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public Collection<Student> getStudents() {
        return students;
    }
}