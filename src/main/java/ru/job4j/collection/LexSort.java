package ru.job4j.collection;

import java.util.Comparator;

public class LexSort  implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        String[] s = o1.split("\\.");
        String[] s2 = o2.split("\\.");
        int numO1 = Integer.parseInt(s[0]);
        int numO2 = Integer.parseInt(s2[0]);
        return Integer.compare(numO1, numO2);
    }
}
