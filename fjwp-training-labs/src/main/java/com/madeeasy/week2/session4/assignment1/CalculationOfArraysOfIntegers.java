package com.madeeasy.week2.session4.assignment1;

import java.util.Scanner;

public class CalculationOfArraysOfIntegers {

    public static void main(String[] args) {


        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Check if the user entered a valid number of elements
        if (n <= 0) {
            System.out.println("You entered an invalid number of elements.");
            return; // Exit the program if the input is invalid
        }

        // Create an array to store the entered elements
        int[] arr = new int[n];
        int sum = 0;

        // Prompt the user to enter each element of the array
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }

        // Calculate the average of the elements (cast sum to double for accuracy)
        double average = (double) sum / n;

        // Display the sum and average of the elements
        System.out.println("Sum of the elements: " + sum);
        System.out.println("Average of the elements: " + average);

        // Close the Scanner to release system resources
        scanner.close();
    }
}

/**
 * o/p
 * ----
 * Enter the number of elements in the array: 5
 * Enter the elements of the array:
 * Element 1: 45
 * Element 2: 33
 * Element 3: 78
 * Element 4: 15
 * Element 5: 82
 * Sum of the elements: 253
 * Average of the elements: 50.6
 */