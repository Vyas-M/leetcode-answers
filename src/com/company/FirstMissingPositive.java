//30 August 2021.
//https://leetcode.com/problems/first-missing-positive/
//Leet code - 41, hard.

//Amazon Question.

//We are given with an array of positive and negative integers and we need to find the first missing positive number.
//If the array does not have 1, then 1 is the answer and if the array is completely sorted from 1 to N, where N is the last element, then N+1 is the answer.
//We need to skip negative elements and should look for positive ones.
//We need to employ cyclic sort, and if the index does not have the element index + 1, then index + 1 is the answer.


package com.company;

import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {3, 4, -1, 1};
        int ans = firstMissingPositive(nums);
        System.out.println(ans);
    }

    public static int firstMissingPositive(int[] nums) {
        int i = 0;

        //We need to skip negative elements.

        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        System.out.println(Arrays.toString(nums));

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                return index + 1;
            }
        }

        return nums.length + 1;
    }

    private static void swap(int[] nums, int i, int correct) {
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }
}
