package com.madeeasy.week2.session5.assignment1;

import java.util.Random;
import java.util.Scanner;

public class ThreeDArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for 3D array : ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns for 3D array : ");
        int columns = scanner.nextInt();
        System.out.print("Enter the number of depths for 3D array : ");
        int depth = scanner.nextInt();

        // checking invalid array dimensions
        if (rows <= 0 || columns <= 0 || depth <= 0) {
            System.out.println("Invalid array dimensions.");
            return;
        }

        int[][][] array = new int[rows][columns][depth];
        // initialize 3D array with random values
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                for (int k = 0; k < depth; k++) {
                    array[i][j][k] = random.nextInt(100);
                }
            }
        }
        // display the 3D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                for (int k = 0; k < columns; k++) {
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        // find the maximum value in 3D array
        int max = array[0][0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                for (int k = 0; k < depth; k++) {
                    if (array[i][j][k] > max) {
                        max = array[i][j][k];
                    }
                }
            }
        }
        System.out.println("Maximum value in 3D array is: " + max);
        // calculate the average of all elements
        int sum = 0;
        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                for (int k = 0; k < columns; k++) {
                    sum += array[i][j][k];
                    count++;
                }
            }
        }
        System.out.println("Average of all elements in 3D array is: " + (sum / count));
        scanner.close();
    }
}

/**
 * Enter the number of rows for 3D array : 4
 * Enter the number of columns for 3D array : 4
 * Enter the number of depths for 3D array : 4
 * 96 67 98 25
 * 36 61 26 88
 * 19 58 60 81
 * 90 38 27 76
 * <p>
 * 17 80 13 45
 * 88 44 56 90
 * 60 70 92 68
 * 13 73 35 36
 * <p>
 * 62 76 67 56
 * 65 93 10 19
 * 34 82 72 93
 * 33 61 5 16
 * <p>
 * 82 16 90 9
 * 28 93 13 67
 * 71 43 49 51
 * 21 28 92 93
 * <p>
 * Maximum value in 3D array is: 98
 * Average of all elements in 3D array is: 54
 */