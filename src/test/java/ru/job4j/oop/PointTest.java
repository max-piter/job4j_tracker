package ru.job4j.oop;


import org.junit.Assert;
import org.junit.Test;

public class PointTest  {

    @Test
    public void whenDistance3Dthen489() {
        double expected = 4.89;
        Point a = new Point(-1, 4, 6);
        Point b = new Point(-5, 2, 4);
        double rsl = a.distance3d(b);
        Assert.assertEquals(expected, rsl, 0.01);

    }

    @Test
    public void whenDistance3dthen565() {
        double expected = 5.65;
        Point a = new Point(-4, 0, 0);
        Point b = new Point(0, 0, 4);
        double rsl = a.distance3d(b);
        Assert.assertEquals(expected, rsl, 0.01);

    }

}