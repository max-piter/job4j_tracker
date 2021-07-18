package ru.job4j.inheritance;

 public class Doctor extends Profession {

    private int workExperience;

     public Doctor(String name, String surname, String education,
                   int birthday, int workExperience) {
         super(name, surname, education, birthday);
         this.workExperience = workExperience;
     }

    public int getWorkExperience() {
        return workExperience;
    }

    public Diagnosis heal(Pacient pacient) {
        return null;
    }
}
