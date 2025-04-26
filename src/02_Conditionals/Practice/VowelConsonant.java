// PROBLEM : Check if a character is a vowel or consonant

// STEP 1: Take character as input
// STEP 2: Convert the character to lower case (to handle both case)
// STEP 3: Check if it is 'a', 'e', 'i', 'o', or 'u'
// STEP 4: If yes, print "Vowel"
// STEP 5: Else, print "Consonant"

import java.util.Scanner;
public class VowelConsonant{
    public static void main (String[]args){

        // Create Scanner Object to take input from user
        Scanner sc = new Scanner (System.in);

        // Take input from User
        System.out.println ("Enter a character: ");

        char ch = sc.next().charAt(0);
        // sc.next() → reads the next token (word or single input)
        //.charAt(0) → picks the first character of that input.

        ch = Character.toLowerCase (ch);

        // || → OR operator  → At least one condition must be true
        // && → AND operator → both conditions must be true

        if ( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println (ch + " is a vowel.");
        }
        else  if ( ch >= 'a' && ch <= 'z' ){
            System.out.println (ch + " is a Consonant.");
        }
        else{
            System.out.println ("Invalid input. Please enter an alphabet.");
        }

    }
}