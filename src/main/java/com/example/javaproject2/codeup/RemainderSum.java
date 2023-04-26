package com.example.javaproject2.codeup;

public class RemainderSum {
    public static void main(String[] args) {
        int num = 687;
        int firstRemainder = num % 10;
        num = num / 10;
        int secondRemainder = num % 10;
        num = num / 10;
        int thirdRemainder = num % 10;

        System.out.println(firstRemainder + secondRemainder + thirdRemainder);
    }
}
