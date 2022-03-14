//17 October 2021
//https://leetcode.com/problems/majority-element/
//We need to find the element which has occured more than n/2 times, where n is the size of the array.

//We need to sort the array first and then, if we just return the element which is at the index n/2, then that will be the element which is repeated many times.

package com.company;

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        int ans = majorityElement(arr);
        System.out.println(ans);
    }

    private static int majorityElement(int[] arr) {
        selectionSort(arr);
        return arr[arr.length / 2];
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            swapElement(arr, min_index, i);
        }
    }

    private static void swapElement(int[] arr, int maxElement, int last) {
        int temp = arr[maxElement];
        arr[maxElement] = arr[last];
        arr[last] = temp;
    }

}
