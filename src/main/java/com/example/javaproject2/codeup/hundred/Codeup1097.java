package com.example.javaproject2.codeup.hundred;

import java.util.Scanner;

public class Codeup1097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] badook = new int[19][19];
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                badook[i][j] = sc.nextInt();
            }
        }
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            int pivx = sc.nextInt();
            int pivy = sc.nextInt();
            for (int j = 0; j < 19; j++) {
                badook[pivx-1][j] = badook[pivx-1][j] == 1 ? 0 : 1;
                badook[j][pivy-1] = badook[j][pivy-1] == 1 ? 0 : 1;
            }
        }
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                System.out.printf("%d ", badook[i][j]);
            }
            System.out.println();
        }
    }
}
