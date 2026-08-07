
class Vehicle {
    public void drive() {
        System.out.println("Repairing a vehicle");
    }
} 
class Car extends Vehicle {
    // Use the @Override annotation to indicate that this method overrides a method in the superclass
    @Override
    // Define the drive method
    public void drive() {
        // Print "Repairing a car" to the console
        System.out.println("Repairing a car");
    }
} 
// Define the main class
public class Main1 {
    // Define the main method
    public static void main(String[] args) {
        // Create an instance of Vehicle
        Vehicle vehicle = new Vehicle();
        // Create an instance of Car
        Car car = new Car();
        vehicle.drive(); 
        car.drive();
    }
}