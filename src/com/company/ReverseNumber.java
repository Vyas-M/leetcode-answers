package com.company;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        System.out.print("Enter a number:");
        ;
        n = input.nextInt();
        //int c;
        //System.out.print("Enter a digit to check the number of occurences:");

        //c = input.nextInt();
        //int count = 0;
        int rem;
        int temp = 0;
        while (n > 0) {
            rem = n % 10;
            n = n / 10;

            temp = temp * 10 + rem;
        }
        System.out.println("The reverse of the number you have entered is: " + temp);
    }
}
