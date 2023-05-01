package com.demo.streamAPI;

import java.util.ArrayList;

public class LibraryMain {

    public static void main(String[] args) {
        ArrayList<Book> books = populateLibrary();
        books.parallelStream()
                .filter(book -> book.getAuther().contains("e"))
                .forEach(System.out::println);
    }

    public static ArrayList<Book> populateLibrary() {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Medy","God of war 1"));
        books.add(new Book("Medy","God of war 2"));
        books.add(new Book("Medy","God of war 3"));
        books.add(new Book("JK Rollings","Harry Potter 1"));
        books.add(new Book("JK Rollings","Harry Potter 2"));
        books.add(new Book("JK Rollings","Harry Potter 3"));
        books.add(new Book("JK Rollings","Harry Potter 4"));
        books.add(new Book("JK Rollings","Harry Potter 5"));
        books.add(new Book("JK Rollings","Harry Potter 6"));
        books.add(new Book("JK Rollings","Harry Potter 7"));
        books.add(new Book("John green","divergent"));
        books.add(new Book("John green","insurgent"));
        books.add(new Book("John green","alligent"));
        books.add(new Book("John green","four"));
        return books;
    }
}
