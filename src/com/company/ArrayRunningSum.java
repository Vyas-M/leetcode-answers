//https://leetcode.com/problems/running-sum-of-1d-array/
//Leet code - 1480, easy.

//Input: [1,2,3,4], Output: [1,3,6,10]


package com.company;

import java.util.Arrays;

public class ArrayRunningSum {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 10, 1};
        int[] ans = runningSum(arr);

        System.out.println(Arrays.toString(ans));
    }

    static int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = 0; j <= i; j++) {
                sum = sum + nums[j];
            }
            ans[i] = sum;
        }
        return ans;
    }
}
