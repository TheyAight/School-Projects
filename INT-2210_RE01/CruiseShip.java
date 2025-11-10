/*
 * Name: Kamali J. Cooper
 * Date: November 1, 2025
 * Description: This class represents a CruiseShip, which extends Ship and adds the maximum number of passengers.
 */

public class CruiseShip extends Ship {
    // Field for maximum passengers
    private int maxPassengers;

    // Constructor (calls parent constructor)
    public CruiseShip(String name, String yearBuilt, int maxPassengers) {
        super(name, yearBuilt);
        this.maxPassengers = maxPassengers;
    }

    // Accessor (getter)
    public int getMaxPassengers() {
        return maxPassengers;
    }

    // Mutator (setter)
    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    // Override toString to display only name and max passengers
    @Override
    public String toString() {
        return "Cruise Ship Name: " + getName() + ", Maximum Passengers: " + maxPassengers;
    }
}
