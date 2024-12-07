/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MAHMOUD TALAAT
 */
public class studentsystem {
    private static final List<Student> stud = new ArrayList<>();
    private static int totalStudents = 0;
    public static void addStudent(int id,String name,double grade,String course) {
        Student newstud = new Student(id, name, grade, course);
        stud.add(newstud);
        totalStudents++;
          System.out.println("Student Added\n");
        newstud.studentinfo();
    }
    public void editStudent(int id, String newName, double newGrade, String newCourse) {
        boolean found = false;
        for(int i = 0; i < stud.size(); i++) {
            if (stud.get(i).getId()== id) {
                stud.get(i).setName(newName);
                stud.get(i).setGrade(newGrade);
                stud.get(i).setCourse(newCourse);
                System.out.println("Student updated");
                stud.get(i).studentinfo();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with ID " + id + " not found.");
        }
    }
    public void removeStudent(int id) {
        boolean removed = stud.removeIf(student -> student.getId() == id);
        if (removed) {
            System.out.println("Student with ID " + id + " removed.");
        } 
        else {
            System.out.println("Student with ID " + id + " not found.");
        }
    }
    public static void viewStudent(int id) { 
        for (int i = 0; i < stud.size(); i++) {
            if (stud.get(i).getId() == id) { 
                stud.get(i).studentinfo();
            }
            else {
                System.out.println("Student ID not found");
            }
        }
    }
}
