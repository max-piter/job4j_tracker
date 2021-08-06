package ru.job4j.list;

import java.util.*;

public class Alphabet {
    public static String reformat(String s) {
        List<String> str = Arrays.asList(s.split(""));
        StringBuilder sb = new StringBuilder();
        Collections.sort(str);
        for (String el : str) {
            sb.append(el);
        }
        s = sb.toString();
        return s;
    }
}
