package com.example.javaproject2.codeup.fifty;

import java.util.Scanner;

public class Codeup1048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result = num1 * (int)Math.pow(2, num2);
        System.out.println(result);
    }
}
