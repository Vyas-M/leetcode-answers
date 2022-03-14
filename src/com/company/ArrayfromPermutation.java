//https://leetcode.com/problems/build-array-from-permutation/
//Leet Code - 1920, easy.

//The description in the problem statement is enough.


package com.company;

public class ArrayfromPermutation {
    public static void main(String[] args) {

    }

    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }
}
