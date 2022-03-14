//https://leetcode.com/problems/peak-index-in-a-mountain-array/
//Leet code - 852
//This program has two sorted arrays combined into one, the first will be sorted in ascending and the second in descending.
//We need to find the index of the peak of the mountain array, which is similar to finding the peak of the maximum value.
//Given, there will not be any repetition in the elements.

package com.company;

public class PeakIndexMountainArray {
    public static void main(String[] args) {
        int[] arr = {24, 69, 100, 99, 79, 78, 67, 36, 26, 19};
        int ans = findPeak(arr);
        System.out.println(ans);
    }

    static int findPeak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <  end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                //We are in the decreasing part of the array, so this may be the answer.
                //Since this can be the answer, we are not using end = mid - 1.
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        //In the end, start and end will be equal and will be pointing to the single element.

        return start;
    }
}
