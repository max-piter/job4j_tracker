package ru.job4j.inheritance;

public class Programmer extends Engeneer {
    private String language;
    private String technologies;

    public String getLanguage() {
        return language;
    }

    public String getTechnologies() {
        return technologies;
    }

    public static boolean canWork(String language) {
         return false;
    }
}
