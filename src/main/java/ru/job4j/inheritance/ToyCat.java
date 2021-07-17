package ru.job4j.inheritance;

public class ToyCat extends Cat {
    public boolean canBeWashByWashMachine() {
        return true;
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        ToyCat toy = new ToyCat();
      boolean can =  toy.canPurr();
      boolean can1 =  toy.canBeWashByWashMachine();
        System.out.println(can);
        System.out.println(can1);
    }
}
