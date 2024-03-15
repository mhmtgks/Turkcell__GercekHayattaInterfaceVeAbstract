package com.turkcell.Entity;

import com.turkcell.Abstract.IEntity;

import java.util.Date;

public class Customer implements IEntity {
    private int Id;
    private String FırstName;
    private String LastName;
    private Date DateOfBirth;
    private String NationalityId;


    public Customer(int id, String fırstName, String lastName, Date dateOfBirth, String nationalityId) {
        Id = id;
        FırstName = fırstName;
        LastName = lastName;
        DateOfBirth = dateOfBirth;
        NationalityId = nationalityId;
    }
    public Customer() {

    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getFırstName() {
        return FırstName;
    }

    public void setFırstName(String fırstName) {
        FırstName = fırstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public Date getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public String getNationalityId() {
        return NationalityId;
    }

    public void setNationalityId(String nationalityId) {
        NationalityId = nationalityId;
    }



}
