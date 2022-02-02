package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class MemTracker implements  Store {
     private List<Item> items = new ArrayList<>();
     private int ids = 1;

    public Item add(Item item) {
        item.setId(ids++);
        items.add(item);
        return item;
    }

    public void init() {
    }

    public void close() {
    }

    public List<Item> findAll() {
        return List.copyOf(items);
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index).getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

    public List<Item> findByName(String key) {
        List<Item> name = new ArrayList<>();
        for (Item item : items) {
            if (item.getName().equals(key)) {
                name.add(item);
            }
        }
        return name;
    }

    public boolean replace(int id, Item item) {
        int i = indexOf(id);
        if (i != -1) {
            item.setId(id);
            items.set(i, item);
            return true;
        }
        return false;
    }

    public boolean delete(int id) {
        int i = indexOf(id);
        if (i != -1) {
            items.remove(i);
            return true;
        }
        return false;
    }
}
