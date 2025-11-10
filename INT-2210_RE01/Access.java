// Import Scanner to read user input
import java.util.Scanner;

public class Access {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Define the correct login information (constants)
        final String PASSWORD = "terps";  // Correct password
        final int NUMBER = 1847;           // Correct number

        // Keep track of how many login attempts have been made
        int attempts = 0;

        // Variable to track if access has been granted
        boolean accessGranted = false;

        // Allow the user up to 3 attempts
        while (attempts < 3) {
            // Ask the user for a password
            System.out.print("Enter password: ");
            String pwd = input.next(); // Read the password (no nextLine() allowed)

            // If user enters "quit", stop immediately (no number prompt)
            if (pwd.equals("quit")) {
                break; // Exit the loop right away
            }

            // Ask the user for the number after the password
            System.out.print("Enter number: ");
            int num = input.nextInt(); // Read the number

            // Check if both password and number are correct
            if (pwd.equals(PASSWORD) && num == NUMBER) {
                System.out.println("Access Granted"); // Success message
                accessGranted = true; // Mark as granted
                break; // Exit the loop since login was successful
            } else {
                System.out.println("Wrong credentials"); // Incorrect info
                attempts++; // Count failed attempt
            }
        }

        // If user never entered correct info or entered "quit"
        if (!accessGranted) {
            System.out.println("Access Denied");
        }

        // Close the Scanner to prevent memory leaks
        input.close();
    }
}

