package ru.job4j.oop;

public class Point {
    private int x;
    private int y;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public double distance(Point that) {
        return Math.sqrt(Math.pow((this.x - that.x), 2) + Math.pow((this.y - that.y), 2));
    }

    public static void main(String[] args) {
        Point a = new Point(-1, 4);
        Point b = new Point(-5, 2);
        double dist = a.distance(b);
        System.out.format("%.2f",dist);
    }
}
