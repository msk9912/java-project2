package com.example.javaproject2.codeup.hundred;

import java.util.Scanner;

public class Codeup1071 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String[] str = sc.nextLine().split(" ");
//        for (int i = 0; i < str.length; i++) {
//            if (Integer.parseInt(str[i]) == 0) break;
//            System.out.println(str[i]);
//        }
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int i = 0;
        do {
            System.out.println(str[i]);
            i++;
        } while (Integer.parseInt(str[i]) != 0);
    }
}
