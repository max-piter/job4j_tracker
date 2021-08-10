package ru.job4j.map;

import java.util.HashMap;
import java.util.Map;

public class NonUniqueString {
    public static Map<String, Boolean> checkData(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();
        for (String str :  strings) {
            if (map.containsKey(str)) {
                map.put(str, true);
            } else {
                map.put(str, false);
            }
        }

        return Map.of();
    }
}
