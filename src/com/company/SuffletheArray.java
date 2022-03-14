//https://leetcode.com/problems/shuffle-the-array/
//Leet code - 1470, easy
//25 August 2021
//Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
//Return the array in the form [x1,y1,x2,y2,...,xn,yn].


package com.company;

import java.util.Arrays;

public class SuffletheArray {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 4, 7};
        int n = 3;
        int[] ans = shuffle(arr, n);
        System.out.println(Arrays.toString(ans));
    }

    static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int evenCounter = 0;
        int oddCounter = n;

        for (int i = 0; i < nums.length; i++) {
            if (i%2==0){
                ans[i] = nums[evenCounter++];
            }
            else {
                ans[i] = nums[oddCounter++];
            }
        }

        return ans;
    }
}

//Didn't get the answer in the first step, got only after seeing the discussions forum.
