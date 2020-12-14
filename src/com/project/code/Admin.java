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
public class Admin {
    private String id;
    private String name;
    private String password;
    private String email;

   public Admin(String id, String name, String password, String email) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
    }

    Admin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
  
    public void addStudent(String id, String name, String fathername, String mothername, String address, String blood, String phone, String email, String schoolname, String collegename){
        Student add = new Student();
        add.setId(id);
        add.setName(name);
        add.setFathername(fathername);
        add.setMothername(mothername);
        add.setAddress(address);
        add.setBlood(blood);
        add.setPhone(phone);
        add.setEmail(email);
        add.setSchoolname(schoolname);
        add.setCollegename(collegename);
        
        
    }
    public void updateStudentInfo(){
        Student update = new Student();
    }
      public void searchStudentInfo(){
          Student search = new Student();
           
   }

    void addStudent() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
      
    
}
