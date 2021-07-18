package ru.job4j.inheritance;

public class Engeneer extends Profession {
    private String university;
    private int workExperience;
    private boolean usesComp;
    private boolean workInOffice;

    public Engeneer() {
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    public boolean isUsesComp() {
        return usesComp;
    }

    public void setUsesComp(boolean usesComp) {
        this.usesComp = usesComp;
    }

    public boolean isWorkInOffice() {
        return workInOffice;
    }

    public void setWorkInOffice(boolean workInOffice) {
        this.workInOffice = workInOffice;
    }

    public String getUniversity() {
        return university;
    }

    public int getWorkExperience() {
        return workExperience;
    }
}
