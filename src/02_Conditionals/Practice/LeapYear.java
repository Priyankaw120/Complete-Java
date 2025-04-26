// PROBLEM : Check if a year is leap year

/*
Example:
2020 → Divisible by 4, not by 100 → Leap Year ✅
1900 → Divisible by 4 and 100 but not 400 → Not Leap Year ❌
2000 → Divisible by 400 → Leap Year ✅
*/

import java.util.Scanner;
public class LeapYear{
    public static void main (String[]args){

        // Step 1: Take input from the user
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter a year: ");
        int year = sc.nextInt();

        // STEP 2: Check leap year condition
        if ((year % 4 == 0 && year % 100 !=0 ) || (year % 400 == 0)){
            System.out.println (year + " is a leap year. ");
        }
        else{
            System.out.println ( year + " is NOT a leap year.");
        }

        sc.close();
    }
}
