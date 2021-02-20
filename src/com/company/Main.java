package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Hello World command
	    System.out.println("Hello World!");


	    // Variables
	    int a;
	    float b;
	    char c;
	    byte numik;
	    long d;
	    boolean f;
	    double g;
	    String string;
	    short e;

	    // Scanner
        Scanner num = new Scanner(System.in);
        int scan;
        scan = num.nextInt();
        System.out.println("Int Variable is " + scan);

        // Math operations
        float num_1 = 23.67f, num_2 = 43.4f, res;
        res = num_1 + num_2; // -, *, % OPERATIONS
        //res++; res--;
        System.out.println(res);

        // Operation if, else if, else; || - or; && - and

        int age = 10;
        if (age != 5 || age == 0) {
            System.out.println("Go in the bed");
        }
        else if (age <= 5 && age != 7) {
            System.out.println("Go in the detsad");
        } else if (age >= 18) {
            System.out.println("Go to the school");
        } else {
            System.out.println("Go in the university");
        }

        // Switch case
        int number = 0;
        switch (number) {
            case 1:
                System.out.println("Number is 1!");
                break;
            case 2:
                System.out.println("Number is 2!");
                break;
            default:
                System.out.println("Number is 0!");
                break;
        }

        // For, while, do/while
        for (int i = 1; i < 10; i++) {
            System.out.println("Now i is " + i);
        }

        int j = 16;
        while (j <= 15) {
            System.out.println("Element j is: " + j);
            j++;
        }

        int elm = 1;
        do {
            System.out.println("elm is: " + elm);
            elm++;
        } while (elm <= 10);

        // Arrays
        int [] arr1 = new int [] {1, 2, 3};
        for (int m = 0; m < arr1.length; m++) {
            System.out.println("Arr index m is: " + arr1[m]);
        }

        // Many Arrays
        int [][] arr = new int [] [] {{123, 456, 789}, {101112, 131415, 161718}};
        for (int q = 0; q < 3; q++) {
            for (int w = 0; w < 3; w++) {
                System.out.println(arr[q][w] + "   ");
            }
            System.out.println("");
        }
        // OOP
        Person maks = new Person(200, 14);
        System.out.println("Maks height is " + maks.height + " and Maks age is " + maks.age);

        maks.say("OH NOOOO!");

    }
}