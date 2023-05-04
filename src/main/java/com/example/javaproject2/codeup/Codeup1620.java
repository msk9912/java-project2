package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1620 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int sum = 0;
//        while (num != 0){
//            sum += num % 10;
//            num /= 10;
//        }
//        while (sum >= 10){
//            num = sum;
//            sum = 0;
//            while (num != 0){
//                sum += num % 10;
//                num /= 10;
//            }
//        }
//        System.out.println(sum);
        int num;
        int sum = sc.nextInt();

        while (sum >= 10){
            num = sum;
            sum = 0;
            while (num != 0){
                sum += num % 10;
                num /= 10;
            }
        }

        System.out.println(sum);
    }
}
