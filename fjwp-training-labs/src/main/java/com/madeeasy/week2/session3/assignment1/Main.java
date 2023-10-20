package com.madeeasy.week2.session3.assignment1;


/**
 * The type Vehicle.
 */
class Vehicle {
    /**
     * Start.
     */
    void start() {
        System.out.println("Vehicle started.");
    }
}

/**
 * The type Motorcycle.
 */
class Motorcycle extends Vehicle {
    void start() {
        System.out.println("Motorcycle started.");
    }
}

/**
 * The type Car.
 */
class Car extends Vehicle {
    void start() {
        System.out.println("Car started.");
    }
}

/**
 * The type Garage.
 */
class Garage {
    /**
     * Service vehicle.
     *
     * @param vehicle the vehicle
     */
    public void serviceVehicle(Vehicle vehicle) {
        vehicle.start();
        System.out.println("vehicle serviced");
    }
}

/**
 * The type AbstractionExample.
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Garage garage = new Garage();
        garage.serviceVehicle(new Car());
        garage.serviceVehicle(new Motorcycle());
    }
}

/**
 * o/p
 * Car started.
 * vehicle serviced
 * Motorcycle started.
 * vehicle serviced
 */