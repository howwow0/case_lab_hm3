package org.example;

final class Car extends LandTransport {
    private int numberOfDoors;

    public Car(String name, FuelType fuelType, int numberOfDoors) {
        super(name, fuelType);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car: " + name + ", Fuel Type: " + fuelType + ", Doors: " + numberOfDoors);
    }

    @Override
    public void operate() {
        System.out.println("Driving the car...");
    }
}