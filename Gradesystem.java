/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task;

/**
 *
 * @author MAHMOUD TALAAT
 */
public class Gradesystem {
    float Atend;
    float SubmiGrade;
    float finalgrade; 
    float TotalGrade;
    char GPA;

    public float Atend(int NumOfSesions, int NumOfAtend){
        Atend=(float)(NumOfAtend/NumOfSesions)*(25/100);
        return Atend;
    }

    public float SubmiGrade(int NumOfAssig, int NumOfSubmi){
        SubmiGrade=(float)(NumOfSubmi/NumOfAssig)*(25/100);
        return SubmiGrade;
    }

    public void setFinalgrade(float finalgrade){
        this.finalgrade = finalgrade;
    }

    public float getTotalGrade() {
        TotalGrade=Atend+SubmiGrade+finalgrade;
        return TotalGrade;
    }
   
     public char getGPA() {
         if (TotalGrade<50){
            this.GPA='F';
        }
        else if(TotalGrade>=50&&TotalGrade<60){
            this.GPA='E';
        }
        else if(TotalGrade>=60&&TotalGrade<70){
            this.GPA='D';
        }
        else if(TotalGrade>=70&&TotalGrade<80){
            this.GPA='C';
        }
        else if(TotalGrade>=80&&TotalGrade<90){
            this.GPA='B';
        }
        else if(TotalGrade>=90){
            this.GPA='A';
        }
        else if(TotalGrade>100){
            System.out.println("edit the grade");
        }
        return GPA;
    }
     
    
    
    
}
