package ru.job4j.collection;

import java.lang.reflect.Array;
import java.util.Comparator;

public class StringCompare implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        int rsl = 0;
        for (int i = 0; i < o1.length(); i++) {
            if (o1.charAt(i) == o2.charAt(i)) {
                if (i == o1.length() - 1 || i == o2.length() - 1) {
                    if (o1.length() > o2.length()) {
                        if (o1.charAt(o2.length() - 1) == o2.charAt(o2.length() - 1)) {
                            rsl = 1;
                            break;
                        }
                    }
                    if (o1.length() < o2.length()) {
                        rsl = -1;
                        break;
                    }
                    rsl = 0;
                    break;
                }
                }

            if (o1.charAt(i) > o2.charAt(i)) {
                rsl = 1;
                break;
            }
            if (o1.charAt(i) < o2.charAt(i)) {
                rsl = -1;
                break;
            }
        }
        return rsl;
    }
}
