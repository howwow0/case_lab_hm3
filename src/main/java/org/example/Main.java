package org.example;

public class Main {
    public static void main(String[] args) {
        Transport car = new Car("Sedan", FuelType.GASOLINE, 4);
        Transport bicycle = new Bicycle("Mountain Bike", true);
        Transport boat = new Boat("Speedboat", FuelType.DIESEL, 5.5);
        Transport ship = new Ship("Cruise Liner", FuelType.DIESEL, 3000);

        car.displayInfo();
        car.operate();

        bicycle.displayInfo();
        bicycle.operate();

        boat.displayInfo();
        boat.operate();

        ship.displayInfo();
        ship.operate();
    }
}
