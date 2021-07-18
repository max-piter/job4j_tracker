package ru.job4j.inheritance;

public class Doctor extends Profession {
    private String university;
    private int workExperience;

    public String getUniversity() {
        return university;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public Diagnosis heal(Pacient pacient) {
        return null;
    }
}
