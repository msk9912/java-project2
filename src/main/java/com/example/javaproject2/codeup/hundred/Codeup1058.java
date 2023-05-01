package com.example.javaproject2.codeup.hundred;

import java.util.Scanner;

public class Codeup1058 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int result = a == 0 && b == 0 ? 1 : 0;
        System.out.printf("%d", result);
    }
}
