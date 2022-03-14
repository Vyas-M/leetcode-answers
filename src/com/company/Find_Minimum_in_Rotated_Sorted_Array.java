//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
//Leet code - 153, medium.

//Given a rotated sorted array, we need to find the minimum element in the array.
//We need to find the pivot element and the element next to the pivot element is the minimum number in the entire array.
//If the array is not rotated, then the first element is the minimum element.

//The array has only unique elements and the time complexity should be O(log n).

package com.company;

public class Find_Minimum_in_Rotated_Sorted_Array {
    public static void main(String[] args) {
        int[] nums = {11, 13, 15, 17};
        int ans = findMin(nums);
        System.out.println("Hi");
        System.out.println(ans);
    }

    public static int findMin(int[] nums) {
        int pivot = findPivot(nums);
        if (pivot == -1) {
            return nums[0];
        } else {
            return nums[pivot + 1];
        }
    }

    private static int findPivot(int[] nums) {
        //this function returns the index value of the element after which the array has another ascending ordered one.
        //The return index is nothing but the index before which the first element of the array is present.

        //the pivot index is found by using binary search.
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            //The above two statements will return the index of the pivot element is the middle element is pivot.

            if (nums[mid] <= nums[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1; //If the array is not sorted.
    }
}
