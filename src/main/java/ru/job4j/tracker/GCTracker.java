package ru.job4j.tracker;

public class GCTracker {

    public static void addItem(MemTracker tracker) {
        for (int i = 0; i < 1_000_000; i++) {
            tracker.add(new Item("Item" + i, i));
        }
    }

    public static void deleteItem(MemTracker tracker) {
        for (int i = 0; i < 1_000_000; i++) {
            tracker.delete(i);
        }
    }

    public static void main(String[] args) {
        MemTracker mt = new MemTracker();
        double start;
        double finish;
        start = System.currentTimeMillis();
        addItem(mt);
        finish = System.currentTimeMillis();
        System.out.printf("%nApp addItem running time: %f%n%n", (finish - start) / 1000);
         start = System.currentTimeMillis();
         deleteItem(mt);
         finish = System.currentTimeMillis();
        System.out.printf("%nApp deleteItem running time: %f%n%n", (finish - start) / 1000);
    }
}
