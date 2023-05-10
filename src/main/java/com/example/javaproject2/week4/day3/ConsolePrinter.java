package com.example.javaproject2.week4.day3;

import java.io.IOException;

public class ConsolePrinter implements Printer2{
    Printer2 printer2;


    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
