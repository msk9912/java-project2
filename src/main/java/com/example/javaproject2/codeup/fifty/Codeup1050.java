package com.example.javaproject2.codeup.fifty;

import java.util.Scanner;

public class Codeup1050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        System.out.printf("%d", a == b ? 1 : 0);
    }
}
