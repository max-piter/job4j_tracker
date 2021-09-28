package ru.job4j.stream;

import java.util.List;

public class AllMatch {
    public static boolean check2(List<String> list) {
        return list.stream().allMatch(el -> el.length() > 3);
    }

    public static boolean check(List<String> data) {
        return data.stream().anyMatch(el -> el.startsWith("job4j"));
    }

    public static boolean check3(List<String> list) {
        return list.stream().noneMatch(el -> el.isEmpty());
    }

    public static void main(String[] args) {
       boolean b =  AllMatch.check(List.of("1234", "abcd"));
        System.out.println(b);
    }
}
