/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task;

/**
 *
 * @author MAHMOUD TALAAT
 */
public class Student {
    private String name;
    private String pass;
    private int Id;
    private boolean login = false;
    Gradesystem gradesystem;
    public Student(String name, String pass, int Id) {
        this.name = name;
        this.pass = pass;
        this.Id = Id;
        this.gradesystem=new Gradesystem();
    } // Constructor to initialize student data by instructor
    
    
    public boolean login(int Id, String pass) {
        if (Id == this.Id && pass.equals(this.pass)) {
            this.login = true;
            return true;
        }
        return false;
    }// Method to log the student in
    public void logout() {
        this.login = false;
    }// Method to log the student out
    public boolean isLoggedIn() {
        return login;
    }
    
    
    /*setters and getters to edit student data by instructor or student*/
    public void setName(String name) {
        this.name = name;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }
    public void setId(int Id) {
        this.Id = Id;
    }
    public String getName() {
        return name;
    }
    public String getPass() {
        return pass;
    }
    public int getId() {
        return Id;
    }
  
    
    public void setGrades(int numOfSessions, int numOfAttended, int numOfAssignments, int numOfSubmitted, float finalExamGrade) {
        // Set attendance grade
        this.gradesystem.Atend(numOfSessions, numOfAttended);
        // Set submission grade
        this.gradesystem.SubmiGrade(numOfAssignments, numOfSubmitted);
        // Set final exam grade
        this.gradesystem.setFinalgrade(finalExamGrade);
    }
    
    public char getGPA() {
        return this.gradesystem.getGPA();
    }// method to get GPA from GradeSystem
    public float getTotalGrade() {
        return this.gradesystem.getTotalGrade();
    }// method to get total grade from GradeSystem
}

