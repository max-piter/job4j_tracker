package ru.job4j.map;

import java.util.*;

public class MostUsedCharacter {
    public static char getMaxCount(String str) {
        char rsl = ' ';
        String[] cs = str.replace(" ", "").split("");
        System.out.println(Arrays.toString(cs));
        TreeMap<String, Integer> chars = new TreeMap<>();
        for (String el : cs) {
            chars.putIfAbsent(el, 1);
        }

        for (String el : cs) {
            chars.computeIfPresent(el, (key, value) -> value + value++);
        }
        String s = Collections.max(chars.entrySet(), Map.Entry.comparingByValue()).getKey();
        rsl = s.charAt(0);
        return rsl;
    }

    public static void main(String[] args) {
            String str = "Мама мыла раму";
            char rsl = MostUsedCharacter.getMaxCount(str);
            System.out.println(rsl);
        String ln = System.lineSeparator();
        String str1 = "Мой дядя самых честных правил "
                + "Когда не в шутку занемог "
                + "Он уважать себя заставил "
                + "И лучше выдумать не мог "
                + "Его пример другим наука "
                + "Но боже мой какая скука "
                + "С больным сидеть и день и ночь "
                + "Не отходя ни шагу прочь "
                + "Какое низкое коварство "
                + "Полуживого забавлять "
                + "Ему подушки поправлять "
                + "Печально подносить лекарство "
                + "Вздыхать и думать про себя "
                + "Когда же черт возьмет тебя";
        char rsl1 = MostUsedCharacter.getMaxCount(str1);
        System.out.println(rsl1);

    }
}