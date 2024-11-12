package org.example;

final class Ship extends WaterTransport {
    private int passengerCapacity;

    public Ship(String name, FuelType fuelType, int passengerCapacity) {
        super(name, fuelType);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Ship: " + name + ", Fuel Type: " + fuelType + ", Passenger Capacity: " + passengerCapacity);
    }

    @Override
    public void operate() {
        System.out.println("Navigating the ship...");
    }
}