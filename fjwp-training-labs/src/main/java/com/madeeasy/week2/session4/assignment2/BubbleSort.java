package com.madeeasy.week2.session4.assignment2;

import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get the number of elements in the array from the user
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Check if the input is valid
        if (n <= 0) {
            System.out.println("You entered an invalid number of elements.");
            return;
        }

        // Create an array to store the input elements
        int[] arr = new int[n];

        // Input: Get the elements of the array from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Sort the array using the Bubble Sort algorithm
        bubbleSort(arr);

        // Output: Display the sorted array in ascending order
        System.out.println("Sorted array in ascending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Close the scanner to release resources
        scanner.close();
    }

    // Bubble Sort algorithm for sorting the array in ascending order
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                // Compare adjacent elements
                if (arr[i] > arr[i + 1]) {
                    // Swap arr[i] and arr[i + 1]
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
}

/**
 * o/p
 * -----
 * Enter the number of elements in the array: 5
 * Enter the elements of the array:
 * Element 1: 98
 * Element 2: 15
 * Element 3: 85
 * Element 4: 8
 * Element 5: 45
 * Sorted array in ascending order:
 * 8 15 45 85 98
 */