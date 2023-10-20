package com.madeeasy.week2.session2.assignment2;

import java.util.Scanner;

/**
 * The type Enhanced gross salary calculator.
 */
public class EnhancedGrossSalaryCalculator {

    double add(double a,int b){
        return a+b;
    }
    double add(int b,double a){
        return b+a;
    }
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int choice = 0;

        // Start a loop for multiple calculations
        while (choice != 2) {

            // Prompt the user to select an employee category
            System.out.print("Enter the basic salary: ");
            double basicSalary = scanner.nextDouble();

            double hra = 0.D, da = 0.D, grossSalary = 0.D;

//            System.out.println("Select employee category 1 for basic, 2 for executive, 3 for manager: "); // if
//            required
            System.out.printf("Select employee category 1 for basic: ");
            int category = scanner.nextInt();
            switch (category) {
                case 1 -> {
                    if (basicSalary > 15000) {
                        hra = 0.20 * basicSalary;
                        da = 0.60 * basicSalary;
                    } else {
                        hra = 3000;
                        da = 0.70 * basicSalary;
                    }
                }
                case 2 -> {
                    // if required
                    // Define complex logic for executive category
                    // You can add different allowances, bonuses, etc.
                    continue;
                }
                case 3 -> {
                    // if required
                    // Define complex logic for manager category
                    // You can add different allowances, bonuses, etc.
                    continue;
                }
                default -> {
                    System.out.println("Invalid category.");
                    continue; // Prompt for input again
                }
            }

            // calculate gross salary
            grossSalary = basicSalary + hra + da;

            System.out.println("Gross Salary: " + grossSalary);

            // Prompt the user to select a choice (1 for calculation, 2 for exit)
            System.out.printf("Select choice 1 for calculation and 2 for exit: ");
            choice = scanner.nextInt();
        }
        scanner.close();
    }

}

/**
 * o/p
 * Enter the basic salary: 10000
 * Select employee category 1 for basic: 1
 * Gross Salary: 20000.0
 * Select choice 1 for calculation and 2 for exit: 2
 */