package com.madeeasy.week1.session3.assignment2;

import lombok.extern.slf4j.Slf4j;

/**
 * The type Calculate.
 */
@SuppressWarnings("all")
class Calculate {
    /**
     * Add int.
     *
     * @param a the a
     * @param b the b
     * @return the int
     */
    int add(int a, int b) {
        return a + b;
    } // add

    /**
     * Add int.
     *
     * @param a the a
     * @param b the b
     * @param c the c
     * @return the int
     */
    int add(int a, int b, int c) {
        return a + b + c;
    } // add

    /**
     * Add double.
     *
     * @param a the a
     * @param b the b
     * @return the double
     */
    double add(double a, double b) {
        return a + b;
    } // add
} // class

/**
 * The type Calculator.
 */
@Slf4j
public class Calculator {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Calculate calculate = new Calculate();

        int sum1 = calculate.add(5, 7);
        int sum2 = calculate.add(2, 3, 4);
        double sum3 = calculate.add(2.5, 3.7);

        log.info("Sum of two integers: {}", sum1);
        log.info("Sum of three integers: {}", sum2);
        log.info("Sum of two doubles: {}", sum3);

    }   // method main
}   // class Calculator

/**
 * o/p
 * 19:18:02.718 [main] INFO com.madeeasy.week1.session3.assignment2.Calculator -- Sum of two integers: 12
 * 19:18:02.729 [main] INFO com.madeeasy.week1.session3.assignment2.Calculator -- Sum of three integers: 9
 * 19:18:02.729 [main] INFO com.madeeasy.week1.session3.assignment2.Calculator -- Sum of two doubles: 6.2
 */
