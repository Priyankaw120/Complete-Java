import java.util.Scanner;

public class NumberSignCheck {
    public static void main(String[] args) {
        // Step 1: Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Step 2: Ask the user to enter a number
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble(); // Read input from user

        // Step 3: Check the condition
        if (number > 0) {
            // If number is greater than 0, it's positive
            System.out.println("The number is Positive.");
        } else if (number < 0) {
            // If number is less than 0, it's negative
            System.out.println("The number is Negative.");
        } else {
            // If number is equal to 0, it's zero
            System.out.println("The number is Zero.");
        }

        // Step 4: Close the Scanner to avoid resource leak
        scanner.close();
    }
}

