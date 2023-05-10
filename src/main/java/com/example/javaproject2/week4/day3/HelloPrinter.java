package com.example.javaproject2.week4.day3;

public class HelloPrinter {
    Printer2 printer = new ConsolePrinter();

    public void repeatMessage(int n, String message) {
        for (int i = 0; i < n; i++) {
            printer.print(message);
        }
    }

    public static void main(String[] args) {
        HelloPrinter hp = new HelloPrinter(); // 인스턴스 생성
        hp.repeatMessage(5, "Hello"); // 호출
    }

}
