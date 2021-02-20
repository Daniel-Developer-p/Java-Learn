package com.company;

public class Person {
    int height;
    int age;

    void say(String str) {
        System.out.println(str);
    }

    Person (int height, int age) {
        this.height = height;
        this.age = age;
    }
}
