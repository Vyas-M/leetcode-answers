package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello world");

//        System.out.println("This program is to print the sum of two numbers.");
//        int a, sum, b;
//        System.out.print("Enter the value of b: ");
        Scanner input = new Scanner(System.in);
//        a = input.nextInt();

//        System.out.print("Enter the value of b: ");
//        input = new Scanner(System.in);
//        b = input.nextInt();

//        sum = a + b;

//        System.out.println("The sum of two number is: " + sum);

        int a = 400;
        int b = 500;
        int c = 100;

        byte d = (byte)(a * b / c);

        System.out.println(d);

    }
}
