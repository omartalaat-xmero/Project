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
    int numberOfcourses=0;
    String course[]=new String[100];
    
    
    void insertCourse(String c){
        course[numberOfcourses]=c;
        numberOfcourses++;
    }
    
    void deleteCourse(String c){
        boolean find=false;
        for(int i=0;i<numberOfcourses;i++){
            if(course[i]==c){
                find=true;
            }
            if(find){
                if(i<numberOfcourses-1)
                    course[i]=course[i+1];
                else
                    course[i]="";
            }
        }
        if(find)
            System.out.println("Done");
        else{
            System.out.println("Not found");
        }
    }
    
    void editCourse(String c,String newC){
         boolean find=false;
        for(int i=0;i<numberOfcourses;i++){
            if(course[i]==c){
                find=true;
                course[i]=newC;
            }
        }
        if(find)
            System.out.println("Done");
        else{
            System.out.println("Not found");
        }
    }
    
    void printCourses(){
        if(numberOfcourses==0){
            System.out.println("Empty");
        }else{
            System.out.print("{ ");
            for(int i=0;i<numberOfcourses-1;i++){
            System.out.print(course[i]+" ,");
            }
            System.out.println(course[numberOfcourses]+" }");
        }
    }
    
}
