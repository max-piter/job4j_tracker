package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class GeomProgression {
    public static int generateAndSum(int first, int denominator, int count) {
        List<Integer> geomProg = new ArrayList<>();
        int sum = 0;
        geomProg.add(first);
        for (int i = 0; i < count - 1; i++) {
            geomProg.add(geomProg.get(i) *  denominator);
        }
        for (Integer el : geomProg) {
            sum += el;
        }
        return sum;
    }

    public static void main(String[] args) {
        int rsl = GeomProgression.generateAndSum(1, 3, 10);
        System.out.println(rsl);
    }
}
