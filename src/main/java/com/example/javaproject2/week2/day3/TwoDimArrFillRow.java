package com.example.javaproject2.week2.day3;

import java.util.Arrays;

public class TwoDimArrFillRow {
    public static void printTwoArr(int[][] arr){

    }
    public static void main(String[] args) {
        int[][] arr = new int[5][5];

        arr[2][0] = 1; // 2행 0열에 값 할당
        arr[2][1] = 1; // 2행 1열에 값 할당
        arr[2][2] = 1; // 2행 2열에 값 할당
        arr[2][3] = 1; // 2행 3열에 값 할당
        arr[2][4] = 1; // 2행 4열에 값 할당

        arr[0][2] = 1; // 0행 2열에 값 할당
        arr[1][2] = 1; // 1행 2열에 값 할당
        arr[2][2] = 1; // 2행 2열에 값 할당
        arr[3][2] = 1; // 3행 2열에 값 할당
        arr[4][2] = 1; // 4행 2열에 값 할당

        for (int i = 0; i < arr.length; i++) {
// 출력할 때는 행 단위로 출력
            System.out.println(Arrays.toString(arr[i]));
        }

    }
}
