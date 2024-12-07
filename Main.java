/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.task;

import java.util.Arrays;

/**
 *
 * @author MAHMOUD TALAAT
 */
public class Main {

    public static void main(String[] args) {
        /***********************************Student interface******************************************/
        studentsystem.addStudent(10002, "omar talaat", 90, "software testing");
        studentsystem.addStudent(10007, "omar talaat", 70, "software testing");
        studentsystem.editStudent(10007, "mahmode", 80, "software testing");
        studentsystem.removeStudent(10002);
        studentsystem.viewStudent(10007);
       /**************************************************************************************************/
        /***********************************Instructor interface******************************************/
        instructorsystem.addInstructor(100003, "Dr.Abd El-Rahman", Arrays.asList("embedded system", "c++", "software testing"));
        instructorsystem.viewInstructor(100003);
        instructorsystem.editInstructor(100003, "Dr.Abd El-Rahman", Arrays.asList("java", "software testing"));
        instructorsystem.removeInstructor(100003);
        instructorsystem.viewInstructor(100003);
        /**************************************************************************************************/
    }
}
