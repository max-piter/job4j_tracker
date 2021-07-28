package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class AddElement {
    public static boolean addNewElement(List<String> list, String str) {
        List<String> check = new ArrayList<>(list);
        list.add(str);
        return check.size() < list.size();
    }

    public static boolean addNewElement(List<String> list, int index, String str) {
        List<String> check = new ArrayList<>(list);
        if (!list.contains(str)) {
            list.add(index, str);
        }
        return list.size() > check.size();
    }

    public static boolean checkList(List<String> list, String str) {
        if (list.contains(str)) {
            return list.indexOf(str) == list.lastIndexOf(str);
        }
        return false;
    }

    public static List<String> changePosition(List<String> list, int index) {
      String el =   list.remove(list.size() - 1);
        if (index < list.size()) {
            list.set(index, el);
        }
        return list;
    }

    public static int containsElement(List<String> left, List<String> right, String str) {
        int index = -1;
        if (left.contains(str) && right.contains(str)) {
            left.remove(str);
            left.addAll(right);
            index = left.indexOf(str);
        } else if (left.contains(str) || right.contains(str)) {
            left.addAll(right);
            index = left.indexOf(str);
        }
        return index;
    }

    public static List<String> split(List<String> left, List<String> middle, List<String> right) {
        left.retainAll(middle);
        left.removeAll(right);
        return left;
    }

    public static void main(String[] args) {
    }
}

