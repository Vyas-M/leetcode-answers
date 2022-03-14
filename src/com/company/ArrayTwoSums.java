//https://leetcode.com/problems/two-sum/
//Leet code - 1
//Should check whether the sum of array elements have the value of the target.

package com.company;

public class ArrayTwoSums {
    public static void main(String[] args) {

    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] + nums[i + 1] == target) {
                return new int[]{i, i + 1};
            }
        }
        return new int[]{0};
    }

}
