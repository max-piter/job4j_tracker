package ru.job4j.inheritance;

    public class Dentist extends Doctor {

    private boolean kidsSert;

        public Dentist(String name, String surname, String education, int birthday,
                       int workExperience, boolean kidsSert) {
            super(name, surname, education, birthday, workExperience);
            this.kidsSert = kidsSert;
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
