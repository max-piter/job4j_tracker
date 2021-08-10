package ru.job4j.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Firewall {
    public static String checkName(String s, Set<String> words) {
        String st = "Вы сделали правильный выбор!";
        String[] str = s.split(" ");
        Set<String> w = new HashSet<>();
        w.addAll(Arrays.asList(str));
        w.addAll(words);
        if (str.length + words.size() != w.size()) {
            st = "Выберите другую статью...";
        }

    return st;
}

    public static void main(String[] args) {

        Set<String> words = Set.of("instagram", "фото", "мем", "котик");
        String s = "Криштиану Роналду опубликовал новую фотографию с детьми в instagram";
        String rsl = Firewall.checkName(s, words);
        System.out.println(rsl);

        Set<String> words1 = Set.of("instagram", "фото", "мем", "котик");
        String s1 = "Создание многомодульного Gradle проекта SpringBoot + Angular в IDEA";
        String rsl1 = Firewall.checkName(s1, words1);
        System.out.println(rsl1);
    }
}
