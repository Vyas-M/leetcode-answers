//30 August 2021
//https://leetcode.com/problems/find-the-duplicate-number/
//Leet code - 287, medium.
//Google Question

//Given an array which contains numbers from 1 to N with only one duplicate element. The total elements of the array is N+1.
//The repeated element is found by using cyclic sort, and the element which is left unsorted in the end is the repeated element.

//Kunal's method is a bit different, but this method is also accepted in Leet code.

package com.company;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {1, 1};
        int ans = findDuplicate(nums);
        System.out.println(ans);
    }

    public static int findDuplicate(int[] nums) {
        //We need to do cyclic sort in this nums array as it has 1 to N elements.
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        //Now, that the array is sorted, the last element is the one which is left unsorted and that is the duplicate element.
        return nums[nums.length - 1];
    }

    private static void swap(int[] nums, int i, int correct) {
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }
}
