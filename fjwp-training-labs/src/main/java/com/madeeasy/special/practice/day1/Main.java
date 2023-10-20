package com.madeeasy.special.practice.day1;

import com.madeeasy.special.practice.day1.exception.BookNotFoundException;
import com.madeeasy.special.practice.day1.service.BookService;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static BookService bService = new BookService();
    static int id, choice;

    public static void main(String[] args) {


        do {
            System.out.println("====The Grand Library====");
            System.out.println("1) Save new book details\n"
                    + "2) Display all books\n"
                    + "3) Display book using id\n"
                    + "4) Update book using id\n"
                    + "5) Delete book using id\n"
                    + "6) Exit");
            System.out.print("Enter your choice : ");
            while (true) {
                try {
                    choice = Integer.parseInt(sc.next().trim());
                    menu(choice);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Sorry, you have to enter a number !!");
                    System.out.print("Enter your choice : ");
                } catch (InputMismatchException e) {
                    System.out.println("Invalid choice!! \nplease try again later");
                    System.out.print("Enter your choice : ");
                }
            }

        } while (choice != 6);

    }

    public static void menu(int choice) {

        switch (choice) {
            case 1:
                bService.saveBook();
                break;

            case 2:
                bService.displayAllBooks();
                break;

            case 3:
                System.out.print("Enter book id :");
                id = sc.nextInt();
                try {
                    bService.displayBookById(id);
                } catch (BookNotFoundException e) {
                    System.out.println("Book not found for book id : " + id);
                }
                break;

            case 4:
                System.out.print("Enter book id to update : ");
                id = sc.nextInt();
                try {
                    bService.updateBookById(id);
                    break;
                } catch (BookNotFoundException e) {
                    System.out.println("Book not found for book id : " + id);
                }
//                break;

            case 5:
                System.out.print("Enter book id to delete : ");
                id = sc.nextInt();
                try {
                    bService.deleteBookByBookId(id);
                } catch (BookNotFoundException e) {
                    System.out.println("Book not found for book id : " + id);
                }
                break;

            case 6:
                System.out.println("Thank you for visiting!!");
                System.exit(0);
                break;

            default:
                System.out.println("Wrong Input!!");
        }
//        sc.nextLine();
    }
}
