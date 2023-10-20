package com.madeeasy.week2.session2.assignment1;

import java.util.Scanner;

/**
 * The type Armstrong number.
 */
public class ArmstrongNumber {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        // using ternary operator or you can use if-else statements
        System.out.println(isArmstrong(n) ? (n + " is an Armstrong number.") : (n + " is not an Armstrong number."));

        scanner.close();
    }

    /**
     * This function checks if a given number is an Armstrong number or not.
     *
     * @param number - the integer parameter
     * @return the boolean
     */
    static boolean isArmstrong(int number) {

        // Store the original number to compare later
        int originalNumber = number;

        // Initialize a variable to store the result of the Armstrong number check
        int result = 0;
        int n = String.valueOf(number).length(); // Number of digits in 'number'

        // Extract each digit of 'number', raise it to the power of 'n', and add it to 'result'
        while (number > 0) {
            int digit = number % 10; // Extract the last digit
            result += Math.pow(digit, n);  // Add the digit raised to the power of 'n' to 'result'
            number /= 10;  // Remove the last digit to process the next digit
        }
        // Check if 'result' is equal to the original number; if so, it's an Armstrong number
        return result == originalNumber;
    }
}

/**
 * o/p
 * Enter a number: 153
 * 153 is an Armstrong number.
 */