package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup4596 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] rc = new int[9][9];
        int pivot = 0;
        int pivx = 0;
        int pivy = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                rc[i][j] = sc.nextInt();
                if (pivot < rc[i][j]){
                    pivot = rc[i][j];
                    pivx = i;
                    pivy = j;
                }
            }
        }
        System.out.println(pivot);
        System.out.printf("%d %d", pivx+1, pivy+1);
    }
}
