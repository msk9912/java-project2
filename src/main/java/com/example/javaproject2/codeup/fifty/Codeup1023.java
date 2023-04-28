package com.example.javaproject2.codeup.fifty;

import java.util.Scanner;

public class Codeup1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        float val = sc.nextFloat();
//        int val1 = (int)val;
//        float val2 = val - val1;
//
//        System.out.printf("%d\n%f", val1, val2);
        String[] strArr = sc.next().split("\\.");
        String val1 = strArr[0];
        String val2 = strArr[1];
        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
    }
}
