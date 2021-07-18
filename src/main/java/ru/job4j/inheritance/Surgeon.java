package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private String sphereOfSurgery;
    private String hospital;

    public String getSphereOfSurgery() {
        return sphereOfSurgery;
    }

    public String getHospital() {
        return hospital;
    }

    public static boolean canDoComplexOperation(int experienceInSurgery, boolean canDo) {
        return false;
    }
}

