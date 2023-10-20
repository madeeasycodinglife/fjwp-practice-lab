package com.madeeasy.week2.session1.assignment2;

import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

@Slf4j
public class MarksAndGradesCustomCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalMarks = 500; // Total marks for 5 subjects (100 each)
        int[] subjectMarks = new int[5];

        System.out.println("Enter marks for five subjects:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            subjectMarks[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int marks : subjectMarks) sum += marks;

        double average = (double) sum / 5;
        String grade = (average > 90) ? "Ex" : (average > 80) ? "A" : (average > 60) ? "B" : (average >= 40) ? "C" :
                "F";

        log.info("Total Marks: {}", sum);
        log.info("Average Marks: {}", average);
        log.info("Grade: {}", grade);
        scanner.close();
    } // main
} // class

/**
 * o/p
 * Enter marks for five subjects:
 * Subject 1: 60
 * Subject 2: 80
 * Subject 3: 75
 * Subject 4: 68
 * Subject 5: 79
 * 18:56:04.489 [main] INFO com.madeeasy.week2.session1.assignment2.MarksAndGradesCustomCalculator -- Total Marks: 362
 * 18:56:04.498 [main] INFO com.madeeasy.week2.session1.assignment2.MarksAndGradesCustomCalculator -- Average Marks:
 * 72.4
 * 18:56:04.499 [main] INFO com.madeeasy.week2.session1.assignment2.MarksAndGradesCustomCalculator -- Grade: B
 */