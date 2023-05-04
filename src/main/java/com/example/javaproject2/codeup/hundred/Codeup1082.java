package com.example.javaproject2.codeup.hundred;

import java.util.Scanner;

public class Codeup1082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int num = Integer.parseInt(str, 16);
        for (int i = 1; i < 16; i++) {
            System.out.printf("%X*%X=%X\n", num, i, num * i);
        }
    }
}
