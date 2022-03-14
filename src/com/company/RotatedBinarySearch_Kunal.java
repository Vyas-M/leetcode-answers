// I have tried my own method for this problem and that works for some cases and is not working in the extreme cases.
// This program is done as per the method of Kunal and works in all conditions.
//Leet code - 33
//https://leetcode.com/problems/search-in-rotated-sorted-array/

//This will not work with duplicate values.


package com.company;

public class RotatedBinarySearch_Kunal {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 6;

        int ans = search(arr, target);
        System.out.println(ans);
    }

    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        if (pivot == -1) {
            //This means that the array is not rotated and so, normal binary search is implemented.
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        if (nums[pivot] == target) {
            return pivot;
        }

        if (target >= nums[0]) {
            //If the target is smaller than the starting element, then the target lies between the pivot and the start element
            //If the target is greater than start, then it is by default greater than the second part of the ascending array.
            return binarySearch(nums, target, 0, pivot - 1);
        } else {
            //If the target is smaller than the start element, then it cannot be between the start and the pivot.
            //So, we can say that it lies between the pivot element and the second ascending array.

            return binarySearch(nums, target, pivot + 1, nums.length - 1);
        }

    }

    static int findPivot(int arr[]) {
        //This function is to find the pivot element, the element after which the rotation is taken place.
        //Before and after the pivot element, there is array in ascending order.
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                //Then, the element is the pivot element.
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                //The mid in the first case and this case is not the same, here, mid -1 is the pivot element.
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                //This shows that, the pivot element, that is, the bigger element lies before the middle element.
                end = mid - 1;
            } else {
                //This shows that the pivot element lies in the array after the middle element.
                start = mid + 1;
            }
        }

        return -1;
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
