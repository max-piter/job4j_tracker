package ru.job4j.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Jackpot {
    public static boolean checkYourWin(String[] combination) {
        Set<String> combo = new HashSet<>();
        combo.addAll(Arrays.asList(combination));
        if (combo.size() > 1) {
            return false;
        }
        return true;
    }

}
