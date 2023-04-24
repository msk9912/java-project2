package com.example.javaproject2.week1.day5;

public class Point {
    int x;
    int y;

    public static void main(String[] args) {
        Point p = new Point();
        System.out.println(p.x);
    }
    boolean isSameXy() {
        // x와 y가 같냐?
        return x == y;
    }
}
