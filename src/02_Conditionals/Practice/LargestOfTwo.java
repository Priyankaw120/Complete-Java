// PROBLEM: Find the largest of two numbers

import java.util.Scanner;

public class LargestOfTwo{
    public static void main(String[]args){

        // Crate Scanner object to take input from User
        Scanner sc = new Scanner (System.in);

        // STEP 1: Take Two inputs from user
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        // STEP 2: Compare the two numbers
        if (num1 > num2 ){
            System.out.println(num1 + " is the largest number. ");
        }
        else{
            System.out.println(num2 + " is the largest number. ");
        }

        // Close the Scanner
        sc.close();

    }
}
