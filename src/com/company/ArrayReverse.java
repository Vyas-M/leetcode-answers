package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number of elements of the array:");
        Scanner input = new Scanner(System.in);

        n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        reverse(arr);
        System.out.println("The reversed form of array is: ");
        System.out.println(Arrays.toString(arr));

    }

    static void reverse(int[] arr) {
        int end = arr.length-1;
        int start = 0;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
