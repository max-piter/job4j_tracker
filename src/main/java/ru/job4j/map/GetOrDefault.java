package ru.job4j.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetOrDefault {
    private Map<Integer, List<String>> store = new HashMap<>();

    public void addValue(int index, List<String> list) {
        if (!store.keySet().contains(index)) {
            store.put(index, list);
        }
    }

    public List<String> getValue(int index) {
        if (store.keySet().contains(index)) {
            return store.get(index);
        } else {
            return store.getOrDefault(index, new ArrayList<>());
        }
    }
}