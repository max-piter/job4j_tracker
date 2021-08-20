package ru.job4j.function;

import java.util.function.Function;
import java.util.function.Predicate;

public class StrategyUsage {
    public static boolean check(Predicate<String> pred, String s) {
        return pred.test(s);
    }

    public String transform(Function<String, String> fun, String s) {
        return fun.apply(s);
    }

    public static void main(String[] args) {
        StrategyUsage usage = new StrategyUsage();
        String st = "";
        String st1 = "aBCdEfghKLmnpRstU";
        System.out.println("Результат работы: " + usage.check(
                str -> str.isEmpty(), st));
        System.out.println("Результат работы: " + usage.check(
                str -> str.startsWith("Fun"), "Functional interface"));
        System.out.println("Строка после преобразования: " + usage.transform(
                str -> str.toUpperCase(), st1));
        System.out.println(usage.transform(str -> str.concat("работает корректно."),
                 "Строка после преобразования "));
        System.out.println("Строка после преобразования: " + usage.transform(
                str -> str.trim(), "    aBC dEfghK Lmnp RstU        "));
        String st2 = usage.transform(str -> str.replace('a', 'b'), st1).toUpperCase();
        System.out.println(st2);
    }
}
