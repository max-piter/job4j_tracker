package ru.job4j.inheritance;

public class Profession {
    private String name;
    private String surname;
    private String education;
    private  int birthday;

    public Profession(String name, String surname, String education, int birthday) {
        this.birthday = birthday;
        this.name = name;
        this.education = education;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getEducation() {
        return education;
    }

    public int getBirthday() {
        return birthday;
    }

    public String getSurname() {
        return surname;
    }
}
