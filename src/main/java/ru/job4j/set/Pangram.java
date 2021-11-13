package ru.job4j.set;

import java.util.*;

public class Pangram {
    public static boolean checkString(String s) {
        boolean rsl = false;
        String[] alphabet = s.replaceAll(" ", "").split("");
        HashSet<String> alphaSet = new HashSet<>();
        alphaSet.addAll(Arrays.asList(alphabet));

        if (alphaSet.size() == 26) {
            rsl = true;
        }
        return rsl;
    }

    public static void main(String[] args) {
        String str = "Jackdaws love my big sphinx of quartz";
        boolean b = Pangram.checkString(str);
        System.out.println(b);
    }
}
