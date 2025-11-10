// Import the Scanner class so we can read user input
import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Ask the user for a decimal (base 10) number
        System.out.print("Enter decimal number: ");
        int decimal = input.nextInt(); // Store the input number

        // Special case: if the number is 0, its octal value is also 0
        if (decimal == 0) {
            System.out.println("Octal value: 0");
        } else {
            // Initialize variables for conversion
            int octal = 0;  // This will hold the final octal number
            int place = 1;  // Keeps track of the place value (1, 10, 100, etc.)

            // Repeat until the decimal number becomes 0
            while (decimal > 0) {
                int remainder = decimal % 8;   // Get remainder when dividing by 8
                octal += remainder * place;    // Add remainder in the correct place
                decimal /= 8;                  // Divide the number by 8 for the next step
                place *= 10;                   // Move to the next digit place
            }

            // Display the result
            System.out.println("Octal value: " + octal);
        }

        // Close the scanner to prevent resource leaks
        input.close();
    }
}