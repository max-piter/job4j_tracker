package ru.job4j.map;

import java.util.*;

public class Dictionary {
    public static Map<String, List<String>> collectData(String[] strings) {
        Map<String, List<String>> rsl = new HashMap<>();
        for (String string : strings) {
            String key = "" + string.charAt(0);
            if (!rsl.containsKey(key)) {
                rsl.put(key, new LinkedList<String>());
            }

            rsl.get(key).add(string);
        }
        return rsl;
    }

    public static void main(String[] args) {
      String s =  "setter";
        s = String.valueOf(s.charAt(0));
        System.out.println(s);
    }
}