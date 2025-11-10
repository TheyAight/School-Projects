/*
 * Program: Temperature Analyzer
 * Author: Kamali Cooper
 * Date: 10/4/25
 *
 * Description:
 * This program reads daily temperatures in degrees Fahrenheit from the user and stores them in an array. 
 * Input continues until the sentinel value -999 is entered, which is not stored in the array. After collecting
 * the temperatures, the program calculates and displays the total number of temperatures entered, the number
 * of hot days (85°F or above), warm days (70–84°F), cool days (50–69°F), and cold days (below 50°F). The 
 * program demonstrates the use of arrays, loops, and control structures to process and categorize the data.
 */

import java.util.Scanner;

public class TemperatureAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        /* Declare an array to store temperatures, assuming a max of 100 entries */
        int[] temps = new int[100];
        int count = 0; /* Counter for the number of temperatures entered */

        /* Prompt user to enter temperatures */
        System.out.println("Enter daily temperatures (enter -999 to stop):");

        /* Loop to read temperatures until sentinel -999 is entered */
        while (true) {
            int temp = scanner.nextInt(); /* Read temperature from user */
            if (temp == -999) {           /* Check for sentinel */
                break;                    /* Exit loop if sentinel is entered */
            }
            temps[count] = temp;          /* Store temperature in array */
            count++;                      /* Increment count of temperatures */
        }

        /* Close the scanner to free resources */
        scanner.close();

        /* Initialize counters for each category */
        int hot = 0, warm = 0, cool = 0, cold = 0;

        /* Loop through the array to categorize each temperature */
        for (int i = 0; i < count; i++) {
            if (temps[i] >= 85) {
                hot++;                    /* Count hot days */
            } else if (temps[i] >= 70) {
                warm++;                   /* Count warm days */
            } else if (temps[i] >= 50) {
                cool++;                   /* Count cool days */
            } else {
                cold++;                   /* Count cold days */
            }
        }

        /* Display the results */
        System.out.println("Total number of temperatures = " + count);
        System.out.println("Number of hot days = " + hot);
        System.out.println("Number of warm days = " + warm);
        System.out.println("Number of cool days = " + cool);
        System.out.println("Number of cold days = " + cold);
        
        scanner.close();
    }
}
