package com.example.javaproject2.codeup.hundred;

import java.util.Scanner;

public class Codeup1098 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int[][] gyeokja = new int[w + 1][h + 1];
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            int d = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (d == 0){
                while(l != 0) {
                    gyeokja[x][y++] = 1;
                    l--;
                }
            }else{
                while(l != 0) {
                    gyeokja[x++][y] = 1;
                    l--;
                }
            }
        }
        for (int i = 1; i <= w; i++) {
            for (int j = 1; j <= h; j++) {
                System.out.printf("%d ", gyeokja[i][j]);
            }
            System.out.println();
        }
    }
}
