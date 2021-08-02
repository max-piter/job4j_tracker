package ru.job4j.list;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class AddElementTest {
    private List<String> list = new ArrayList<>();

    @Test
    public void addNewElement() {
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        boolean result = AddElement.addNewElement(list, "fourth");
        assertThat(result, is(true));
    }

    @Test
    public void addNewElementTrue() {
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        boolean result = AddElement.addNewElement(list, 1, "fourth");
        assertThat(result, is(true));
    }

    @Test
    public void addNewElementFalse() {
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        boolean result = AddElement.addNewElement(list, 1, "second");
        assertThat(result, is(false));
    }

//    @Before
//    public void setUp() {
//        list.add("one");
//        list.add("two");
//        list.add("three");
//        list.add("four");
//        list.add("five");
//        list.add("six");
//        list.add("seven");
//        list.add("eight");
//        list.add("nine");
//    }

//    @Test
//    public void changePosition() {
//        int index = 3;
//        List<String> result = AddElement.changePosition(list, index);
//        assertThat(result.size(), is(8));
//        assertThat(result.get(index), is("nine"));
//    }

    @Test
    public void changePositionNone() {
        int index = 20;
        List<String> result = AddElement.changePosition(list, index);
        assertThat(result.size(), is(9));
        assertThat(result.contains("nine"), is(false));
    }

    @Test
    public void containsElement() {
        List<String> left = new ArrayList<>();
        left.add("first");
        left.add("second");
        left.add("third");
        List<String> right = new ArrayList<>();
        right.add("fourth");
        right.add("second");
        right.add("fifth");
        String check = "second";
        int result = AddElement.containsElement(left, right, check);
        assertThat(result, is(3));
    }

    @Test
    public void containsElementInFirstList() {
        List<String> left = new ArrayList<>();
        left.add("first");
        left.add("second");
        left.add("third");
        List<String> right = new ArrayList<>();
        right.add("fourth");
        right.add("fifth");
        String check = "second";
        int result = AddElement.containsElement(left, right, check);
        assertThat(result, is(1));
    }

    @Before
    public void setUp() {
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("six");
        list.add("seven");
        list.add("eight");
        list.add("three");
        list.add("ten");
    }

    @Test
    public void getElementsBetweenIndexes() {
        List<String> result = AddElement.getElementsBetweenIndexes(list, "three");
        List<String> expected = List.of("three", "four", "five", "six", "seven", "eight");
        assertThat(result, is(expected));
    }

    @Test
    public void getElementsBetweenIndexesEmptyList() {
        List<String> result = AddElement.getElementsBetweenIndexes(list, "five");
        List<String> expected = List.of();
        assertThat(result, is(expected));
    }

    @Test
    public void when() {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("six");
        list.add("seven");
        list.add("eight");
        list.add("nine");
        list.add("ten");
        List<String> expected = List.of("three", "seven", "eight");
        List<String> result = AddElement.sortList(list);
        assertThat(result, is(expected));
    }

}