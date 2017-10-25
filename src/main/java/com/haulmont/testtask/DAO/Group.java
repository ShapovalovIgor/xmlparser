package com.haulmont.testtask.DAO;

import javax.persistence.*;

@Entity(name = "student_group")
public class Group implements EditObject {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
//    @OneToMany(mappedBy = "student_group", cascade = CascadeType.ALL, orphanRemoval = true)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "number", nullable = true)
    private int number;
    @Column(name = "faculty", nullable = true)
    private String faculty;

    public Group(int number, String faculty) {
        this.number = number;
        this.faculty = faculty;
    }

    public Group() {
    }

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