import java.util.Scanner;

public class CompoundInterest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Principal amount: ");
        double princ = input.nextDouble();

        System.out.print("Rate of interest: ");
        double rate = input.nextDouble() / 100;

        System.out.print("Rate of Compound: ");
        double comp = input.nextDouble();

        System.out.print("How many years: ");
        double years = input.nextDouble();
        
        double totalAmount = princ * Math.pow(1 + rate / comp, comp * years);

        System.out.printf("Total amount after %.0f years: $%.2f", years, totalAmount);

        input.close();
    }
}