import java.util.Scanner;

public class MealCalculatorDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of meals to calculate: ");
        int numberOfMeals = scanner.nextInt();

        for (int i = 1; i <= numberOfMeals; i++) {
            System.out.println("\nMeal " + i + ":");

            MealCalculator meal1 = new MealCalculator();

            System.out.print("Enter food charge: ");
            meal1.setFoodCharge(scanner.nextDouble());
            System.out.print("Enter tip percent: ");
            meal1.setTipPercent(scanner.nextDouble());
            System.out.print("Enter tax percent: ");
            meal1.setTaxPercent(scanner.nextDouble());

            System.out.println("\nCalculations using default constructor:");
            meal1.displayAmounts();

            MealCalculator meal2 = new MealCalculator(meal1.getFoodCharge(), meal1.getTipPercent(), meal1.getTaxPercent());
            System.out.println("\nCalculations using parameterized constructor:");
            meal2.displayAmounts();
        }

        scanner.close();
    }
}
