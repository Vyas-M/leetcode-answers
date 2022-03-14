//https://leetcode.com/problems/search-insert-position/
//Leet code -35, easy.

//If the element is found in the array, then we need to return the index, else, we need to say in which index does the target element will be placed.
//The given array is in ascending order.

package com.company;

public class Search_Insert_Position {
    public static void main(String[] args) {

    }

    public static int searchInsert(int[] nums, int target) {
        //To find the index of the target element, if present, I am just going to use normal binary search code.
        //If the element is not found, then, the loop breaks once the condition is false, then if will be enough if we just return the start value.
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else if (nums[mid] == target){
                return mid;
            }
        }

        return start;
    }
}
