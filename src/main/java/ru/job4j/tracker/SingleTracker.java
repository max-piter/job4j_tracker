package ru.job4j.tracker;

import java.util.List;

public final class SingleTracker {

    private static SingleTracker instance = null;
    private Store tracker = new MemTracker();

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

    /* Остальные методы из класса MemTracker. */

    public List<Item> findAll() {
        return tracker.findAll();
    }

    public Item findById(int id) {
        return tracker.findById(id);
    }

    public List<Item> findByName(String key) {
        return tracker.findByName(key);
    }

    public boolean replace(int id, Item item) {
       return tracker.replace(id, item);
    }

    public boolean delete(int id) {
        return tracker.delete(id);
    }
}
