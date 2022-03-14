//https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
//Leet code - 81, medium.

//Similar to searching in rotated sorted array, but the difference is that the array here may contain duplicates.
//We need to return true if the element is present and false if it is not. That's all.

//The code for the searching in rotated sorted array can be used with some changes.

//Not working for all the inputs, recieving the error for exception inbounds for a couple of inputs.


package com.company;

public class Search_in_Rotated_Sorted_Array_II {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1,1,1,1,1,13,1,1,1,1,1,1,1,1,1,1,1,1};
        boolean ans = search(nums, 13);
        System.out.println(ans);
    }

    public static boolean search(int[] nums, int target) {
        //We need to find the pivot position first, as that can be used in the scope of searching.
        if (nums.length == 1) {
            if (nums[0] == target) {
                return true;
            } else {
                return false;
            }
        }
        //int pivot = findPivot(nums);
        boolean ans;
//        if (pivot == -1) {
//            //the array is not rotated.
//            ans = binarySearch(nums, target, 0, nums.length);
//        }
//        if (nums[pivot] == target) {
//            return true;
//        }
        ans = binarySearch(nums, target, 0, nums.length - 1);

//        if (target >= nums[0]) {
//            //this means that the target is greater than the first element of the rotated array and also implicitly means that the target element is smller than the pivot element, so it will be enough if we search between the first element and the element which is before the pivot element.
//            ans = binarySearch(nums, target, 0, pivot - 1);
//        } else {
//            ans = binarySearch(nums, target, pivot + 1, nums.length - 1);
//        }

        return ans;
    }

    private static boolean binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return true;
            } else if (nums[mid] == nums[start]) {
                start++;
            } else if (nums[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return false;
    }

//    private static int findPivot(int[] nums) {
//        //Since the array is rotated, this function finds the pivot element and returns the index of the pivot using binary search.
//        int start = 0;
//        int end = nums.length - 1;
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//
//            if (mid < end && nums[mid] > nums[mid + 1]) {
//                //Then, the element is the pivot element.
//                return mid;
//            }
//            if (mid > start && nums[mid] < nums[mid - 1]) {
//                //The mid in the first case and this case is not the same, here, mid -1 is the pivot element.
//                return mid - 1;
//            }
//
//            if (nums[mid] < nums[start]) {
//                end = mid - 1;
//            } else {
//                start = mid + 1;
//            }
//
//        }
//        return -1;
//    }
}
