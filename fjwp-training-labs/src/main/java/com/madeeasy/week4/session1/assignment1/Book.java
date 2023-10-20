package com.madeeasy.week4.session1.assignment1;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;

public class Book {
    private String bookId;
    private String bookName;
    private String authorName;

    /**
     * this is to initialize the book object
     *
     * @param bookId
     * @param bookName
     * @param authorName
     */
    public Book(String bookId, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    public static void main(String[] args) {

        // creating empty listOfBooks
        List<Book> listOfBooks = new ArrayList<>();

        // adding books to listOfBooks
        Stream.of(
                        new Book(UUID.randomUUID().toString(), "Best core Java guides", "abc"),
                        new Book(UUID.randomUUID().toString(), "Servlet and JSP", "xyz"),
                        new Book(UUID.randomUUID().toString(), "Beginners Guide Spring and Spring Boot", "pqr")
                )
                .forEach(listOfBooks::add);

        // printing listOfBooks using stream
        // listOfBooks.forEach(System.out::println);

        // printing listOfBooks using enhanced for loop
        for (Book book : listOfBooks) {
            System.out.println(book);
        }

    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId='" + bookId + '\'' +
                ", bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                '}';
    }
}

/**
 * o/p
 * ----
 * Book{bookId='8f4bc901-0e75-4816-a0d8-6c490cd463b4', bookName='Best core Java guides', authorName='abc'}
 * Book{bookId='f292bf77-6fdd-4303-9615-433d65b49877', bookName='Servlet and JSP', authorName='xyz'}
 * Book{bookId='c08baa6b-4e69-44fb-bbcb-7edeee0e97a6', bookName='Beginners Guide Spring and Spring Boot',
 * authorName='pqr'}
 */