// PROBLEM : Check if character is lowercase, uppercase, digit or special symbol

// 'A' to 'Z' → Uppercase Letter
// 'a' to 'z' → Lowercase Letter
// '0' to '9' → Digit
// Else → Special Symbol

import java.util.Scanner;

public class CharacterTypeChecker{
    public static void main (String[]args){

        // STEP 1:  Take a character input from user
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter a Character: ");
        int ch = sc.next().charAt(0);

        // STEP 2: Check the type of character
        if ( ch >='A' && ch <= 'Z'){
            System.out.println ("Uppercase Letter.");
        }
        else if (ch >= 'a' && ch <= 'z'){
            System.out.println ("LowerCase Letter.");
        }
        else if (ch >= '0' && ch <= '9'){
            System.out.println ("Digit");
        }
        else {
            System.out.println ("Special Symbol.");
        }
    }
}