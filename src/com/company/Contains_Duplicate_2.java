//17 October 2021
//https://leetcode.com/problems/contains-duplicate/

//Leet code - 217, easy.

//Check if the array has duplicate elements and return true or false.

//Should sort the array first and if the element is same as its next element, then there is duplicate element or otherwise not.

//First version of code works well, but takes more time according to leetcode.
package com.company;

import java.util.Arrays;

public class Contains_Duplicate_2 {

    public static void main(String[] args) {
        int[] arr = {1,1,1,3,3,4,3,2,4,2};
        boolean ans = containsDuplicate(arr);
        System.out.println(ans);
    }
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
}
