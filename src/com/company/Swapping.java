package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;

        System.out.print("Enter the number of elements of the array: ");
        n = input.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }


        System.out.println(Arrays.toString(arr));

        swap(arr, n);

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] array, int num) {

        for (int i = 0; i < num - 1; i++) {
            int temp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = temp;
        }

        System.out.println(Arrays.toString(array));
    }
}
