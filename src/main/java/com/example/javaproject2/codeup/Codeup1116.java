package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int num1 = Integer.parseInt(str[0]);
        int num2 = Integer.parseInt(str[1]);

        System.out.printf("%d+%d=%d\n", num1, num2, num1+num2);
        System.out.printf("%d-%d=%d\n", num1, num2, num1-num2);
        System.out.printf("%d*%d=%d\n", num1, num2, num1*num2);
        System.out.printf("%d/%d=%d\n", num1, num2, num1/num2);
    }
}
