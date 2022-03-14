//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
//Leet code - 1365, easy

//For each and every element in the array, we must see how many elements are smaller than that particular element and then should store that in a separate array.
//For ex, if the array is [8,1,2,2,3], then the output should be [4,0,1,1,3].
//There are four elements smaller than the first element and 0 elements smaller than the second one.
// j!= i is the constrain which should be followed here.

package com.company;

import java.util.Arrays;

public class SmallerThanCurrentNumber {
    public static void main(String[] args) {
        int[] arr = {7, 7, 7, 7, 7};
        int[] ans = smallerNumbersThanCurrent(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i] && i != j) {
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }
}
