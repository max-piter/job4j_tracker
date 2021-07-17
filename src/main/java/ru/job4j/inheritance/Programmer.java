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

    public static boolean findLanguageForJob(String language) {
        boolean job = false;
        switch (language) {
            case ("java"): job = true;
            break;
            case ("python"): job = false;
            break;
            case ("C++"): job = true;
            break;
            default:
                System.out.println("You can't find any job");
        }
        return job;
    }
}
