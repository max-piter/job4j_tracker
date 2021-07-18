package ru.job4j.inheritance;

public class Programmer extends Engeneer {
    private String language;

    public Programmer(String name, String surname, String education, int birthday,
                      int workExperience, String language) {
        super(name, surname, education, birthday, workExperience);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public static boolean canWork(String language) {
         return false;
    }
}
