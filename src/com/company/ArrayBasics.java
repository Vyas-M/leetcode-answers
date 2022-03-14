package com.company;

import java.util.Scanner;

public class ArrayBasics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements of the array: ");
        n = input.nextInt();
        int[] arr =  new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i]= input.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // this is the conventional method of printing the array elements.
                                            // Here, i is the index value of the array and for printing the values of
                                            // the array, we are accessing the  index values of the array of each element
        }

        for (int j : arr) {
            System.out.print(j + " ");      //What it states is that, here j is the element of the array and for
                                            // each element of the array, we are asking it to print the element of the array.
                                            //This is similar to python, as far as I know.
        }
    }
}
