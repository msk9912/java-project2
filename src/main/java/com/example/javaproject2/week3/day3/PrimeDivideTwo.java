package com.example.javaproject2.week3.day3;

import java.util.Scanner;

public class PrimeDivideTwo {
    public static void main(String[] args) {
        int num = 992; // 소수 2_500_000
        boolean isPrime = true;
        for (int i = 2; i <= num / 2; i++) {
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime);
    }
}
