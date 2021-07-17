package ru.job4j.pojo;

public class Student {
    private String name;
    private String surname;
    private String patronimic;
    private int group;
    private int dateOfEnty;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronimic() {
        return patronimic;
    }

    public void setPatronimic(String patronimic) {
        this.patronimic = patronimic;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getDateOfEnty() {
        return dateOfEnty;
    }

    public void setDateOfEnty(int dateOfEnty) {
        this.dateOfEnty = dateOfEnty;
    }
}
