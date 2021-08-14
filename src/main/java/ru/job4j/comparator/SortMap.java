package ru.job4j.comparator;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class SortMap {
    public static Map<Integer, String> sort(Map<Integer, String> map) {
        /*
        * Методов сортировки Map нет.
        * Мы можем только получить отсортированную мапу через создание новой из исходной.
        * При данном подходе упорядочивание происходит аналогично, как через Set.
        * создаём новую и в неё запихивает старую в реверсивном порядке
        */
        Map<Integer, String> maps = new TreeMap<>(Comparator.reverseOrder());
        maps.putAll(map);
        return maps;
    }
}
