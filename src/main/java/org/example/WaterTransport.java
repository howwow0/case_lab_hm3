package org.example;

sealed abstract class WaterTransport extends Transport permits Boat, Ship {
    public WaterTransport(String name, FuelType fuelType) {
        super(name, fuelType);
    }
}