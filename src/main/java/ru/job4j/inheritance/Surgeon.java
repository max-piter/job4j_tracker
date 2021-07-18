package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private String sphereOfSurgery;

    public Surgeon(String name, String surname, String education, int birthday,
                   int workExperience, String sphereOfSurgery) {
        super(name, surname, education, birthday, workExperience);
        this.sphereOfSurgery = sphereOfSurgery;
    }

    public String getSphereOfSurgery() {
        return sphereOfSurgery;
    }

    public static boolean canDoComplexOperation(int experienceInSurgery, boolean canDo) {
        return false;
    }
}

