package com.company;

import java.util.Scanner;

public class CountingOccurances {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        System.out.print("Enter a number:");
        ;
        n = input.nextInt();
        int c;
        System.out.print("Enter a digit to check the number of occurences:");

        c = input.nextInt();
        int count = 0;
        int rem;
        while (n > 0) {
            rem = n % 10;
            if (rem == c) {
                count++;
            }
            n = n / 10;
        }

        System.out.println("The number of occurances of the given digit is: " + count);
    }
}
