package ru.job4j.comparator;
import java.util.Arrays;
import java.util.Collections;

public class ArraysSort {
    public static long[] sort(long[] data) {

        Arrays.sort(data);

        return data;
    }

    public static void main(String[] args) {
        long[] data = {3, 2, 1};
        long[] result = ArraysSort.sort(data);

    }
}
