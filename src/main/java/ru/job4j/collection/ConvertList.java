package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ConvertList {
    public static List<Integer> convert(List<int[]> list) {
        List<Integer> rsl = new ArrayList<>();
        for (int[] i: list) {
            for (int cell : i) {
                rsl.add(cell);
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        Integer first = 1;
        Integer second = 2;
        int rsl = first.compareTo(second);
        System.out.println(rsl);
        List<Integer> list = Arrays.asList(5, 3, 4, 1, 2);
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
