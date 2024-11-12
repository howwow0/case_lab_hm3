package org.example;

final class Boat extends WaterTransport {
    private double length;

    public Boat(String name, FuelType fuelType, double length) {
        super(name, fuelType);
        this.length = length;
    }

    @Override
    public void displayInfo() {
        System.out.println("Boat: " + name + ", Fuel Type: " + fuelType + ", Length: " + length + " meters");
    }

    @Override
    public void operate() {
        System.out.println("Sailing the boat...");
    }
}