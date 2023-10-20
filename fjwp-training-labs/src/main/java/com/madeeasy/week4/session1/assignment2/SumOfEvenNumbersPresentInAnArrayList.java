package com.madeeasy.week4.session1.assignment2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfEvenNumbersPresentInAnArrayList {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5)
        );

        // calculating sum using stream
        int sum = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n)
                .sum();
        // printing sum
        System.out.println("Sum: " + sum);

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> integerStream1 = integerStream.flatMap(n -> n % 2 == 0 ? Stream.of(n) : Stream.empty());

        // Creating a list of words
        List<String> words = Arrays.asList("Java", "Stream", "flatMap", "Example");

        // Using flatMap to split each word into characters and collect them into a single list
        List<String> letters = words.stream()
                .peek(System.out::println)
                .flatMap(word -> Arrays.stream(word.split("")))
                .peek(System.out::println)
                .collect(Collectors.toList());

        // Printing the resulting list of letters
        System.out.println("List of letters: " + letters);

    }
}

/**
 * o/p
 * ----
 * Sum: 6
 */