package com.example.javaproject2.week3.day3;

public class isZeroOrFive {
    public static void main(String[] args) {
        int num = 253;
        String flagText = "0 또는 5로만 이루어진 숫자입니다.";

        while (num > 0) {
            int remainder = num % 10;
            if (remainder % 5 != 0) {
                flagText = "0 또는 5로만 이루어진 숫자가 아닙니다.";
                break;
            }
        }
    }
}
