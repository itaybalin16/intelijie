public class Main {
    public static void main(String[] args) {
        // Create a parking lot with 2 regular spots and 1 handicapped spot
        Parkinglot lot = new Parkinglot(1, "Itay Parking", "Main Street", 2, 1);

        // Create some cars
        Car car1 = new Car("Toyota", "Corolla", "Red", 2020, "123-ABC", false);
        Car car2 = new Car("Honda", "Civic", "Blue", 2021, "456-DEF", true);
        Car car3 = new Car("Mazda", "3", "White", 2019, "789-GHI", false);

        // Park cars
        lot.park(car1, car1.isHandicapped());
        lot.park(car2, car2.isHandicapped());
        lot.park(car3, car3.isHandicapped()); // should fill the lot

        // Print the current state of the lot
        System.out.println(lot);

        // Try parking another car (no room)
        Car car4 = new Car("BMW", "X1", "Black", 2022, "000-ZZZ", false);
        boolean success = lot.park(car4, car4.isHandicapped());
        System.out.println("Was able to park car4? " + success);
    }
}
