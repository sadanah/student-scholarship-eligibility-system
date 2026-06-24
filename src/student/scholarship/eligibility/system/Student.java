package student.scholarship.eligibility.system;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sadana
 */
public class Student {
    String studentName;
    int studentID;
    double GPA;
    char activityLevel;
    
    //Constructor
    public Student (String studentName, int studentID, double GPA, char activityLevel){
        this.studentName =  studentName;
        this.studentID = studentID;
        this.GPA = GPA;
        this.activityLevel = activityLevel;
    }
}


