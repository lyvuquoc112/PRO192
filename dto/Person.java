/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.util.Date;

/**
 *
 * @author hanly
 */
public class Person {
    private String id;
    private String firstName;
    private String sureName;
    private Date birthday;
    private boolean gender;
    private String phone;

    public Person() {
    }

    public Person(String id, String firstName, String sureName, Date birthday, boolean gender, String phone) {
        this.id = id;
        this.firstName = firstName;
        this.sureName = sureName;
        this.birthday = birthday;
        this.gender = gender;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    @Override
    public String toString(){
        return String.format("%6s|%10s|%10s|%8s|%6s|%10s" 
                ,this.id,this.firstName,this.sureName,this.birthday,
                (this.gender == true?"Male":"Female"),this.phone);
    }
    
}
