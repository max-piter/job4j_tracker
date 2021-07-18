package ru.job4j.inheritance;

public class Builder extends Engeneer {
    private String program;
    private String sphereOfBuilding;

    public String getSphereOfBuilding() {
        return sphereOfBuilding;
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
