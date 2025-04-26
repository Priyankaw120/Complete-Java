// PROBLEM : Find the largest among three numbers

// STEP 1: Take 3 Numbers as input.
// STEP 2: Compare
// STEP 3: Print the largest number

import java.util.Scanner;
public class LargestOfThree{
    public static void main (String[]args){
        // Create Scanner object to take input from user
        Scanner sc = new Scanner (System.in);

        System.out.println ("Enter First Number: ");
        int num1 = sc.nextInt();

        System.out.println ("Enter Second Number: ");
        int num2 = sc.nextInt();

        System.out.println ("Enter Third Number: ");
        int num3 = sc.nextInt();

        // Compare
        if (num1 >= num2 && num1 >= num3 ){
            System.out.println (num1 + " is the largest number.");
        }
        else if (num2 >= num1 && num2 >= num3){
            System.out.println (num2 + " is the largest number. ");
         }
        else{
            System.out.println (num3 + " is the largest number. ");
        }
    }
}


