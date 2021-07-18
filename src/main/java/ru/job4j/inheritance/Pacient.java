package ru.job4j.inheritance;

public class Pacient {
    private String name;
    private int age;
    private String complaint;
    private String diagnosis;

    public Pacient(int age, String complaint, String name, String diagnosis) {
        this.age = age;
        this.complaint = complaint;
        this.name = name;
        this.diagnosis = diagnosis;
    }

    public String infoDiagnosis(String diagnosis) {
         this.diagnosis = diagnosis;
         return diagnosis;
    }
}
