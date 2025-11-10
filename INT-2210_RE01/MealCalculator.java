public class MealCalculator {
    private double foodCharge;
    private double tipPercent;
    private double taxPercent;

    public MealCalculator() {
        this.foodCharge = 0.0;
        this.tipPercent = 0.0;
        this.taxPercent = 0.0;
    }

    public MealCalculator(double foodCharge, double tipPercent, double taxPercent) {
        this.foodCharge = foodCharge;
        this.tipPercent = tipPercent;
        this.taxPercent = taxPercent;
    }

    public double getFoodCharge() {
        return this.foodCharge;
    }

    public double getTipPercent() {
        return this.tipPercent;
    }

    public double getTaxPercent() {
        return this.taxPercent;
    }

    public void setFoodCharge(double foodCharge) {
        this.foodCharge = foodCharge;
    }

    public void setTipPercent(double tipPercent) {
        this.tipPercent = tipPercent;
    }

    public void setTaxPercent(double taxPercent) {
        this.taxPercent = taxPercent;
    }

    public double calculateTip() {
        return this.foodCharge * (this.tipPercent / 100);
    }

    public double calculateTax() {
        return this.foodCharge * (this.taxPercent / 100);
    }

    public double calculateTotal() {
        return this.foodCharge + calculateTip() + calculateTax();
    }

    public void displayAmounts() {
        System.out.printf("Food Charge: $%.2f%n", this.foodCharge);
        System.out.printf("Tip Amount: $%.2f%n", calculateTip());
        System.out.printf("Tax Amount: $%.2f%n", calculateTax());
        System.out.printf("Total Amount: $%.2f%n", calculateTotal());
    }
}
