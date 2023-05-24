package com.example.javaproject2.week4.day4;

import com.example.javaproject2.week4.day3.Printer2;

import java.io.*;

public class FilePrinter implements Printer2 {
    @Override
    public void print(String message) throws IOException {
        //파일에 쓰기
        BufferedWriter bw = new BufferedWriter(new FileWriter("./hello.txt"));

        //파일에서 읽어오기
        BufferedReader br = new BufferedReader(
                new FileReader("./numbers.txt"),
                16 * 1024
        );

        //

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        bw.append(message);
        bw.flush();
        bw.close();
    }

}
