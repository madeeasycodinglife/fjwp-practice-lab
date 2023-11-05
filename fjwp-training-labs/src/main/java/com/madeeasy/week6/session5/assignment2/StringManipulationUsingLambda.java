package com.madeeasy.week6.session5.assignment2;

import java.util.function.Consumer;

public class StringManipulationUsingLambda {
    public static void main(String[] args) {
        // converting strings to upper case
        Consumer<String> consumerToConvertStringToUpperCase = (str) -> System.out.println("Converting to UpperCase : "
                + str.toUpperCase());
        // convert to lower case
        Consumer<String> consumerToConvertStringToLowerCase =
                (str) -> System.out.println("Converting to LowerCase : " + str.toLowerCase());
        // reverse the string
        Consumer<String> consumerToReverseString =
                (str) -> System.out.println("Reversing the Original String : " + new StringBuilder().append(str).reverse().toString());
        consumerToConvertStringToUpperCase.accept("Hello, world");
        consumerToConvertStringToLowerCase.accept("Hello, world");
        consumerToReverseString.accept("Hello, world");
    }
}
/**
 * o/p
 * ---
 * Converting to UpperCase : HELLO, WORLD
 * Converting to LowerCase : hello, world
 * Reversing the Original String : dlrow ,olleH
 */