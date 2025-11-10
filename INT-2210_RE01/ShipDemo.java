/*
 * Name: Kamali J. Cooper
 * Date: November 1, 2025
 * Description: This program demonstrates inheritance and polymorphism using Ship, CruiseShip, and CargoShip classes.
 */

public class ShipDemo {
    public static void main(String[] args) {
        // Create an array of Ship objects
        Ship[] fleet = new Ship[3];

        // Assign different types of ships (demonstrates polymorphism)
        fleet[0] = new Ship("Explorer", "1998");
        fleet[1] = new CruiseShip("Ocean Dream", "2010", 3500);
        fleet[2] = new CargoShip("Titan Carrier", "2015", 50000);

        // Loop through the array and display information about each ship
        for (Ship ship : fleet) {
            System.out.println(ship.toString());
        }
    }
}
