//https://leetcode.com/problems/number-of-good-pairs/
//leet code - 1512, easy
//25 August 2021

package com.company;

public class NumberofGoodPairs {
    public static void main(String[] args) {

    }

    static int numIdenticalPairs(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }

        return count;
    }
}
