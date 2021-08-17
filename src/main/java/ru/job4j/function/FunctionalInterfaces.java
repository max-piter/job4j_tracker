package ru.job4j.function;

import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.function.*;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        BiConsumer<Integer, String> biCon = (s, s1) -> map.put(s, s1);
        biCon.accept(1, "one");
        biCon.accept(2, "two");
        biCon.accept(3, "three");
        biCon.accept(4, "four");
        biCon.accept(5, "five");
        biCon.accept(6, "six");
        biCon.accept(7, "seven");

        BiPredicate<Integer, String> biPred =  (i, s) -> i % 2 == 0 || map.get(i).length() == 4;

        for (Integer i : map.keySet()) {
            if (biPred.test(i, map.get(i))) {
                System.out.println("key: " + i + " value: " + map.get(i));
            }
        }

        List<String> strings = new ArrayList<>(map.values());
        Supplier<List<String>> sup = () -> new ArrayList<>(strings);

        Consumer<String> con = (s) -> System.out.println(s);
        Function<String, String> func = s -> s.toUpperCase();
        for (String s : strings) {
            System.out.println(s.toUpperCase());
        }
    }
}
