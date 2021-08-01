package ru.job4j.tracker;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ItemTest {

    @Test
    public void whenSorterPlus() {
        List<Item> items = Arrays.asList(
                new Item("Max", 134),
                new Item("Nom", 4)
        );
        int rsl = items.get(0).compareTo(items.get(1));
        assertEquals(1, rsl);
    }

    @Test
    public void whenSorterMinus() {
        List<Item> items = Arrays.asList(
                new Item("Max", 134),
                new Item("Nom", 4)
        );
        int rsl = items.get(1).compareTo(items.get(0));
        assertEquals(-1, rsl);

    }
}