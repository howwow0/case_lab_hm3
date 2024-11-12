package org.example;

abstract class Transport implements Operable {
    protected String name;
    protected FuelType fuelType;

    public Transport(String name, FuelType fuelType) {
        this.name = name;
        this.fuelType = fuelType;
    }

    public abstract void displayInfo();
}