package ru.job4j.stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Stream.*;

public class TerminalForPrimitive {
    private int[] data;

    public TerminalForPrimitive(int[] data) {
        this.data = data;
    }

    public long count() {
        return Arrays.stream(data).count();
    }

    public long max() {
      return   Arrays.stream(data).max().getAsInt();
    }

    public long min() {
        return   Arrays.stream(data).min().getAsInt();
    }

    public double avg() {
        return Arrays.stream(data).average().getAsDouble();
    }

    public long sum() {
      return  Arrays.stream(data).sum();
    }

    public static void out(int n) {
        IntStream.range(0, n).forEach(System.out::println);
    }

    public static void out1(int n) {
        IntStream.iterate(n, i -> i >= 0, i -> i - 1)
                .skip(1)
                .forEach(el -> System.out.println(el));
    }

    public static void out3(int m, int n) {
        IntStream.iterate(m, i -> i > n, i -> i - 1)
                .forEach(System.out :: println);
    }

    public static void sweetPrice(int price) {
        IntStream.range(1, 6)
                .map(sweet -> sweet * price)
                .forEach(System.out::println);

    }

    public static int mult(int a, int b) {
        return IntStream.range(a, b + 1)
                .reduce((acum, el) -> acum * el).getAsInt();
    }

    public static int calculate(int a, int n) {
        return  Stream.of(a).mapToDouble(el -> Math.pow(el, n))
                .findFirst()
                .stream().mapToInt(el -> (int) el)
                .findFirst().getAsInt();
    }

    public static void out4(int n) {
        IntStream.iterate(1, i -> i <= n, i -> i + 1)
        .filter(el -> n % el == 0).forEach(System.out::println);
    }

    public static int count(int a, int b) {
        return (int) IntStream.iterate(a, i -> i <= b, i -> i + 1)
                .filter(el -> el % 2 != 0).count();
    }

    public static int sum(int a, int b) {
       return IntStream.iterate(a, i -> i <= b, i -> i + 2).sum();
    }

    public static int mod(int n, int d) {
       int i = n;
        while (i >= d) {
            i = i - d;
       }
       return i;
    }

    public static int sum(int num) {
//        int sum = 0;
//        while (num != 0) {
//            //Суммирование цифр числа
//            sum += (num % 10);
//            num /= 10;
//        }
      return   Stream.of(num).map(el -> {
          int sum = 0;
          while (el != 0) {
              //Суммирование цифр числа
              sum += (el % 10);
              el /= 10;
          }
          return sum;
      }
      ).findFirst().get();
    }

    public static String collect(String s) {

     return  Arrays.stream(s.split(" "))
             .flatMap(el -> Arrays.stream(el.split("")))
              .filter(el -> el.equals(el.toUpperCase()))
              .reduce((accum, b) -> accum + b)
              .get();

    }

    public static int combineSize(int[] a, int[] b) {
        return a.length  + b.length;
    }

    public static void main(String[] args) {
      String a  =   TerminalForPrimitive.collect("North Atlantic Treaty Organization");
        System.out.println(a);

        int[] ar = {1, 2, 3};
        int[] b = {4, 5, 6, 7, 8};
        int c = TerminalForPrimitive.combineSize(ar, b);
        System.out.println(c);
    }
}
