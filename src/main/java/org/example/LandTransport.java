package org.example;

sealed abstract class LandTransport extends Transport permits Car, Bicycle {
    public LandTransport(String name, FuelType fuelType) {
        super(name, fuelType);
    }
}