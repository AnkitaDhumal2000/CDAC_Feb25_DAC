// Abstract class Vehicle
abstract class Vehicle {
    // Abstract method (to be implemented by child class)
    abstract void run();

    // Concrete method (already implemented)
    void fuelType() {
        System.out.println("Most vehicles use petrol or diesel.");
    }
}

// Concrete class Bike extending Vehicle
class Bike extends Vehicle {
    // Implementing abstract method
    void run() {
        System.out.println("Bike is running smoothly...");
    }

    // Static method
    static void avg() {
        System.out.println("The average mileage of the bike is 40 km/l.");
    }

    // Non-static method
    void show() {
        System.out.println("This is a sports bike!");
    }
}

// Driver class
public class Homework1 {
    public static void main(String[] args) {
        // Reference of Vehicle, object of Bike (Upcasting)
        Vehicle myBike = new Bike();

        // Calling implemented abstract method
        myBike.run();

        // Calling concrete method from abstract class
        myBike.fuelType();

        // Calling static method using class name
        Bike.avg();

        // Calling non-static method using object
        Bike bikeObj = new Bike();
        bikeObj.show();
    }
}
