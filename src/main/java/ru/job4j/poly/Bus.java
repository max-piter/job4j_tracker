package ru.job4j.poly;

public class Bus implements Transport, Vehicle {

    private String destination;

    public Bus(String destination) {
        this.destination = destination;
    }

    @Override
    public void go() {
        System.out.println("The bus has gone, buy-buy");
    }

    @Override
    public void passengers(int passenger) {
        System.out.println("The number of passengers is " + passenger);

    }

    @Override
    public int refuel(int gas) {
        int moneyPerGallon = 2;
        return moneyPerGallon * gas;
    }

    @Override
    public void move(String destination) {
        System.out.println("I'm a bus, I can ride the road to " + destination);
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
