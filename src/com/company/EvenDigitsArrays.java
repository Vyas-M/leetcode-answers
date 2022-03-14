//Leet code question - 1295.
//This code is for finding the number of numbers having even digits in an array.

package com.company;

import java.util.Scanner;

public class EvenDigitsArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements of the array:");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        int ans = findNumbers(arr);
        System.out.println("The number of numbers having even number of digits are: " + ans);

    }

    static int findNumbers(int[] arr) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (check(arr[i])) {
                count++;
            }
        }
        return count;
    }

    static boolean check(int num) {
        int digits = 0;
        while (num > 0) {
            digits++;
            num /= 10;
        }
        if (digits % 2 == 0) {
            return true;
        }
        else{
            return false;
        }
    }
}
