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
        assertEquals(134, items.get(0).getId());
    }
}