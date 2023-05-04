package com.example.javaproject2.codeup.hundred;

import java.util.Scanner;

public class Codeup1095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int pivot = nums[0];
        for (int i = 1; i < n; i++) {
            if(pivot > nums[i]){
                pivot = nums[i];
            }
        }
        System.out.println(pivot);
    }
}
