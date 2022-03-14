//18 August 2021

package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1, 5, 7, 8, 13, 19, 20, 23, 29};
//        System.out.println("Enter the values of the array element: ");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = input.nextInt();
//        }
        arrange(arr);

        System.out.println(Arrays.toString(arr));
        //System.out.print("Enter the target element: ");
        int target = 23;
        int ans;
        ans = binarySearch(arr, target);
        //System.out.println(ans);
        if (ans != -1) {
            System.out.println("The element is present in the array in the index: " + ans);
        } else {
            System.out.println("The element which you entered is not present in the array.");
        }
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    private static void arrange(int[] arr) {
        int temp;
        {
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
    }
}
