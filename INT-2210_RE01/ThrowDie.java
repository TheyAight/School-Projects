// Import classes needed for user input and random number generation
import java.util.Random;
import java.util.Scanner;

public class ThrowDie {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Ask how many times the die should be thrown
        System.out.print("How many times to throw a die? ");
        int n = input.nextInt(); // Number of throws

        // Ask the user for a seed to make random numbers repeatable
        System.out.print("Enter seed: ");
        int seed = input.nextInt();

        // Create a Random object using the seed value
        Random rand = new Random(seed);

        // Loop runs n times, once for each die throw
        for (int i = 1; i <= n; i++) {
            // Generate a random number between 1 and 6 (a die face)
            int face = rand.nextInt(6) + 1;

            // Display which throw number this is
            System.out.println("Throw #" + i);

            // Print the die face pattern for the number rolled
            printDie(face);
        }

        // Close the Scanner to prevent resource leaks
        input.close();
    }

    // This method prints the 3x3 pattern for each die face
    public static void printDie(int face) {
        switch (face) {
            case 1:
                // Die face showing 1
                System.out.println("...");
                System.out.println(".0.");
                System.out.println("...");
                break;
            case 2:
                // Die face showing 2
                System.out.println("0..");
                System.out.println("...");
                System.out.println("..0");
                break;
            case 3:
                // Die face showing 3
                System.out.println("0..");
                System.out.println(".0.");
                System.out.println("..0");
                break;
            case 4:
                // Die face showing 4
                System.out.println("0.0");
                System.out.println("...");
                System.out.println("0.0");
                break;
            case 5:
                // Die face showing 5
                System.out.println("0.0");
                System.out.println(".0.");
                System.out.println("0.0");
                break;
            case 6:
                // Die face showing 6
                System.out.println("0.0");
                System.out.println("0.0");
                System.out.println("0.0");
                break;
        }
    }
}
