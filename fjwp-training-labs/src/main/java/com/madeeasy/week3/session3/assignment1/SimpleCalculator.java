package com.madeeasy.week3.session3.assignment1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * The type Simple calculator.
 */
public class SimpleCalculator {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {


        double result = 0;
        // using try-with-resource
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            double firstNumber = scanner.nextDouble();

            System.out.print("Enter the operator [+, -, *, /] : ");
            char operator = scanner.next().charAt(0);

            System.out.print("Enter the second number: ");
            double secondNumber = scanner.nextDouble();


            switch (operator) {
                case '+':
                    result = firstNumber + secondNumber;
                    break;
                case '-':
                    result = firstNumber - secondNumber;
                    break;
                case '*':
                    result = firstNumber * secondNumber;
                    break;
                case '/':
                    // Use the ternary operator to handle division by zero
                    result = (secondNumber == 0) ? Double.NaN : firstNumber / secondNumber;
                    break;
                default:
                    // Display an error message for an invalid operator
                    System.err.println("Error: Invalid operator.");
                    System.exit(1);
            }
            // Check if the result is NaN (division by zero error) and display an appropriate message
            if (!Double.isNaN(result)) {
                System.out.println("Result: " + result);
            } else {
                System.err.println("Error: Division by zero is not allowed.");
            }
        } catch (InputMismatchException e) {
            // Handle invalid input (non-numeric input)
            System.err.println("Error: Invalid input. Please enter valid numbers.");
        } finally {
            System.out.println("application is running....");
        }
    }
}
/**
 * o/p
 * ---------------------------------------
 * Enter the first number: 5
 * Enter the operator [+, -, *, /] : /
 * Enter the second number: 0
 * application is running....
 * Error: Division by zero is not allowed.
 * ---------------------------------------
 * InputMismatchException will occur when we provide non-numeric input i.e. +,-,*,/ etc
 * ex ::-
 * Enter the first number: 5
 * Enter the operator [+, -, *, /] : +
 * Enter the second number: +
 * application is running....
 * Error: Invalid input. Please enter valid numbers. <--- this is within catch(InputMismatchException ex)
 */