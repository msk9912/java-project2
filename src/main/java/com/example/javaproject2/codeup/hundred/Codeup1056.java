package com.example.javaproject2.codeup.hundred;

import java.util.Scanner;

public class Codeup1056 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int result = a == b ? 0 : 1;
        System.out.printf("%d", result);
    }
}
