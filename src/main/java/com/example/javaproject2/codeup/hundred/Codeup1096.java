package com.example.javaproject2.codeup.hundred;

import java.util.Scanner;

public class Codeup1096 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] badook = new int[19][19];
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            badook[sc.nextInt()-1][sc.nextInt()-1] = 1;
        }
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                System.out.printf("%d ", badook[i][j]);
            }
            System.out.println();
        }
    }
}
