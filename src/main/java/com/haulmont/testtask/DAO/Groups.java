package com.haulmont.testtask.DAO;

import javax.persistence.*;
@Entity
@Table(name = "groups")
public class Groups implements EditObject{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "number", nullable = true)
    private int number;
    @Column(name = "faculty", nullable = true)
    private String faculty;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}