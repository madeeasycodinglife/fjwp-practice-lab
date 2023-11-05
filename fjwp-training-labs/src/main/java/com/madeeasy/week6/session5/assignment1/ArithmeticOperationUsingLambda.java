package com.madeeasy.week6.session5.assignment1;

import java.util.function.BiConsumer;

public class ArithmeticOperationUsingLambda {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> addition =
                (a, b) -> System.out.println("Addition of two number is : " + (a + b));
        BiConsumer<Integer, Integer> subtraction =
                (a, b) -> System.out.println("Subtraction of two number is : " + (a - b));
        BiConsumer<Integer, Integer> multiplication =
                (a, b) -> System.out.println("Multiplication of two number is : " + (a * b));
        BiConsumer<Integer, Integer> division =
                (a, b) -> System.out.println("Division of two number is : " + (a / b));
        addition.accept(15, 28);
        subtraction.accept(91, 62);
        multiplication.accept(41, 52);
        division.accept(69, 29);
    }
}

/**
 * o/p
 * ---
 * Addition of two number is : 43
 * Subtraction of two number is : 29
 * Multiplication of two number is : 2132
 * Division of two number is : 2
 */
