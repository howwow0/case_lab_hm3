package org.example;

final class Bicycle extends LandTransport {
    private boolean hasGears;

    public Bicycle(String name, boolean hasGears) {
        super(name, FuelType.NONE);
        this.hasGears = hasGears;
    }

    @Override
    public void displayInfo() {
        System.out.println("Bicycle: " + name + ", Has Gears: " + hasGears);
    }

    @Override
    public void operate() {
        System.out.println("Riding the bicycle...");
    }
}