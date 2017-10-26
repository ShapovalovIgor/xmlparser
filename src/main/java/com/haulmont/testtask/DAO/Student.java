package com.haulmont.testtask.DAO;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private int id;
    @Column(name = "firstname", nullable = true)
    private String firstname;
    @Column(name = "lastname", nullable = true)
    private String lastname;
    @Column(name = "secondname", nullable = true)
    private String secondname;
    @Column(name = "dob", nullable = true)
    private Date dob;
    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;

    public Student(String firstname, String lastname, String secondname, Date dob, Group group) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.secondname = secondname;
        this.dob = dob;
        this.group = group;
    }

    public Student() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }


    public Group getGroup() {
        return this.group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

}

