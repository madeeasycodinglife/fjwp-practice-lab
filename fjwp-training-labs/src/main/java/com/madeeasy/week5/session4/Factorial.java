package com.madeeasy.week5.session4.day1;

public class Factorial {

    private String name;

    public int factorial(int number) {
        if (number == 1)
            return 1;
        return number * factorial(number - 1);
    }

    // prime number method
    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
