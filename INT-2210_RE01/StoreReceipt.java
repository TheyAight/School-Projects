import java.util.Scanner;

public class StoreReceipt {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter store number: ");
        int storeNumber = input.nextInt();
        input.nextLine(); // consume newline

        System.out.print("Enter name of first item: ");
        String item1 = input.nextLine();

        System.out.print("Enter price of first item: ");
        double price1 = input.nextDouble();
        input.nextLine(); // consume newline

        System.out.print("Enter name of second item: ");
        String item2 = input.nextLine();

        System.out.print("Enter price of second item: ");
        double price2 = input.nextDouble();

        double totalBeforeTax = price1 + price2;
        double totalAfterTax = totalBeforeTax * 1.06;
        double averagePrice = totalAfterTax / 2;

        System.out.println("\nStore Number: " + storeNumber);
        System.out.println(item1 + ": $" + price1);
        System.out.println(item2 + ": $" + price2);
        System.out.printf("Total before tax: $%.2f%n", totalBeforeTax);
        System.out.printf("Total after tax: $%.2f%n", totalAfterTax);
        System.out.printf("Average price: $%.2f%n", averagePrice);

        input.close();
    }
}
