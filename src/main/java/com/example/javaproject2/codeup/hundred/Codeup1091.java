package com.example.javaproject2.codeup.hundred;

import java.util.Scanner;

public class Codeup1091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        long sum = a;
        for (int i = 1; i < n; i ++) {
            sum = sum * m + d;
        }
        System.out.println(sum);
    }
}
