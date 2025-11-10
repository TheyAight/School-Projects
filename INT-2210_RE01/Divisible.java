/*
    Program: Divisible.java
    Description:
    This program checks if one integer (x) is divisible by another integer (y).
    It first prompts the user for x, then asks for y while validating that y is
    not zero (since division by zero is undefined). If the user enters 0, the
    program displays an error message and continues prompting until a valid
    non-zero y is provided. It then calculates the remainder (x % y) and prints
    both the remainder and a message stating whether x is divisible by y. This
    program demonstrates input validation, arithmetic operations, and control
    flow with conditionals and loops.
*/

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        // Create one Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Ask for the value of x
        System.out.print("Enter x: ");
        int x = input.nextInt();

        // Ask for y and validate that y is not zero
        int y = readNonZero("Enter y: ", input);

        // Compute remainder
        int remainder = x % y;
        System.out.println("Remainder: " + remainder);

        // Check if x is divisible by y
        if (remainder == 0) {
            System.out.println(x + " is divisible by " + y);
        } else {
            System.out.println(x + " is NOT divisible by " + y);
        }
    }

    // Method to read a non-zero integer from the user
    public static int readNonZero(String prompt, Scanner input) {
        int value;
        while (true) {
            System.out.print(prompt); // Ask user for input
            value = input.nextInt();  // Read input
            if (value != 0) {
                return value;         // Return valid input
            } else {
                System.out.println("Value of y can't be 0."); // Error if invalid
            }
        }
    }
}