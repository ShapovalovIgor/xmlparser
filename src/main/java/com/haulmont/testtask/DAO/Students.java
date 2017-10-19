package com.haulmont.testtask.DAO;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "students")
public class Students {
    @Id
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
    @Column(name = "group_id", nullable = true)
    private int groupID;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int id) {
        this.groupID = groupID;
    }

}

