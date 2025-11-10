/*
 * Author: Kamali J. Cooper
 * Date: October 18, 2025
 * Description:
 * This program checks whether a user-entered password meets specific security requirements:
 *  - Length must be greater than a minimum and less than a maximum.
 *  - Must not contain spaces.
 *  - Must contain at least one digit.
 *  - Must contain at least one alphabetic character.
 * The program uses multiple functions to verify each requirement and applies exception handling
 * to display the first reason a password is invalid.
 */

import java.util.Scanner;

public class PasswordValidator {
    // Minimum and maximum password length
    private static final int MIN_LENGTH = 6;
    private static final int MAX_LENGTH = 15;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = input.nextLine();

        try {
            checkLength(password);
            checkCharacters(password);
            checkForSpaces(password);
            System.out.println("Password is valid!");
        } catch (Exception e) {
            System.out.println("Invalid password: " + e.getMessage());
        }

        input.close();
    }

    // Function 1: Check password length
    public static void checkLength(String password) throws Exception {
        if (password.length() < MIN_LENGTH)
            throw new Exception("Password is too short (minimum " + MIN_LENGTH + " characters).");
        if (password.length() > MAX_LENGTH)
            throw new Exception("Password is too long (maximum " + MAX_LENGTH + " characters).");
    }

    // Function 2: Check that password contains at least one digit and one letter
    public static void checkCharacters(String password) throws Exception {
        boolean hasDigit = false;
        boolean hasLetter = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isDigit(ch))
                hasDigit = true;
            if (Character.isLetter(ch))
                hasLetter = true;
        }

        if (!hasDigit)
            throw new Exception("Password must contain at least one digit.");
        if (!hasLetter)
            throw new Exception("Password must contain at least one alphabetic character.");
    }

    // Function 3: Check that password does not contain spaces
    public static void checkForSpaces(String password) throws Exception {
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) == ' ')
                throw new Exception("Password must not contain spaces.");
        }
    }
}
