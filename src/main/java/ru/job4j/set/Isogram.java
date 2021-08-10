package ru.job4j.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Isogram {
    public static boolean checkString(String s) {
        Set<String> str =  new HashSet<>();
        str.addAll(Arrays.asList(s.split("")));
        if (s.length() != str.size()) {
            return false;
        }
        return true;
    }
}
