//03 August 2021
//https://leetcode.com/problems/find-all-duplicates-in-an-array/
//Leet code 442, medium.

//We need to find all the elements which are duplicate in the given array and should return them.
//It is similar to Duplicate Number, but here, more than one element is repeated and we need to return them in an array list.
//You must write an algorithm that runs in O(n) time and uses only constant extra space - which means that, we need to use cyclic sort as the condition suits it well.\

//First, we need to do cyclic sort and all the elements that is not in the correct index are repeated.
//If the array is said to have a range of 1 to N, then it doesn't mean that all the elements between 1 and N are placed in the array.
//Some elements from 1 to N could be repeated.

//Amazon and Microsoft question.

package com.company;

import java.util.ArrayList;
import java.util.List;

public class All_Duplicates_Array {
    public static void main(String[] args) {

    }

    public static List<Integer> findDuplicates(int[] nums) {
        //We need to do cyclic sort first.
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[correct] != nums[i]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index+1){
                ans.add(nums[index]);
            }
        }

        return ans;
    }

    private static void swap(int[] nums, int i, int correct) {
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }
}
