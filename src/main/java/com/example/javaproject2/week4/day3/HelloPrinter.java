package com.example.javaproject2.week4.day3;

public class HelloPrinter {
    Printer2 printer;

    public HelloPrinter(Printer2 printer) {
        this.printer = printer;
    }

    public static void main(String[] args) {
        HelloPrinter hp = new HelloPrinter(new ConsolePrinter()); // 인스턴스 생성
//        hp.repeatMessage(5, "Hello"); // 호출
    }

}
