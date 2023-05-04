package com.example.javaproject2.codeup.hundred;

import java.util.Scanner;

public class Codeup1073 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        for (int i = 0; input != 0; i++) {
//            System.out.println(input);
//            input = sc.nextInt();
//        }
//
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        do {
            System.out.println(num);
            num = sc.nextInt();
        } while (num != 0);
    }
}
