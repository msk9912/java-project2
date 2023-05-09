package com.example.javaproject2.week4;

public class PyramidStar {
    public static void main(String[] args) {
        int height = 4;
        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < height - i; j++) {
                System.out.printf(" ");
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.printf("*");
            }
            for (int j = 0; j < height - i; j++) {
                System.out.printf(" ");
            }
            System.out.println();
        }
    }
}
