// Check if a number is even or odd

import java.util.Scanner;

public class EvenOdd{
    public static void main (String[]args){
        // Create Scanner Object to take input from user
        Scanner sc = new Scanner(System.in);

        // STEP 1: Take input from user
        System.out.print("Enter the number: ");

        int Number = sc.nextInt();

        // STEP 2: Divide the Number by 2 and check reminder

        // If reminder is 0, number is even; Else, number is Odd

        if (Number % 2 == 0){
            System.out.println(Number + " is Even number. ");
        }
        else{
            System.out.println(Number + " is Odd number. ");
        }

        // Close scanner
        sc.close();
    }
}