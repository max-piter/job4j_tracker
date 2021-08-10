package ru.job4j.map;

import java.util.HashMap;
import java.util.Map;

public class ComputeIfPresent {

    public static Map<Integer, String> collectData(
            Map<Integer, String> name, Map<Integer, String> surname) {
        name.computeIfPresent(1, (key, value) -> value + " " + surname.get(1));
        name.computeIfPresent(2, (key, value) -> value + " " + surname.get(2));
        return name;
    }

    public static void main(String[] args) {
            Map<Integer, String> name = new HashMap<>(Map.of(1, "Bill", 2, "Donald"));
            Map<Integer, String> surname = new HashMap<>(Map.of(1, "Clinton", 2, "Trump"));
            Map<Integer, String> rsl = ComputeIfPresent.collectData(name, surname);
        System.out.println(rsl);
    }
}
