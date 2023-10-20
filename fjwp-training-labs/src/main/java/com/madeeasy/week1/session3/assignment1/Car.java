package com.madeeasy.week1.session3.assignment1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

/**
 * The type Car.
 */
/*@Data*/
@ToString
@AllArgsConstructor
@Slf4j
public class Car {
    private String make;
    private String model;
    private short year;
    private int price;

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter car details: \n");

        System.out.print("Make: ");
        String make = scanner.nextLine();

        System.out.print("Model: ");
        String model = scanner.nextLine();

        System.out.print("Year: ");
        short year = scanner.nextShort();

        System.out.print("Price: $");
        int price = scanner.nextInt();

        Car car = new Car(make, model, year, price);

        System.out.println("\nCar Details:");
        System.out.println(car);

        scanner.close();
    }
}

/**
 * o/p
 * Enter car details:
 * Make: Toyota
 * Model: Camry
 * Year: 2022
 * Price: $25000
 * <p>
 * Car Details:
 * Car(make=Toyota, model=Camry, year=2022, price=25000)
 */