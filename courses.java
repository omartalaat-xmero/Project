/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task;

/**
 *
 * @author MAHMOUD TALAAT
 */
public class courses {
    List<Course>course=new ArrayList<>();
    
    
    void insertCourse(Course c){
        course.add(c);
    }
    
    void deleteCourse(Course c){
        course.remove(c);
    }
    
    void printCourses(){
        System.out.print(course);
    }
}
