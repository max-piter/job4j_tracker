package ru.job4j.poly;

public class Train implements Vehicle {

    private String destination;

    public Train(String destination) {
        this.destination = destination;
    }

    @Override
    public void move(String destination) {
        System.out.println("I can ride to " + destination + " faster then bus");
    }

    @Override
    public int wheel(String vehicle) {
      int  wheels = switch (vehicle) {
            case "bus" -> 4;
            case "train" -> 12;
            case "plane" -> 6;
            default -> 0;
        };
        return wheels;
    }
}
