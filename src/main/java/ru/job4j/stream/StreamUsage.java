package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUsage {

    /**
     * Метод  проверяет положительное число или отрицательное
     * @param i метод  принимает в параметр любое число типа int
     * @return возвращает true, если число положительное
     */
    public static boolean ifPositive(int i) {
        return i > 0;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = -100; i <= 100; i++) {
            list.add(i);
        }

        List<Integer> newList = list.stream().filter(
                StreamUsage::ifPositive).collect(Collectors.toList());
        newList.forEach(System.out::println);
    }

}
