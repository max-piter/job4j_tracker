package ru.job4j.tracker;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SortByIdDescendTest {

    @Test
    public void testCompareDesc() {
        List<Item> items = Arrays.asList(
                new Item("Max", 134),
                new Item("Nom", 4),
                new Item("Kir", 5)
        );
        Collections.sort(items, new SortByIdDescend());
        List<Item> expected = Arrays.asList(
                new Item("Max", 134),
                new Item("Kir", 5),
                new Item("Nom", 4)
        );
        assertEquals(expected.get(0).getId(), items.get(0).getId());
        assertEquals(expected.get(1).getId(), items.get(1).getId());
        assertEquals(expected.get(2).getId(), items.get(2).getId());
    }
}