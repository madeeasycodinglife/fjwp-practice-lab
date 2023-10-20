package com.madeeasy.special.practice.day1.service;

import com.madeeasy.special.practice.day1.exception.BookNotFoundException;
import com.madeeasy.special.practice.day1.model.Author;
import com.madeeasy.special.practice.day1.model.Book;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class BookService {
    static int id = 1;
    Scanner scanner = new Scanner(System.in);
    private List<Book> books = new ArrayList<>();

    // method to save new book details
    public void saveBook() {
        System.out.print("Enter Book Name: ");
        String bookName = scanner.nextLine();

//        System.out.print("Enter Book Price: ");
//        double bookPrice = scanner.nextDouble();
//        // consume the new line character
//        scanner.nextLine();

        System.out.print("Enter Book Price: ");
        double bookPrice;
        while (true) {
            try {
                bookPrice = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid number for the price.");
                System.out.print("Enter Book Price: ");
            }
        }

        System.out.print("Enter Book Edition: ");
        String bookEdition = scanner.nextLine();

        System.out.print("Enter Author Name: ");
        String authorName = scanner.nextLine();

        Author author = new Author(id, authorName);

        Book book = new Book(id, bookName, bookPrice, bookEdition, author);

        books.add(book);
        id++;
        System.out.println("Book details saved successfully !!");
    }

    // display all books
    public void displayAllBooks() {
        if (!books.isEmpty()) {

            for (Book book : books) {
                System.out.println("Book id : " + book.getBookId());
                System.out.println("Book name : " + book.getBookName());
                System.out.println("Price : " + book.getBookPrice());
                System.out.println("Edition : " + book.getEdition());
                System.out.println("Author id : " + book.getAuthor().getAuthorId());
                System.out.println("Author name : " + book.getAuthor().getAuthorName());
                System.out.println("=============================");
            }
        } else {
            System.out.println("No books available !!");
        }
    }

    // method to find book by id
    public Book findById(int bookId) {

        for (Book book : books) {
            if (book.getBookId() == bookId) {
                return book;
            }
        }
        return null;
    }

    // update book by id
    public void updateBookById(int bookId) {
        Book book = findById(bookId);
        double bookPrice = 0;
        if (book == null) {
            throw new BookNotFoundException("Book not found");
        }
        System.out.println("Enter book name: ");
        String bookName = scanner.nextLine();

        System.out.println("Enter book price: ");
        try {
            bookPrice = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Please enter book price in decimal format");
        }

        System.out.println("Enter book edition: ");
        String edition = scanner.nextLine();

        System.out.println("Enter Author name: ");
        String authName = scanner.nextLine();

        Author updatedAuthor = new Author(book.getAuthor().getAuthorId(), authName);
        Book updateBook = new Book(book.getBookId(), bookName, bookPrice, edition, updatedAuthor);

        //update
        books.set(book.getBookId() - 1, updateBook);
        System.out.println("Book details updated successfully!!");

    }

    // delete book by id
    public void deleteBookByBookId(int bookId) {
        Book book = findById(bookId);
        if (book == null) {
            throw new BookNotFoundException("Book not found");
        }
        books.remove(book);
        System.out.println("Book with id : " + book.getBookId() + " has been removed successfully");
    }

    // display book by id
    public void displayBookById(int bookId) {
        Book book = findById(bookId);
        if (book == null) {
            throw new BookNotFoundException("Book not found");
        }
        System.out.println("Book id : " + book.getBookId());
        System.out.println("Book name : " + book.getBookName());
        System.out.println("Price : " + book.getBookPrice());
        System.out.println("Edition : " + book.getEdition());
        System.out.println("Author id : " + book.getAuthor().getAuthorId());
        System.out.println("Author name : " + book.getAuthor().getAuthorName());
    }

}
