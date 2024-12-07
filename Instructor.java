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
    private List<String> nameofcourses;

    public Instructor(int id, String name, List<String>  nameofcourses) {
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

    public void setNameofcourses(List<String>  nameofcourses) {
        this.nameofcourses = nameofcourses;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String>  getNameofcourses() {
        return nameofcourses;
    }
     
    public String instructortinfo(){
        String nameofcourseslist = String.join(", ", nameofcourses);
        return "Name: "+name+"\nID: "+id+"\nCourse: "+nameofcourseslist+"\n";
    }
}
