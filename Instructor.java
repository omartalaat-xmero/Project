/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task;
import java.util.List;
/**
 *
 * @author MAHMOUD TALAAT
 */
public class Instructor extends person {
  
    private List<String> courses;

    public Instructor(int id, String name, List<String>  nameofcourses) {
        super(name,id);
        this.courses = nameofcourses;
    }

    public void setNameofcourses(List<String>  nameofcourses) {
        this.courses = nameofcourses;
    }
    
    public List<String>  getNameofcourses() {
        return courses;
    }
    @Override
     public String displayDetails(){
        for (String course : courses) {
        return "Courses : "+ getNameofcourses();
        }
        return "Instructor: " + getName() + "\nID: " + getId();

    }
}

