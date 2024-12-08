package com.mycompany.task;
import java.util.*;
/**
 *
 * @author MAHMOUD TALAAT
 */
public class Student extends person{
    
    private Map<Course,Grade>grades;
    
    public Student(int id, String name) {
        super(name, id);
        this.grades = new HashMap<>();
    }

    public void addGrade(Course course, Grade grade) {
        grades.put(course, grade);
    }
    
    public void removeGrade(Course course) {
        grades.remove(course);
    }

    public Grade getGrade(Course course) {
        return grades.get(course);
    }
    
    public void displayDetails(){
        System.out.println("Student: " + getName() + "\nID: " + getId()+"\n"+grades);
        
    }
}
