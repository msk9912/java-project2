package com.example.javaproject2.codeup.hundred;

import java.util.Scanner;

public class Codeup1083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        char ch = 'X';
        for (int i = 1; i <= num; i++) {
            if (i % 3 != 0) System.out.printf("%d ",i);
            else System.out.printf("%c ", ch);
        }
    }
}
