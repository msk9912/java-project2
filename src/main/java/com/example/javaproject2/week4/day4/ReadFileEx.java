package com.example.javaproject2.week4.day4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//public class ReadFileEx {
//    public List<String> getLines(String fileName) {
//        List<String> lines = new LinkedList<>();
//
//        try(BufferedReader br = Files.newBufferedReader(
//                Paths.get(fileName), StandardCharsets.UTF_8)){
//
//            String line;
//            while ((line = br.readLine()) != null) {
//                lines.add(line);
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        return lines;
//    }
//
//    public static void main(String[] args) throws IOException {
//        ReadFileEx rf = new ReadFileEx();
//        rf.getLines("hospital_info_0920.csv");
//    }
//}
public class ReadFileEx {
    LineReader lineReader;
    Charset charset;

    public ReadFileEx(Charset charset) {
        this.charset = charset;
    }

    public List<String> getLines(String fileName) throws IOException {
        List<String> lines = new LinkedList<>();

        // BufferedReader선언 --> File연결
        BufferedReader br = new BufferedReader(new FileReader(fileName, charset));

        // BufferedReader에서 loop으로 한줄씩 불러오기
        String line;
        while ((line = br.readLine()) != null) {
            lines.add(line);
        }
        return lines;
    }

    public Hospital parse(String str) {
        System.out.println(str);
        String[] splitted = str.split(",");
        System.out.println(Arrays.toString(splitted));
        Address address = new Address(splitted[10], splitted[5], splitted[7]);
        Hospital hospital = new Hospital("", "", address);

        return hospital;
    }

    public List<Hospital> getHospitals(List<String> lines) {
        List<Hospital> hospitals = new ArrayList<>();
        for (String line : lines) {
            hospitals.add(parse(line));
        }
        return hospitals;
    }

        public static void main(String[] args) throws IOException {
//        ReadFileEx rfe = new ReadFileEx(Charset.forName("UTF-8"));
//        List<String> result = rfe.getLines("hospital_info_10lines.csv");
//        for (int i = 0; i < 9; i++) {
//            System.out.println(result.get(i));
//        }

//            ReadFileEx rfe = new ReadFileEx(Charset.forName("UTF-8"));
//            List<String> strLines = rfe.getLines("hospital_info_10lines.csv");
//            List<Hospital> parsedHospital = rfe.getHospitals(strLines);
//            System.out.println(parsedHospital.get(0));

            ReadFileEx rfe = new ReadFileEx(Charset.forName("UTF-8"));
            List<String> strLines = rfe.getLines("hospital_info_0920_utf8.csv");
            List<Hospital> parsedHospital = rfe.getHospitals(strLines);
            for (int i = 0; i < parsedHospital.size(); i++) {
                Hospital hospital = parsedHospital.get(i);
                System.out.printf("%s %s %s\n", hospital.getName(), hospital.getWebsiteAddr(), hospital.getAddress().getFullAddr());
            }
    }
}