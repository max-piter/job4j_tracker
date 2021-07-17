package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private int experienceInSurgery;
    private String hospital;

    public int getExperienceInSurgery() {
        return experienceInSurgery;
    }

    public String getHospital() {
        return hospital;
    }

    public static boolean canDoComplexOperation(int experienceInSurgery, boolean canDo) {
        return experienceInSurgery > 3;
    }
}

