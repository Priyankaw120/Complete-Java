// PROBLEM : Clarify grades based on marks

import java.util.Scanner;
public class GradeClassification {
    public static void main (String[]args){

        // Take user input
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter your Marks (0-100): ");
        int marks = sc.nextInt();

        // Classify grade based on marks
        if (marks >= 85 && marks <= 100){
            System.out.println ("Grade: A");
        }
        else if (marks < 85 && marks >= 65  ){
            System.out.println("Grade: B");
        }
        else if (marks < 65 && marks >= 45){
            System.out.println ("Grade: C");
        }
        else{
            System.out.println ("Fail");
        }
    }
}