package ru.job4j.tracker;

import java.util.Arrays;

public final class SingleTracker {
    private static SingleTracker instance = null;
    private Tracker tracker = new Tracker();

    /* реализовать singleton */
    private SingleTracker() {
    }

    public static SingleTracker getTracker() {
        if (instance == null) {
            instance = new SingleTracker();
        }
        return instance;
    }

    public Item add(Item item) {
        return tracker.add(item);
    }

    /* Остальные методы из класса Tracker. */

    public Item[] findAll() {
        return tracker.findAll();
    }

    private int indexOf(int id) {
        return tracker.indexOf(id);
    }

    public Item findById(int id) {
        return tracker.findById(id);
    }

    public Item[] findByName(String key) {
        return tracker.findByName(key);
    }

    public boolean replace(int id, Item item) {
       return tracker.replace(id, item);
    }

    public boolean delete(int id) {
        return tracker.delete(id);
    }
}
