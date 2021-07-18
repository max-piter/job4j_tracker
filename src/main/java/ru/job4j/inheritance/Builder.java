package ru.job4j.inheritance;

public class Builder extends Engeneer {
    private String program;

    public Builder(String name, String surname, String education,
                   int birthday, int workExperience, String program) {
        super(name, surname, education, birthday, workExperience);
        this.program = program;
    }

    public String getProgram() {
        return program;
    }

    public static int infoMaterial(String material) {
        return 0;
    }

    public void theListofBuildings() {

    }

    public boolean canWorkWithAutoCAD(String program) {
        return false;
    }

}
