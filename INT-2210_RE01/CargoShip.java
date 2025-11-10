/*
 * Name: Kamali J. Cooper
 * Date: November 1, 2025
 * Description: This class represents a CargoShip, which extends Ship and adds cargo capacity in tons.
 */

public class CargoShip extends Ship {
    // Field for cargo capacity (in tons)
    private int cargoCapacity;

    // Constructor (calls parent constructor)
    public CargoShip(String name, String yearBuilt, int cargoCapacity) {
        super(name, yearBuilt);
        this.cargoCapacity = cargoCapacity;
    }

    // Accessor (getter)
    public int getCargoCapacity() {
        return cargoCapacity;
    }

    // Mutator (setter)
    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    // Override toString to display only name and cargo capacity
    @Override
    public String toString() {
        return "Cargo Ship Name: " + getName() + ", Cargo Capacity: " + cargoCapacity + " tons";
    }
}
