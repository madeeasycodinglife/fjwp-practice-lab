package com.madeeasy.week3.session4.assignment2;


import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * The type Main.
 */
public class NullPointerExceptionAndNumberFormatException {

    /**
     * @param input taking as String and converting to int if it is not null, blank or empty
     * @return the input as an integer
     * @throws NumberFormatException for more details {@link InputMismatchException}
     * @throws NullPointerException  for more details {@link NullPointerException}
     */
    private static int convertToInteger(String input) throws NumberFormatException, NullPointerException {
        if (input.equals("null") || input.isBlank() || input.isEmpty()) { // you can use only isBlank()
            throw new NullPointerException();
        }
        return Integer.parseInt(input);
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.printf("Enter a Integer as a String : ");

            String userInput = scanner.nextLine();

            int convertToInteger = convertToInteger(userInput);

            System.out.println("Converted Integer : " + convertToInteger);

        } catch (NullPointerException e) {

            System.out.println("Oops! You have entered a null value.");

        } catch (NumberFormatException e) {

            System.out.println("Oops! You did not enter a numeric value");
        }

    }
}

/**
 * o/p
 * ----
 * Enter a Integer as a String : 222
 * Converted Integer : 222
 * <p>
 * Enter a Integer as a String : null
 * Oops! You have entered a null value.
 * <p>
 * Enter a Integer as a String :
 * Oops! You have entered a null value.
 * <p>
 * Enter a Integer as a String : sp
 * Oops! You did not enter a numeric value
 */