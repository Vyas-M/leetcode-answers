package com.company;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, search;
        System.out.print("Enter the number of elements of the array: ");
        n = input.nextInt();
        System.out.println("");

        int[] arr = new int[n];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("");

        System.out.print("Enter the element which you need to search: ");
        search = input.nextInt();

        int result = linearSearch(arr, search);

        if (result == -1) {
            System.out.println("The element is not present in the array.");
        } else if (result == 0) {
            System.out.println("The array is empty.");
        } else {
            System.out.println(search + " is present in the position of " + (result+1) + " in the array");
        }
    }

    //will return the index if the element is found
    //if the element is not found, should return -1

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            System.out.println("The array does not exist");
            return 0;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
            }
        return -1;
    }
}

