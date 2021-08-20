package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaUsage {

    public static void main(String[] args) {
        String[] names = {
                "Ivan",
                "Petrucho",
                "Max"
        };
        Comparator<String> comp = (left, right) -> {
            System.out.println("compare - " + right.length() + " : " + left.length());
            return Integer.compare(right.length(), left.length());
        };

        Arrays.sort(names, comp);
        System.out.println(Arrays.toString(names));
    }
}
