/*
 * Program: Arrays
 * Author: Kamali Cooper
 * Date: 10/4/25
 *
 * Description:
 * This program prompts the user to enter a list of integers, ending with 0 as the sentinel value.
 * The integers are stored in an array (maximum 100 values). The program contains:
 * 1. A method to update each value in the array to its square.
 * 2. A method to display both the original and squared arrays side by side.
 */

import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); /* Create Scanner for input */

        /* Declare arrays and a counter for number of values */
        int[] original = new int[100]; /* To store original values */
        int[] squared = new int[100];  /* To store squared values */
        int count = 0;

        /* Prompt user to enter integers until 0 is entered */
        System.out.println("Enter integers (0 to stop):");
        while (true) {
            int value = scanner.nextInt(); /* Read integer from user */
            if (value == 0) {              /* Check for sentinel */
                break;                     /* Stop input when 0 is entered */
            }
            original[count] = value;       /* Store value in original array */
            squared[count] = value;        /* Initialize squared array with original values */
            count++;                       /* Increment counter */
        }

        /* Close the scanner */
        scanner.close();

        /* Call method to square the values in the squared array */
        squareArray(squared, count);

        /* Call method to display original and squared arrays */
        displayArrays(original, squared, count);
    }

    /* Method to update each element of the array to its square */
    public static void squareArray(int[] array, int count) {
        for (int i = 0; i < count; i++) {
            array[i] = array[i] * array[i]; /* Square each element */
        }
    }

    /* Method to display the original and squared arrays side by side */
    public static void displayArrays(int[] original, int[] squared, int count) {
        System.out.println("Original\tSquared");
        for (int i = 0; i < count; i++) {
            System.out.println(original[i] + "\t\t" + squared[i]);
        }
    }
}

