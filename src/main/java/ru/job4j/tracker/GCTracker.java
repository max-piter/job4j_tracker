package ru.job4j.tracker;

public class GCTracker {
    public static void main(String[] args) {
        double start;
        double finish;
        MemTracker mt = new MemTracker();
        start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            mt.add(new Item("Item" + i));
        }
        finish = System.currentTimeMillis();

        System.out.printf("%nApp running time: %f%n%n", (finish - start) / 1000);
    }
}
