package com.madeeasy.week3.session4.assignment1;


import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionClass {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            // taking the user input as an integer
            int userInput = scanner.nextInt();
            System.out.println("Good! you have entered an integer: " + userInput);
        } catch (InputMismatchException e) {
            System.out.println("Oops! You did not enter an integer.");
        }
    }
}

/**
 * o/p
 * ----
 * Enter an integer: 1
 * Good! you have entered an integer: 1
 * <p>
 * Enter an integer: as
 * Oops! You did not enter an integer.
 */