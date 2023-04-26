package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] spit = str.split("\\.");
        int year = Integer.parseInt(spit[0]);
        int month = Integer.parseInt(spit[1]);
        int day = Integer.parseInt(spit[2]);
        System.out.printf("%04d.%02d.%02d", year, month, day);
    }
}
