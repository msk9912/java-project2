package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        System.out.printf("%d", a != b ? 1 : 0);
    }
}