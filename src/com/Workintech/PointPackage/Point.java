package com.Workintech.PointPackage;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }


    public int getY() {
        return y;
    }


    public double distance() {
        return Math.sqrt((x * x) + (y * y));
    }

    public double distance(int a, int b) {
        return Math.sqrt(Math.pow((getX() - a), 2) + Math.pow((getY() - b), 2));
    }

    public double distance(Point p) {
        return Math.sqrt(Math.pow((getX() - p.x), 2) + Math.pow((getY() - p.y), 2));
    }

    @Override
    public String toString() {
        return "İşlem sonucu:";
    }
}
