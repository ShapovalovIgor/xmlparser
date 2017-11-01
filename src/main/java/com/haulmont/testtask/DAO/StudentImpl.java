package com.haulmont.testtask.DAO;

import java.util.Date;

public interface StudentImpl {
    public long getId();

    public String getFirstname();

    public void setFirstname(String firstname);

    public String getLastname();

    public void setLastname(String lastname);

    public String getSecondname();

    public void setSecondname(String secondname);

    public Date getDob();

    public void setDob(Date dob);


    public Group getGroup();

    public void setGroup(Group group);
}
