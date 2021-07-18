package ru.job4j.inheritance;

public class Engeneer extends Profession {

    private int workExperience;

    public Engeneer(String name, String surname, String education,
                    int birthday, int workExperience) {
        super(name, surname, education, birthday);
        this.workExperience = workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    public int getWorkExperience() {
        return workExperience;
    }
}
