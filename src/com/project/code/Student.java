/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.code;

/**
 *
 * @author USER
 */
public class Student {
    private String id;
    private String name;
    private String fathername;
    private String mothername;
    private String address;
    private  String blood;
    private String phone;
    private String email;
    private String schoolname;
    private String collegename;

     public Student(String id, String name, String fathername, String mothername, String address, String blood, String phone, String email, String schoolname, String collegename) {
        this.id = id;
        this.name = name;
        this.fathername = fathername;
        this.mothername = mothername;
        this.address = address;
        this.blood = blood;
        this.phone = phone;
        this.email = email;
        this.schoolname = schoolname;
        this.collegename = collegename;
    }

    Student() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFathername() {
        return fathername;
    }

    public String getMothername() {
        return mothername;
    }

    public String getAddress() {
        return address;
    }

    public String getBlood() {
        return blood;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFathername(String fathername) {
        this.fathername = fathername;
    }

    public void setMothername(String mothername) {
        this.mothername = mothername;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

    public void setCollegename(String collegename) {
        this.collegename = collegename;
    }

    public String getCollegename() {
        return collegename;
    }

}