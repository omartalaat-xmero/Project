/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task;

/**
 *
 * @author MAHMOUD TALAAT
 */
public class Instructor {
     private int id;
    private String name ;
    private String nameofcourses;

    public Instructor(int id, String name, String nameofcourses) {
        this.id = id;
        this.name = name;
        this.nameofcourses = nameofcourses;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNameofcourses(String nameofcourses) {
        this.nameofcourses = nameofcourses;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNameofcourses() {
        return nameofcourses;
    }
     
    public String instructortinfo(){
        return "Name: "+name+"\nID: "+id+"\nCourse: "+nameofcourses+"\n";
    }
    
}
