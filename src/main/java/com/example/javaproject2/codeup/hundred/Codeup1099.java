package com.example.javaproject2.codeup.hundred;

import java.util.Scanner;

public class Codeup1099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] miroh = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                miroh[i][j] =sc.nextInt();
            }
        }
        int x9 = 1;
        int y9 = 1;

        while (miroh[x9 + 1][y9] != 1 || (miroh[x9][y9+1] != 1)) {
            if (miroh[x9][y9] == 2) {
                miroh[x9][y9] = 9;
                break;
            }
            miroh[x9][y9] = 9;
            if (miroh[x9][y9 + 1] != 1) {
                if (miroh[x9][y9 + 1] == 2){
                    miroh[x9][y9 + 1] = 9;
                    break;
                }
                miroh[x9][y9 + 1] = 9;
                y9++;
            } else if (miroh[x9 + 1][y9] != 1){
                if (miroh[x9 + 1][y9] == 2){
                    miroh[x9 + 1][y9] = 9;
                    break;
                }
                miroh[x9 + 1][y9] = 9;
                x9++;
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%d ", miroh[i][j]);
            }
            System.out.println();
        }

    }
}
