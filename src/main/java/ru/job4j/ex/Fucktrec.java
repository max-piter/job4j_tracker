package ru.job4j.ex;

public class Fucktrec {
    public static int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Argument must be greater than or equals to zero");
        }
        int rsl;
        if (n == 0 || n == 1) {
            rsl = 1;
        } else {
            rsl = calc(n - 1) * n;
        }
        return  rsl;
    }

    public static void main(String[] args) {
        int rsl = calc(3);
        System.out.println(rsl);
    }
}
