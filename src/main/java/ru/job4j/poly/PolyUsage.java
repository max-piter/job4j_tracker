package ru.job4j.poly;

public class PolyUsage {
    public static void main(String[] args) {
        Vehicle bus = new Bus("Moscow");
        Vehicle train = new Train("Moscow");
        Vehicle plane =  new Plane("Moscow");
        
        Vehicle[] vehicles = new Vehicle[]{bus, train, plane};
        for (Vehicle v : vehicles) {
            v.move("Moscow");
            if (v.equals(bus)) {
                System.out.println(v.wheel("bus"));
            }
        }

    }
}
