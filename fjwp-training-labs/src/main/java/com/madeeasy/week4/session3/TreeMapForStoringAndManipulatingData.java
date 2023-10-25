package com.madeeasy.week4.session3;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapForStoringAndManipulatingData {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TreeMap<String, String> dictionary = new TreeMap<>();

        while (true) {
            System.out.println("1) Add word-definition pair.");
            System.out.println("2) Retrieve word-definition pair.");
            System.out.println("3) Display all word-definition pairs in alphabetical order.");
            System.out.println("4) Exit.");
            System.out.print("Enter your choice : ");
            int choice;
            while (true) {
                try {
                    choice = Integer.parseInt(scanner.next().trim());
                    scanner.nextLine(); // to consume newline character
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Sorry, you have to enter a number !!");
                    System.out.print("Enter your choice : ");
                } catch (InputMismatchException e) {
                    System.out.println("Invalid choice!! \nplease try again later");
                    System.out.print("Enter your choice : ");
                }
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter the word : ");
                    String word = scanner.nextLine();
                    System.out.print("Enter the definition : ");
                    String definition = scanner.nextLine();
                    dictionary.put(word, definition);
                    break;
                case 2:
                    System.out.print("Enter the word to retrieve its definition : ");
                    String wordToRetrieve = scanner.nextLine();
                    String definitionToRetrieve = (dictionary.containsKey(wordToRetrieve)) ?
                            dictionary.get(wordToRetrieve) : null;
                    if (definitionToRetrieve != null) {
                        System.out.println("Definition : " + definitionToRetrieve);
                    } else {
                        System.out.println("Word not found.");
                    }
                    break;
                case 3:
                    System.out.println("All word-definition pairs in alphabetical order : ");
                    for (String key : dictionary.keySet()) {
                        System.out.println(key + " : " + dictionary.get(key));
                    }
                    break;
                case 4:
                    System.out.println("Thanks for using this dictionary application.");
                    return;
                default:
                    System.out.println("Invalid choice . Please try again later");
            }
        }
    }
}
