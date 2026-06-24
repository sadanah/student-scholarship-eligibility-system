/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package student.scholarship.eligibility.system;

import java.util.Scanner;
/**
 *
 * @author Sadana
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("=================================================\n");
        System.out.print("     STUDENT SCHORLARSHIP ELIGIBILITY SYSTEM\n");
        System.out.print("=================================================\n\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("How many students do you want to process? ");
        int stuCount = scanner.nextInt();

        while (stuCount > 0) {
            System.out.println("\n");

            System.out.print("Enter student name: ");
            String studentName = scanner.next();

            System.out.print("Enter student ID: ");
            int studentID = scanner.nextInt();

            System.out.print("Enter student GPA: ");
            double GPA = scanner.nextDouble();

            System.out.print("Enter student activity level (A, B, C): ");
            char activityLevel = scanner.next().charAt(0);
            
            Student student = new Student(studentName, studentID, GPA, activityLevel);

            student.calculateScholarship();
            student.displayDetails();
            stuCount--;
        }

        scanner.close();
    }
    
}
