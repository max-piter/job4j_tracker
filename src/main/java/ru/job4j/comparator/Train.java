package ru.job4j.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Train {
    public static void main(String[] args) {
        String s = "K/SS7/SS12/SS3/SSS4";
        String[] str = s.split("/");
        System.out.println(Arrays.toString(str));
        Arrays.stream(str).sorted(Comparator.naturalOrder());
        System.out.println(Arrays.toString(str));

    }
}
