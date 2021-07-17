package ru.job4j.pojo;
import java.util.Arrays;

public class Library {
    public static void main(String[] args) {
        Book first = new Book();
        Book second = new Book();
        Book third = new Book();
        Book fourth = new Book();
        first.setName("Java Forever");
        second.setName("Yhe Birth of Developer");
        third.setName("The Death of Developer");
        fourth.setName("Clean code");
        Book[] books = new Book[4];
        books[0] = first;
        books[1] = second;
        books[2] = third;
        books[3] = fourth;

        for (int i = 0; i < 4; i++) {
            System.out.println(books[i].getName());
        }

        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;

        for (int i = 0; i < 4; i++) {
            System.out.println(books[i].getName());
        }

        for (int i = 0; i < 4; i++) {
            if (books[i].getName() == "Clean code") {
                System.out.println(books[i].getName());
            }
        }
    }
}
