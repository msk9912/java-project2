package com.example.javaproject2.codeup.hundred;

import java.util.Scanner;

public class Codeup1092 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int day = 2;
        while(day%a!=0 || day%b!=0 || day%c!=0) day++;
        System.out.println(day);
    }
}
