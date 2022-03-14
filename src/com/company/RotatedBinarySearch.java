//Leet code - 33
//https://leetcode.com/problems/search-in-rotated-sorted-array/


package com.company;


public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {6, 7, 1, 2, 3, 4, 5};
        int target = 6;
        int ans = search(arr, target);
        System.out.println(ans);
    }


    static int search(int[] arr, int target) {
        int peak = findPeak(arr);
        System.out.println(peak);
        int firstTry = binarySearch(arr, target, 0, peak);
        System.out.println(firstTry);
        if (firstTry != -1) {
            return firstTry;
        } else {
            int secondTry = orderAgnostic(arr, target, peak + 1, arr.length - 1);
            return secondTry;
        }
    }

    //Function for finding the peak element:
    static int findPeak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                //We are in the decreasing part of the array, so this may be the answer.
                //Since this can be the answer, we are not using end = mid - 1.
                end = mid;
            } else if (mid > start && arr[mid] < arr[mid - 1]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        //In the end, start and end will be equal and will be pointing to the single element.

        return start;
    }

    //Function for binary search

    static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else if (target==arr[mid]){
                return mid;
            }
        }

        return -1;
    }

    static int orderAgnostic(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else if (target == arr[mid]) {
                return mid;
            }
        }

        return -1;
    }
}

//This program works fine, but brings up runtime error in some cases, like if the size of the array is small, then the
//peak value of the array function is not getting executed.
//So, I need to follow Kunal's method for finding the element in  a sorted rotated array.