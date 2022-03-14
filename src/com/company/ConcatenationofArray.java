//https://leetcode.com/problems/concatenation-of-array/
//Leet code - 1929, easy

//We should input one array and then should return an array which has two times the initial array elements.


package com.company;

public class ConcatenationofArray {
    public static void main(String[] args) {

    }

    static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int length = 2 * n;
        int[] ans = new int[length];

        //int i=0;

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
        }

        for (int i = n-1; i < length; i++) {
            ans[i+n] = nums[i];
        }

        return ans;
    }
}
