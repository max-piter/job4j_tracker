package ru.job4j.ex;

public class Fact {
    public static void main(String[] args) {
        new Fact().calc(-1);

    }

    public static int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Argument must be greater than or equals to zero");
        }
        int rsl = 1;
        for (int index = 2; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }
}
