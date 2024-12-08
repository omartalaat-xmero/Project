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
        
        /******************************student interface**************************************************/
        studentsystem.addStudent(1203, "omar talaat", 70, "math");
        studentsystem.addStudent(1204, "talaat", 80, "c++");
       // studentsystem.editStudent(1203, "talaat","c++",60);
        studentsystem.removeStudent(1203);
        studentsystem.viewStudent(1204);
        /*********************************************************************************************/
 /********************************Instructor interface****************************************/
        instructorsystem.addInstructor(1, "talaat",Arrays.asList("java", "c++"));
        instructorsystem.addInstructor(2, "talaat", Arrays.asList("c++", "math"));
        instructorsystem.viewInstructor(1);
        instructorsystem.editInstructor(1, "talaat", Arrays.asList("c++", "math"));
        instructorsystem.removeInstructor(2);
/*********************************************************************************************/
    }
}
