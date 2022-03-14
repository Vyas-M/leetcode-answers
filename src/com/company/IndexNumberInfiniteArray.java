//This program is from geek for geeks.
//Find the index number of an element in a sorted infinite array.
//This can be done using linear search, but the time complexity will be more.
//Since this is sorted array, then we can use binary search.
//Infinite array, so we are assuming that the array is infinite and so, we are not going to use array.length.


package com.company;

import java.util.Scanner;

public class IndexNumberInfiniteArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[100];
        System.out.println("Enter the total number of elements: ");
        int n = input.nextInt();
        System.out.println("Enter the sorted array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("Enter your target element: ");
        int target=input.nextInt();
        int ans = findingRange(arr, target);

        System.out.println("The target element is present in the index number: " + ans);
    }

    static int findingRange(int[] arr, int target) {
        //find the range.
        //starting with a box of size 2.
        int start = 0;
        int end = 1;

        int ans = -1;

        while (target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;  //doubling the box.
            start = newStart;
        }

        return binarySearch(arr, target, start, end);

    }

    static int binarySearch(int[] arr, int target, int start, int end) {

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
}
