//19 August 2021
//Ceiling of the number, can find the documentation and logic in notion binary files page.

package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class CeilingofNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter the values of the array element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        arrange(arr);

        System.out.println(Arrays.toString(arr));
        System.out.print("Enter the target element to which the ceiling has to be found: ");
        int target = input.nextInt();
        int ans;
        ans = Ceiling(arr, target);
        //System.out.println(ans);
        if (ans != -1) {
            System.out.println("The element is present in the array in the index and it is the ceiling of the target too:" +
                    " " + ans);
        } else {
            System.out.println("The ceiling of the target element is: " + ans);
        }
    }

    static void arrange(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }


    static int Ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start; //We are returning start, because, while the loop breaks, the start pointer will be ahead of the end pointer and that is what the ceiling of the number is.
    }
}