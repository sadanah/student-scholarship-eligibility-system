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
    
    //Constructor
    public Student (String studentName, int studentID, double GPA, char activityLevel){
        this.studentName =  studentName;
        this.studentID = studentID;
        this.GPA = GPA;
        this.activityLevel = activityLevel;
    }

    public void calculateScholarship() {

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
    }
}


