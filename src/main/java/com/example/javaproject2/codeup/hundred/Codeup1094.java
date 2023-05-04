package com.example.javaproject2.codeup.hundred;

import java.util.Scanner;

public class Codeup1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        for (int j = n; j > 0; j--) {
            System.out.printf("%d ", nums[j-1]);
        }
    }
}
