package ru.job4j.poly;

public class Plane implements Vehicle {

    private String destination;

    public Plane(String destination) {
        this.destination = destination;
    }

    @Override
    public void move(String destination) {
        System.out.println("I can fly to " + destination + " faster then train");
    }

    @Override
    public int wheel(String vehicle) {
       int wheels = switch (vehicle) {
            case "bus" -> 4;
            case "train" -> 12;
            case "plane" -> 6;
            default -> 0;
        };
        return wheels;
    }
}
