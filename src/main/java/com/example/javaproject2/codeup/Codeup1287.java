package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1287 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < i * n; j++) {
                System.out.printf("*");
            }
            System.out.println("");
        }
    }
}
