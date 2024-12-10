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
        Course c=new Course("java","CS103"),c1=new Course("mathI","ms203"),
               c2=new Course("Compiler constraction","CS203"),c3=new Course("Computer vision","CS109");
        courses cs=new courses();
        cs.insertCourse(c);
        cs.insertCourse(c1);
        cs.insertCourse(c2);
        cs.insertCourse(c3);
        Grade g=new Grade();
       /******************************student interface**************************************************/
        studentsystem.addStudent(1203, "omar talaat");
        studentsystem.addStudent(1204, "talaat");
        studentsystem.editStudent(1203, "talaat",c,g);
        g.setGradeValue(100);
        studentsystem.editStudent(1203, "talaat",c1,g);
        studentsystem.allStudentCourses(1203);
        studentsystem.allStudents();
        studentsystem.removeStudent(1203);
        studentsystem.allStudents();
        /********************************Instructor interface****************************************/
        instructorsystem.addInstructor(1, "talaat",Arrays.asList(c1,c2));
        instructorsystem.addInstructor(2, "talaat",Arrays.asList(c3,c1));
        instructorsystem.viewInstructor(1);
        instructorsystem.addInstructorCourse(1,c);
        Instructor s=new Instructor(3,"Basmala",Arrays.asList(c3,c1));
        s.addCourses(c);
        System.out.print(s.displayDetails());
               
        instructorsystem.removeInstructor(2);
    }
}
