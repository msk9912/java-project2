package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1671 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int user = sc.nextInt();
        int computer = sc.nextInt();
        int num = user - computer;

        switch(num){
            case 0:
                System.out.println("tie");
                break;

            case -1:
            case 2:
                System.out.println("win");
                break;

            case 1:
            case -2:
                System.out.println("lose");
                break;
        }
    }
}
