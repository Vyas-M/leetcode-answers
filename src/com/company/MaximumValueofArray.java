package com.company;

import java.util.Scanner;

public class MaximumValueofArray {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements of the array:");
        n = input.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("The maximum value of the array is: " + max(arr));
    }

    static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {      //It is always best to use the array length while going for a for loop
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
