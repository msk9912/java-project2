package com.example.javaproject2.codeup.hundred;

import java.util.Scanner;

public class Codeup1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int s = sc.nextInt();
        double result = h / 8.0 * b * c * s / 1024 / 1024;
        System.out.printf("%.1f MB", result);
    }
}
