/*
    Program: Area.java
    Description:
    This program calculates the area of a rectangle. It asks the user to enter
    a length and a width, then validates that both values are positive. If the
    user enters invalid values (negative or zero), the program displays an error
    message and prompts the user again until valid input is given. Once both
    inputs are valid, the program multiplies length and width to compute the
    rectangle's area and displays the result. This program demonstrates user
    input handling, validation with loops, and method usage in Java.
*/
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        // Create one Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Read and validate length
        int length = readPositive("Enter length: ", "Invalid length. Make sure to enter a positive number.", input);

        // Read and validate width
        int width = readPositive("Enter width: ", "Invalid width. Make sure to enter a positive number.", input);

        // Compute the area of the rectangle
        int area = length * width;

        // Display the result
        System.out.println("Area is: " + area);
    }

    // Method to read a positive integer from the user
    public static int readPositive(String prompt, String errorMessage, Scanner input) {
        int value;
        while (true) {
            System.out.print(prompt); // Ask user for input
            value = input.nextInt();  // Read input
            if (value > 0) {
                return value;          // Return valid input
            } else {
                System.out.println(errorMessage); // Show error if invalid
            }
        }
    }
}
