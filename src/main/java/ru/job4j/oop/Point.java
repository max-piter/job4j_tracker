package ru.job4j.oop;

public class Point {
    private int x;
    private int y;
    private int z;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void info() {
        System.out.println("Point[" + this.x + ", " + this.y + "]");
    }

    public double distance(Point that) {
        return Math.sqrt(Math.pow((this.x - that.x), 2) + Math.pow((this.y - that.y), 2));
    }

    public double distance3d(Point that) {
        return Math.sqrt(Math.pow((this.x - that.x), 2) + Math.pow((this.y - that.y), 2) + Math.pow((this.z - that.z), 2));

    }

    public static void main(String[] args) {
        Point a = new Point(-4, 0, 0);
        Point b = new Point(-0, 0, 4);
        double dist = a.distance(b);
        double distD = a.distance3d(b);
        System.out.format("%.2f",dist);
        System.out.println();
        System.out.format("%.2f", distD);
    }
}
