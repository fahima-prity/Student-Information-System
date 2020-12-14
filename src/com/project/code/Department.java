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
public class Department {
    private String dept_Name;
    private String faculty;

    public Department(String dept_Name, String faculty) {
        this.dept_Name = dept_Name;
        this.faculty = faculty;
    }
    

    public String getDept_Name() {
        return dept_Name;
    }

    public void setDept_Name(String dept_Name) {
        this.dept_Name = dept_Name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
    public void show(){
        Admin ad = new Admin();
        ad.addStudent();
        ad.updateStudentInfo();
        ad.searchStudentInfo();
    }
}
