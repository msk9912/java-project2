package com.example.javaproject2.codeup.fifty;

import java.util.Scanner;

public class Codeup1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int c = Integer.parseInt(str[2]);

        int sum = a + b + c;

        System.out.println(sum);
        System.out.printf("%.1f", sum/3.0);
    }
}
