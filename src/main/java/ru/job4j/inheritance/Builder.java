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
        int timeToBild = 0;
        switch (material) {
            case ("brick") : timeToBild = 2;
            break;
            case ("wood") : timeToBild = 3;
            break;
            case ("block") : timeToBild = 1;
            default:
                System.out.println("Unknown material");
        }
        return timeToBild;
    }

}
