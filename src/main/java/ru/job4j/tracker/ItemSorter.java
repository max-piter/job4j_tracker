package ru.job4j.tracker;
import java.util.*;

public class ItemSorter  {

    public static void sorterPlus(List<Item> items) {
        Collections.sort(items);
    }

    public static void sorterMinus(List<Item> items) {
        Collections.sort(items, Collections.reverseOrder());
    }
}
