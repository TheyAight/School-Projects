// Name: Kamali Cooper
// Date: 2025-09-27
// Description: Restaurant class with private fields, accessor/mutator methods, constructor,
// and methods to make reservations and check availability. Test program creates two instances
// and tests all methods.

class Restaurant {
    private String name;
    private int numberOfTables;
    private int numberOfReservations;

    public Restaurant() {
        this.name = "Unknown";
        this.numberOfTables = 10;
        this.numberOfReservations = 0;
    }

    public Restaurant(String name, int numberOfTables, int numberOfReservations) {
        this.name = name;
        this.numberOfTables = numberOfTables;
        this.numberOfReservations = numberOfReservations;
    }

    // Accessor (getter) methods
    public String getName() {
        return name;
    }

    public int getNumberOfTables() {
        return numberOfTables;
    }

    public int getNumberOfReservations() {
        return numberOfReservations;
    }

    // Mutator (setter) methods
    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfTables(int numberOfTables) {
        this.numberOfTables = numberOfTables;
    }

    public void setNumberOfReservations(int numberOfReservations) {
        this.numberOfReservations = numberOfReservations;
    }

    // Methods
    public boolean makeReservation() {
        if (numberOfReservations < numberOfTables) {
            numberOfReservations++;
            return true;
        } else {
            return false;
        }
    }

    public boolean checkAvailability() {
        return numberOfReservations < numberOfTables;
    }
}

class TestRestaurant {
    public static void main(String[] args) {
        // Create two instances
        Restaurant r1 = new Restaurant("Pasta Palace", 5, 2);
        Restaurant r2 = new Restaurant("Sushi Spot", 8, 8);

        // Test all methods
        System.out.println("Testing Restaurant 1:");
        System.out.println("Name: " + r1.getName());
        System.out.println("Tables: " + r1.getNumberOfTables());
        System.out.println("Reservations: " + r1.getNumberOfReservations());
        System.out.println("Check Availability: " + r1.checkAvailability());
        System.out.println("Make Reservation: " + r1.makeReservation());
        System.out.println("Reservations after making one: " + r1.getNumberOfReservations());
        System.out.println();

        System.out.println("Testing Restaurant 2:");
        System.out.println("Name: " + r2.getName());
        System.out.println("Tables: " + r2.getNumberOfTables());
        System.out.println("Reservations: " + r2.getNumberOfReservations());
        System.out.println("Check Availability: " + r2.checkAvailability());
        System.out.println("Make Reservation: " + r2.makeReservation());
        System.out.println("Reservations after making one: " + r2.getNumberOfReservations());
    }
}