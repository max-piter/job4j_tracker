package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class CheckerAhdGetter {
    public static String getElement(List<String> list) {
        String str;
        if (list.isEmpty()) {
            str = "";
        } else {
            str = list.get(0);
        }
        return str;
    }
}


