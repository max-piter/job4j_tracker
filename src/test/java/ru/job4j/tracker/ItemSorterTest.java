package ru.job4j.tracker;

import junit.framework.TestCase;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class ItemSorterTest {

    @Test
    public void whenSorterPlus() {
        List<Item> items = Arrays.asList(
                new Item("Max", 134),
                new Item("Nom", 4),
                new Item("Alex", 51),
                new Item("kir", 122),
                new Item("Marin", 15)
        );
        ItemSorter.sorterPlus(items);
        assertTrue(items.get(0).getName().equals("Nom"));
    }

    @Test
    public void whenSorterMinus() {
        List<Item> items = Arrays.asList(
                new Item("Max", 134),
                new Item("Nom", 4),
                new Item("Alex", 51),
                new Item("kir", 122),
                new Item("Marin", 15)
        );
        ItemSorter.sorterMinus(items);
        assertTrue(items.get(4).getName().equals("Nom"));

    }
}