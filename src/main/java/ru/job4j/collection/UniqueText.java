package ru.job4j.collection;

import java.util.Collections;
import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = false;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        int count = 0;
        Collections.addAll(check, origin);
       for (String el : text) {
           if (check.contains(el)) {
               count++;
           }
       }
       if (check.size() == count) {
           rsl = true;
       }
        return rsl;
    }
}
