package com.example.javaproject2.week1.day5;

public class UserTest {
    public static void main(String[] args) {
        User kyeongrok = new User();
        kyeongrok.name = "김경록";
        kyeongrok.phoneNumber = "010-1111-1212";
        kyeongrok.age = 37;

        User jaesung = new User();
        jaesung.name = "김경록";
        jaesung.phoneNumber = "010-1111-1212";
        jaesung.age = 37;

        System.out.printf("%s님은 성인입니까? %s\n", kyeongrok.name, kyeongrok.isAdult());
        System.out.printf("%s님은 성인입니까? %s\n", jaesung.name, jaesung.isAdult());
    }
}
