/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author MAHMOUD TALAAT
 */
public class Student extends person{
    
    private Map<Course,Grade>grades;
    
    public Student(int id, String name, double grade, String course) {
        super(name, id);
        this.grades = new HashMap<>();
    }
   

    public void addGrade(Course course, Grade grade) {
         if (course == null || grade == null) {
            throw new IllegalArgumentException("Course and Grade cannot be null.");
        }
        grades.put(course, grade);
    }
    
    public void removeGrade(Course course) {
        grades.remove(course);
    }

    public Map<Course, Grade> getGrades() {
    return new HashMap<>(grades);  // Returning a copy to preserve encapsulation
}  
    
    @Override
    public String displayDetails() {
        StringBuilder details = new StringBuilder();
        details.append("Student ID: ").append(getId()).append(", Name: ").append(getName()).append("\nGrades:\n");

        for (Map.Entry<Course, Grade> entry : grades.entrySet()) {
            details.append(entry.getKey().getCourseName())  // Assuming `Course` has a `getName()` method
                   .append(": ")
                   .append(entry.getValue())  // Assuming `Grade` has a meaningful `toString()` method
                   .append("\n");
        }

        return details.toString();
    }

}
