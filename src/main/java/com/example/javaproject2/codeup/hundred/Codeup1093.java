package com.example.javaproject2.codeup.hundred;

import java.util.Scanner;

public class Codeup1093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[23];
        for (int i = 0; i < n; i++) {
            nums[sc.nextInt()-1]++;
        }
        for (int j = 0; j < 23; j++) {
            System.out.printf("%d ", nums[j]);
        }
    }
}
