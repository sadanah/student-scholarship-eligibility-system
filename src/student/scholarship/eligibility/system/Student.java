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

    int scholarshipAmount = 0;
    String scholarshipCategory = "";
    String academicStanding = "";
    
    //Constructor
    public Student (String studentName, int studentID, double GPA, char activityLevel){
        this.studentName =  studentName;
        this.studentID = studentID;
        this.GPA = GPA;
        this.activityLevel = activityLevel;
    }

    public void calculateScholarship() {

        //schorlarship calculation logic
        if (GPA >= 3.5) {
            if (activityLevel == 'A') {
                scholarshipAmount = 100000;
                scholarshipCategory = "Full Scholarship";
            } 
            else if (activityLevel == 'B') {
                scholarshipAmount = 50000;
                scholarshipCategory = "Half Scholarship";
            } 
            else if (activityLevel == 'C') {
                scholarshipAmount = 25000;
                scholarshipCategory = "Merit Scholarship";
            }
        } else {
            scholarshipAmount = 0;
            scholarshipCategory = "Not Eligible for Scholarship";
        }

        //academic standing logic
        if (GPA >= 3.7) {
            academicStanding = "Category 1";
        } 
        else if (3.69 <= GPA && GPA <= 3.0) {
            academicStanding = "Category 2";
        } 
        else {
            academicStanding = "Category 3";
        }
    }

    public void displayDetails() {
        System.out.println("\n\n");
        System.out.println("Student Details:");
        System.out.println("");
        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentID);
        System.out.println("GPA: " + GPA);
        System.out.println("Activity Level: " + activityLevel);
        System.out.println("Scholarship Amount: " + scholarshipAmount);
        System.out.println("Scholarship Category: " + scholarshipCategory);
        System.out.println("Academic Standing: " + academicStanding);
    }
}


