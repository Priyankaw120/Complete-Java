// PROBLEM: Build a calculator using switch-case(add, sub, mul, div)

import java.util.Scanner;

public class Calculator{
    public static void main (String[]args){

        // Create Scanner object to take input from user
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.println("Enter second number: ");
        double num2 = sc.nextDouble();

        // STEP 2: Input operation choice
        System.out.println ("Choice Operation: +, -, *, / ");
        char operator = sc.next().charAt(0);

        double result;

        // STEP 3: Perform operation based on user choice
        switch (operator){
            case '+':
                result = num1 + num2;
                System.out.println ("Result: " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println ("Result: " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println ("Result: " + result);
                break;

            case '/':
                result = num1 / num2;
                System.out.println ("Result: " + result);
                break;

            default:
                System.out.println ("Invalid operation!");

        }

        sc.close();


    }
}