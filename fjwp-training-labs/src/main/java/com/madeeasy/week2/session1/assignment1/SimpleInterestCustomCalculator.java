package com.madeeasy.week2.session1.assignment1;

import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

/**
 * The type Simple interest calculator.
 */
@Slf4j
public class SimpleInterestCustomCalculator {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal amount (P): ");
        double principal = scanner.nextDouble();

        System.out.print("Enter time in years (T): ");
        double time = scanner.nextDouble();

        double rate = (principal > 10000) ? 0.10 : (principal >= 5000) ? 0.08 : 0.05;

        double simpleInterest = principal * rate * time;
        System.out.println("Simple Interest: " + simpleInterest);
//        log.info("Simple Interest: {}", simpleInterest);
        scanner.close();
    } // main
} // class

/**
 * o/p
 * Enter principal amount (P): 5000
 * Enter time in years (T): 5
 * Simple Interest: 2000.0
 */
