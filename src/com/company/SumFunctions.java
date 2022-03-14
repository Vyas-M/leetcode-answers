package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class SumFunctions {

    public static void main(String[] args) {
        //void sum (int num1, num2);

        Scanner input = new Scanner(System.in);
        //int a, b;

//        System.out.print("Enter a number: ");
//        a = input.nextInt();
//        System.out.println();
//        System.out.println("Enter another number: ");
//        b = input.nextInt();

        int[] a = {20, 30, 40, 50, 12};

        sum(a, 5);
        System.out.println(Arrays.toString(a));
        //System.out.println(b);

    }

    static void sum(int a[], int num){
        a[0] = 99;
    }

}
