import java.util.Scanner;

/**
 * TotalXPProgram.java
 * Author: Kamali J. Cooper
 * Date: 2025-09-13
 * 
 * This program calculates a gamer's total XP score including bonuses for each level
 * and engagement. The program prompts the user to input the gamer's name, Level 1, Level 2, 
 * Level 3 XP scores, and Engagement score. Each XP input must be a whole number between 10 and 100 
 * in increments of 5. The program calculates the total XP score using the formula:
 * L1 + L1*0.20 + L2 + L2*0.30 + L3 + L3*0.50 + ES + ES*0.60. After displaying the results, 
 * it asks the user whether they want to calculate XP for another gamer, and allows repeated 
 * entries until the user chooses to exit. Proper input validation ensures correct XP values.
 */

public class TotalXPProgram_Cooper {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Welcome message
        System.out.println("Welcome to the Total XP calculation program!");

        // Loop to allow multiple gamer entries
        while (true) {
            // Prompt user to enter gamer's data or exit
            System.out.print("\nDo you want to enter gamer's data? Yes/No => ");
            String choice = scanner.nextLine().trim().toLowerCase();

            // Exit program if user chooses "no"
            if (choice.equals("no")) {
                System.out.println("Thank you for using the Total XP calculation program!");
                break;
            } 
            // Validate input for Yes/No
            else if (!choice.equals("yes")) {
                System.out.println("Invalid input. Please enter Yes or No.");
                continue; // Repeat the prompt
            }

            // Prompt for gamer's name
            System.out.print("Enter gamer's name => ");
            String gamerName = scanner.nextLine().trim();

            // Initialize variables for XP scores
            int L1 = 0, L2 = 0, L3 = 0, ES = 0;
            boolean validInput = false; // Flag to validate XP input

            // Loop until valid XP input is entered
            while (!validInput) {
                // Prompt for Level XP scores and Engagement score
                System.out.print("Enter gamer's Level XP scores separated by space: L1 L2 L3 ES => ");
                String[] inputs = scanner.nextLine().trim().split("\\s+");

                // Check if exactly 4 numbers were entered
                if (inputs.length != 4) {
                    System.out.println("Please enter exactly 4 numbers.");
                    continue; // Repeat the prompt
                }

                try {
                    // Parse input values to integers
                    L1 = Integer.parseInt(inputs[0]);
                    L2 = Integer.parseInt(inputs[1]);
                    L3 = Integer.parseInt(inputs[2]);
                    ES = Integer.parseInt(inputs[3]);

                    // Validate XP values using helper method
                    if (isValidXP(L1) && isValidXP(L2) && isValidXP(L3) && isValidXP(ES)) {
                        validInput = true; // Valid input entered
                    } else {
                        System.out.println("Each XP must be a whole number between 10-100 in increments of 5.");
                    }

                } catch (NumberFormatException e) {
                    // Handle non-integer input
                    System.out.println("Invalid input. Please enter whole numbers only.");
                }
            }

            // Calculate total XP with bonuses
            double totalXP = L1 + L1 * 0.20 + L2 + L2 * 0.30 + L3 + L3 * 0.50 + ES + ES * 0.60;

            // Display gamer's information and total XP
            System.out.println("\nGamer Name: " + gamerName + 
                               " L1=" + L1 + 
                               " L2=" + L2 + 
                               " L3=" + L3 + 
                               " ES=" + ES);
            System.out.println("Final XP score with bonuses=" + (int)totalXP);
        }

        // Close the Scanner object
        scanner.close();
    }

    /**
     * Helper method to validate XP values
     * XP must be a whole number between 10 and 100 and in increments of 5
     * 
     * @param xp The XP value to validate
     * @return true if XP is valid, false otherwise
     */
    public static boolean isValidXP(int xp) {
        return xp >= 10 && xp <= 100 && xp % 5 == 0;
    }
}