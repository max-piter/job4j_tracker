package ru.job4j.collection;

import java.lang.reflect.Array;
import java.util.Comparator;

public class StringCompare implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        int rsl = 0;
        for (int i = 0; i < Math.min(o1.length(), o2.length()); i++) {
            rsl = Character.compare(o1.charAt(i), o2.charAt(i));
            if (rsl != 0) {
                break;
            }
        }
        if (rsl == 0) {
            rsl = Integer.compare(o1.length(), o2.length());
        }
        return rsl;
    }
}
