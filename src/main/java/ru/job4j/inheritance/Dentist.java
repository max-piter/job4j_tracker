package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private int experienceInDentistry;
    private String hospital;
    private boolean kidsSert;

    public Dentist(int experienceInDentistry, String hospital, boolean kidsSert) {
        this.experienceInDentistry = experienceInDentistry;
        this.hospital = hospital;
        this.kidsSert = kidsSert;
    }

    public int getExperienceInDentistry() {
        return experienceInDentistry;
    }

    public String getHospital() {
        return hospital;
    }

    public boolean isKidsSert() {
        return kidsSert;
    }

    public void priceList() {

    }

    public int price(Diagnosis diagnosis, Pacient pacient) {
        return 0;
    }
}
