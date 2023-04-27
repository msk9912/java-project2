package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1054 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int result = a == 1 && b == 1 ? 1 : 0;
        System.out.printf("%d", result);
    }
}
