package com.LabActivitiesday2;

import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private String ISBN;
    Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }
    public void printDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + ISBN);
    }
}

public class MyBook {

    private ArrayList<Book> bookCollection;
    public MyBook() {
        bookCollection = new ArrayList<>();
    }
    public void addBook(Book book) {
        bookCollection.add(book);
        System.out.println("Book added: " + book.getTitle());
    }
    public void removeBook(String ISBN) {
        Book bookToRemove = null;
        for (Book book : bookCollection) {
            if (book.getISBN().equals(ISBN)) {
                bookToRemove = book;
                break;
            }
        }
        if (bookToRemove != null) {
            bookCollection.remove(bookToRemove);
            System.out.println("Book removed: " + bookToRemove.getTitle());
        } else {
            System.out.println("Book with ISBN " + ISBN + " not found.");
        }
    }
    public void printAllBooks() {
        if (bookCollection.isEmpty()) {
            System.out.println("No books in the collection.");
        } else {
            System.out.println("Books in the collection:");
            for (Book book : bookCollection) {
                book.printDetails();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyBook myBookCollection = new MyBook();
        Book book1 = new Book("The Great King", "F. Scott Fitzgerald", "51234");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "51235");
        Book book3 = new Book("1984", "George Orwell", "51236");

        myBookCollection.addBook(book1);
        myBookCollection.addBook(book2);
        myBookCollection.addBook(book3);
        myBookCollection.printAllBooks();
        System.out.print("\nEnter the title of the new book: ");
        String title = scanner.nextLine();
        System.out.print("Enter the author of the new book: ");
        String author = scanner.nextLine();
        System.out.print("Enter the ISBN of the new book: ");
        String ISBN = scanner.nextLine();

        Book newBook = new Book(title, author, ISBN);
        myBookCollection.addBook(newBook);
        myBookCollection.printAllBooks();
        System.out.print("\nEnter the ISBN of the book to remove: ");
        String removeISBN = scanner.nextLine();
        myBookCollection.removeBook(removeISBN);
        myBookCollection.printAllBooks();
    }
}
