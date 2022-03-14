//04 October 2021
//In this program, we are going to implement binary search using Recursion.

package com.company;

public class Binary_Search_Recursion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 55, 66, 78};
        int ans = search(arr, 0, arr.length-1, 4);
        System.out.println(ans);
    }

    public static int search(int[] arr, int start, int end, int target) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return search(arr, mid + 1, end, target);
        } else {
            return search(arr, start, mid - 1, target);
        }

    }
}
