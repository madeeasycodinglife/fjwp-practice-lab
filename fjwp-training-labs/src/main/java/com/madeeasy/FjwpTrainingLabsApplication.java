package com.madeeasy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FjwpTrainingLabsApplication {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String nextChoice = null;
        while (true) {
            try {
                System.out.println("Book Management System");
                System.out.println("1. Add a Book");
                System.out.println("2. View all Books");
                System.out.println("3. Update a Book");
                System.out.println("4. Delete a Book");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");

                int choice = scanner.nextInt();
//                if (nextChoice != null) {
//                    choice = Integer.parseInt(nextChoice);
//                }
                switch (choice) {
                    case 1:
                        System.out.println("hello");
                        break;
                    case 2:

                        break;
                    // Add cases for other choices
                    case 5:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer choice.");
                scanner.next(); // consume the invalid input
                continue; // continue the loop
            }
        }
    }

}