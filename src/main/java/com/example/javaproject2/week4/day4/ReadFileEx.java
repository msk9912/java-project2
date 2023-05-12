package com.example.javaproject2.week4.day4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFileEx {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\msk99\\Downloads\\건강보험심사평가원_전국 병의원 및 약국 현황 2022.9"));
    }
}
