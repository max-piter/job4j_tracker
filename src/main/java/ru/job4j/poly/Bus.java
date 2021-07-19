package ru.job4j.poly;

public class Bus implements Transport {
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
}
