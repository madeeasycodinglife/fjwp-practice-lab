package com.madeeasy.week3.session1.assignment1;


/**
 * The type Vehicle.
 */
class Vehicle {

    String make;
    String model;
    int year;
    int maximumSpeed;

    /**
     * Instantiates a new Vehicle.
     *
     * @param make         the make
     * @param model        the model
     * @param year         the year
     * @param maximumSpeed the maximum speed
     */
    public Vehicle(String make, String model, int year, int maximumSpeed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.maximumSpeed = maximumSpeed;
    }

    /**
     * Drive.
     */
    public void drive() {
        System.out.println("Vehicle started.");
    }
}

/**
 * The type Car.
 */
class Car extends Vehicle {
    /**
     * Instantiates a new Car.
     *
     * @param make         the make
     * @param model        the model
     * @param year         the year
     * @param maximumSpeed the maximum speed
     */
    public Car(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    @Override
    public void drive() {
        System.out.println(make + " " + model + " Car is driving.");
    }
}

/**
 * The type Bike.
 */
class Bike extends Vehicle {
    /**
     * Instantiates a new Bike.
     *
     * @param make         the make
     * @param model        the model
     * @param year         the year
     * @param maximumSpeed the maximum speed
     */
    public Bike(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    @Override
    public void drive() {
        System.out.println(make + " " + model + " Bike is driving.");
    }
}

/**
 * The type AbstractionExample.
 */
public class InheritanceOfVehicle {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        Bike bike = new Bike("Honda", "Activa", 2015, 100);
        bike.drive();
        Car car = new Car("Maruti", "Swift", 2015, 100);
        car.drive();
    }
}
/**
 * o/p
 * ---
 * Honda Activa Bike is driving.
 * Maruti Swift Car is driving.
 */