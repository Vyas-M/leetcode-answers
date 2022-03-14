//https://leetcode.com/problems/find-in-mountain-array/
//Leet code - 1095

//In this code, we must return the minimum index of the element in the array if it is present, if not, then we should return -1
//They have indirectly said that we should be using binary search as we are not allowed to make more calls or loops.
//The element may be present in the array twice too, but the minimum index should be returned.


package com.company;

public class FindinginMountainArray {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3, 2, 1};
        int target =3;
        int ans = find(arr, target);
        System.out.println(ans);
    }


    static int find(int[] arr, int target) {
        int peak = findPeak(arr);
        System.out.println(peak);
        int firstTry = binarySearch(arr, target, 0, peak);
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

    //Function for binary search

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

    static int orderAgnostic(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                end = mid - 1;
            } else if (target < arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}


//For submiting this in leet code, we need to make sure that we use OOP as it is listed in the requirements below.