/*
 * Name: Kamali J. Cooper
 * Date: November 1, 2025
 * Description: This class represents a general Ship with a name and the year it was built.
 */

public class Ship {
    // Fields (attributes)
    private String name;
    private String yearBuilt;

    // Constructor
    public Ship(String name, String yearBuilt) {
        this.name = name;
        this.yearBuilt = yearBuilt;
    }

    // Accessor (getter) for name
    public String getName() {
        return name;
    }

    // Mutator (setter) for name
    public void setName(String name) {
        this.name = name;
    }

    // Accessor (getter) for year built
    public String getYearBuilt() {
        return yearBuilt;
    }

    // Mutator (setter) for year built
    public void setYearBuilt(String yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    // toString method that returns the ship's name and year built
    public String toString() {
        return "Ship Name: " + name + ", Year Built: " + yearBuilt;
    }
}
