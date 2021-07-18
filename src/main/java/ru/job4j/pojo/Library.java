package ru.job4j.pojo;
import java.util.Arrays;

public class Library {
    public static void main(String[] args) {
        Book first = new Book("Java Forever", 500);
        Book second = new Book("The Birth of Developer", 501);
        Book third = new Book("The Death of Developer", 502);
        Book fourth = new Book("Clean code", 503);
        Book[] books = new Book[4];
        books[0] = first;
        books[1] = second;
        books[2] = third;
        books[3] = fourth;

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " " + books[i].getPages() + "p.");
        }

        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " " + books[i].getPages() + "p.");
        }

        for (int i = 0; i < 4; i++) {
            if ("Clean code".equals(books[i].getName())) {
                System.out.println(books[i].getName() + " " + books[i].getPages() + "p.");
            }
        }
    }
}
