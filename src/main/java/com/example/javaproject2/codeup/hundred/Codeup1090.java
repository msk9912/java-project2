package com.example.javaproject2.codeup.hundred;

import java.util.Scanner;

public class Codeup1090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int r = sc.nextInt();
        int n = sc.nextInt();
        long sum = a;
        for (int i = 1; i < n; i ++) {
            sum *= r;
        }
        System.out.println(sum);
    }
}
