/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task;
import java.util.*;
/**
 *
 * @author MAHMOUD TALAAT
 */
public class Instructor extends person {
    private List<Course> courses;

    public Instructor(int id, String name, List<Course>  nameofcourses) {
        super(name,id);
        this.courses = nameofcourses;
    }
    
    public void addCourse(Course course) {
        courses.add(course);
    }
    
    public void removeCourse(Course course) {
        courses.remove(course);
    }

    public List<Course>  getNameofcourses() {
        return courses;
    }
     
    public void displayDetails(){
         System.out.println("Instructor: " + getName() + " | ID: " + getId());
        System.out.println("Courses taught: ");
        for (Course course : courses) {
            System.out.println(course.getCourseName());
        }
    }
}
