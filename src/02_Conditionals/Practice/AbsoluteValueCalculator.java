// PROBLEM: Calculate the absolute value of a number

import java.util.Scanner;

public class AbsoluteValueCalculator{
    public static void main (String[]args){

        // STEP 1: Take a number input from the user
        Scanner sc = new Scanner (System.in);

        System.out.println ("Enter a number: ");
        int num = sc.nextInt();

        // STEP 2: Check if num is -ve, if yes, multiply by -1
        int absolute;
        if (num < 0){
            absolute = -num;
        }
        else{
            absolute = num;
        }

        // STEP 3: print
        System.out.println ("Absolute Value: " + absolute);

        sc.close();
    }
}