/*
    Program: ColorGenerator.java
    Description:
    This program generates a CSS color code based on user input. It asks the
    user if they want the red component and whether they want both green and
    blue components together. If the user answers "Yes" or "Yeah", the program
    uses "FF" for red, or "FFFF" for green and blue. Any other response is
    treated as "No", resulting in "00" for red and "0000" for green/blue. The
    program then builds a 6-character CSS hexadecimal color code starting with
    "#". For example, choosing red only produces "#FF0000", while choosing green
    and blue produces "#00FFFF". This program demonstrates conditional logic,
    string building, and input handling in Java.
*/

import java.util.Scanner;

public class ColorGenerator {
    public static void main(String[] args) {
        // Create one Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Ask if the user wants red in the color
        System.out.print("Do you want red? (Yes/Yeah/No): ");
        String redAnswer = input.nextLine();

        // If user says "Yes" or "Yeah", use "FF" for red, otherwise "00"
        String red = (redAnswer.equalsIgnoreCase("Yes") || redAnswer.equalsIgnoreCase("Yeah")) ? "FF" : "00";

        // Ask if the user wants both green and blue in the color
        System.out.print("Do you want green and blue? (Yes/Yeah/No): ");
        String gbAnswer = input.nextLine();

        // If user says "Yes" or "Yeah", use "FFFF" for green and blue, otherwise "0000"
        String greenBlue = (gbAnswer.equalsIgnoreCase("Yes") || gbAnswer.equalsIgnoreCase("Yeah")) ? "FFFF" : "0000";

        // Build the final CSS color string
        String finalColor = "#" + red + greenBlue;

        // Display the result
        System.out.println("Final Color: " + finalColor);

        input.close();
    }
}