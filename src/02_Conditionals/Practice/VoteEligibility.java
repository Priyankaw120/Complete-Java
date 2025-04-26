// PROBLEM : Check if a person is eligible to vote (age >= 18)

// STEP 1: Take person's age as input
// STEP 2: Check if age is greater than or equal to 18
// STEP 3: If yes, print "Eligible to vote"
// STEP 4: ELse, print "Not eligible to vote"

import java.util.Scanner;
public class VoteEligibility{
    public static void main (String[]args){

        // Create Scanner object to take input from user
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter you're current age: ");
        int age = sc.nextInt();

        // Check if (age >= 18)
        if (age >= 18){
            System.out.println ("You're eligible to vote. ");
        }
        else{
            System.out.println ("You're not eligible to vote. ");
        }

        // Close scanner
        sc.close();
    }

}