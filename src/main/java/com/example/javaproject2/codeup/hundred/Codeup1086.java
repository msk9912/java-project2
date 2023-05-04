package com.example.javaproject2.codeup.hundred;

import java.util.Scanner;

public class Codeup1086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int b = sc.nextInt();
        double result = w /8.0 * h * b / 1024 / 1024;
        System.out.printf("%.2f MB", result);
    }
}
