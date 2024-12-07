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
public class instructorsystem {
     private static final List<Instructor> inst = new ArrayList<>();
    private static int totalInstructor = 0;
    public static void addInstructor(int id,String name,String nameofcourses) {
        Instructor newinst = new Instructor(id, name,nameofcourses);
        inst.add(newinst);
        totalInstructor++;
        System.out.println("Instructor Added\n");
        newinst.instructortinfo();
    }
    public void editInstructor(int id,String name,String nameofcourses) {
        boolean found = false;
        for(int i = 0; i < inst.size(); i++) {
            if (inst.get(i).getId()== id) {
                inst.get(i).setName(name);
                inst.get(i).setNameofcourses(nameofcourses);
                System.out.println("Instructor updated");
                inst.get(i).instructortinfo();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Instructor with ID " + id + " not found.");
        }
    }
    public void removeInstructor(int id) {
        boolean removed = inst.removeIf(instructor -> instructor.getId() == id);
        if (removed) {
            System.out.println("Instructor with ID " + id + " removed.");
        } 
        else {
            System.out.println("Instructor with ID " + id + " not found.");
        }
    }
    public static void viewInstructor(int id) { 
        for (int i = 0; i < inst.size(); i++) {
            if (inst.get(i).getId() == id) { 
                inst.get(i).instructortinfo();
            }
            else {
                System.out.println("Instructor ID not found");
            }
        }
    }
}

