import java.util.Scanner;

public class PalindromeRecursion {

    // Recursive method to check if a string is a palindrome
    public static boolean isPalindrome(String s) {
        // Base case: if length is 0 or 1, it's a palindrome
        if (s.length() <= 1) {
            return true;
        }

        // Check first and last characters
        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }

        // Recursive call on the substring excluding the first and last characters
        return isPalindrome(s.substring(1, s.length() - 1));
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String userInput = input.nextLine();

        // Validate input: only letters allowed
        if (!userInput.matches("[a-zA-Z]+")) {
            System.out.println("Invalid input. Only letters are allowed.");
        } else {
            // Convert to lowercase for uniform comparison
            String word = userInput.toLowerCase();

            // Check if palindrome
            if (isPalindrome(word)) {
                System.out.println(userInput + " is a palindrome.");
            } else {
                System.out.println(userInput + " is not a palindrome.");
            }
        }

        input.close();
    }
}