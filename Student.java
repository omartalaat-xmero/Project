package com.mycompany.task;
/**
 *
 * @author MAHMOUD TALAAT
 */
public class Student {
    private int id;
    private String name;
    private double grade;
    private String course;

    public Student(int id, String name, double grade, String course) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.course = course;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(double grade) {
       if (grade < 0 || grade > 100) {
            System.out.println("Invalid grade! Grade must be between 0 and 100.");
        } 
        else {
            this.grade = grade;
        }
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public String getCourse() {
        return course;
    }
    
    public String studentinfo(){
        return "Name: "+name+"\nID: "+id+"\nCourse: "+course+"\nGrade: "+grade+"\n";
    }
}
