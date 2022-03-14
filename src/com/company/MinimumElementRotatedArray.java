//Leet code - 153
//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

//The logic behind this is simple - if the array is rotated, that is, if the pivot element is found, then the minimum
//value of the array will be in the index next to that of the pivot element.
//If the array is not rotated, then the element in the start will be the minimum.

package com.company;

public class MinimumElementRotatedArray {
    public static void main(String[] args) {

    }

    static int findMin(int[] nums) {
        int pivot = findPivot(nums);
        if (pivot == -1) {
            return nums[0];
        } else {
            return nums[pivot + 1];
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
}
