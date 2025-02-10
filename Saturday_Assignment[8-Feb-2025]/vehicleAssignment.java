package assignment;

class Vehicle {
    public void drive() {
        System.out.println("Vehicle is driving");
    }
}

class Car extends Vehicle {
    
    public void drive() {
        System.out.println("Repairing a car");
    }
}

public class vehicleAssignment {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.drive();

        Car car = new Car();
        car.drive();
    }
}
