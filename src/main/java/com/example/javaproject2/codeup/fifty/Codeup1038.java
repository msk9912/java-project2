package com.example.javaproject2.codeup.fifty;

import java.util.Scanner;

public class Codeup1038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        long num1 = Long.parseLong(str[0]);
        long num2 = Long.parseLong(str[1]);
        System.out.printf("%d", num1+num2);
    }
}
