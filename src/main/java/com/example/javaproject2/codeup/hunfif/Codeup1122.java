package com.example.javaproject2.codeup.hunfif;

import java.util.Scanner;

public class Codeup1122 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int r1 = num / 60;
        int r2 = num % 60;

        System.out.printf("%d %d", r1, r2);
    }
}
