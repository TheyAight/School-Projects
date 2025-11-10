/*
 This program estimates the cost of a paint job based on the square footage of wall space 
 to be painted and the price of paint per gallon. It calculates how many gallons of paint 
 are required, the labor hours needed, the cost of paint, labor charges, and the total cost. 
 The program uses named constants for wall space coverage per gallon, hours of labor per gallon, 
 and labor cost per hour. The user is prompted to enter the wall space and price of paint, and 
 the results are displayed with clear formatting to two decimal places.
*/

import java.util.Scanner;

public class Assignment1 {

        // Named constants
    private static final float SQUARE_FEET_PER_GALLON = 115.0f;
    private static final float HOURS_PER_GALLON = 8.0f;
    private static final float LABOR_COST_PER_HOUR = 20.0f;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float squareFeet;
        float paintPrice;

        // Input validation for square feet
        do {
            System.out.print("Enter the square feet of wall space to be painted: ");
            squareFeet = input.nextFloat();
            if (squareFeet <= 0) {
                System.out.println("Square feet must be a positive value. Try again.");
            }
        } while (squareFeet <= 0);
        
        // Input paint price per gallon
         do {
            System.out.print("Enter the price of paint per gallon: ");
            paintPrice = input.nextFloat();
            if (paintPrice <= 0) {
                System.out.println("Price must be a positive value. Try again.");
            }
        } while (paintPrice <= 0);

        // Processing
        float gallonsRequired = (float) Math.ceil(squareFeet / SQUARE_FEET_PER_GALLON);
        float hoursRequired = gallonsRequired * HOURS_PER_GALLON;
        float paintCost = gallonsRequired * paintPrice;
        float laborCharges = hoursRequired * LABOR_COST_PER_HOUR;
        float totalCost = paintCost + laborCharges;

        // Output
        System.out.printf("%.0f square feet of wall space need to be painted.%n", squareFeet);
        System.out.printf("Price of paint per gallon: $%.2f%n", paintPrice);
        System.out.printf("Number of gallons of paint required: %.0f%n", gallonsRequired);
        System.out.printf("Hours of labor required: %.2f%n", hoursRequired);
        System.out.printf("Cost of the paint: $%.2f%n", paintCost);
        System.out.printf("Labor charges: $%.2f%n", laborCharges);
        System.out.printf("Total cost of the paint job: $%.2f%n", totalCost);

        input.close();
    }

}
