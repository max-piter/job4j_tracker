package ru.job4j.tracker;
import ru.job4j.collection.Job;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

public class Item implements Comparable<Item> {

     private static final DateTimeFormatter FORMATTER
             = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
     private LocalDateTime created = LocalDateTime.now();
     private int id;
     private String name;

     public Item() {
    }

    public Item(String name) {
        this.name = name;
    }

    public Item(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int compareToMinus(Item another) {
         return Integer.compare(another.getId(), getId());
    }

     @Override
     public int compareTo(Item another) {
        return Integer.compare(getId(), another.getId());
     }

     @Override
     public String toString() {
         return "Item{"
                 + "id=" + id
                 + ", name='" + name + '\''
                 +  ", created=" + created.format(FORMATTER)
                 + '}';
     }

     public LocalDateTime getCreated() {
         return created;
     }

     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}