package com.madeeasy.week2.session5.assignment2;

import java.util.Scanner;

public class AdditionOfTwoMatricesUsingWrapperClasses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for 2D array : ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns for 2D array : ");
        int columns = scanner.nextInt();

        // checking invalid dimensions
        if (rows <= 0 || columns <= 0) {
            System.out.println("Invalid array dimensions.");
            return;
        }
        Integer[][] maxtrix1 = new Integer[rows][columns];
        Integer[][] maxtrix2 = new Integer[rows][columns];
        Integer[][] sumMatrix = new Integer[rows][columns];

        // input matrix1
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter the element " + (i + 1) + "," + (j + 1) + " : ");
                maxtrix1[i][j] = scanner.nextInt();
            }
        }
        // input matrix2
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter the element " + (i + 1) + "," + (j + 1) + " : ");
                maxtrix2[i][j] = scanner.nextInt();
            }
        }
        // add matrix1 and matrix2
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sumMatrix[i][j] = maxtrix1[i][j] + maxtrix2[i][j];
            }
        }
        System.out.println();
        System.out.println("Displaying the sum matrix: ");
        // display sum matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}

/**
 * Enter the number of rows for 2D array : 2
 * Enter the number of columns for 2D array : 2
 * Enter the element 1,1 : 45
 * Enter the element 1,2 : 35
 * Enter the element 2,1 : 45
 * Enter the element 2,2 : 8
 * Enter the element 1,1 : 354
 * Enter the element 1,2 : 84
 * Enter the element 2,1 : 85
 * Enter the element 2,2 : 45
 * <p>
 * Displaying the sum matrix:
 * 399 119
 * 130 53
 */