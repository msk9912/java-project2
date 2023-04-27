package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int p1 = num1 < num2 ? num1 : num2;

        int result = p1 < num3 ? p1 : num3;
        System.out.println(result);
    }
}
