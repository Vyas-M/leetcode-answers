//29 August 2021
//https://leetcode.com/problems/missing-number/
//Leet code - 268, easy.
//Amazon Question.

//Given an array of elements from 0 to N, and we need to find the missing number in this range. The total number of elements is the number of elements in the array.
//Only one element will be missing and no element will be repeated. The total number of numbers in the array will be N+1, where N is the size of the array.
//Since this question has the range of 0 to N, we can implement cyclic sort method.

//Since we include 0 here, every element will be in the index = value and not value-1, that is the only change we need to make in the cyclic sort.
//When N is available in the array, that is, if the last element is available, we use the below technique.
//To find the missing number, we need to sort the array first and then should see whether the value of each element is same as the value of its index.
//Whenever the above condition violates, that is, if the index does not contain the element which has the equal value, then that index is the answer.

//When N is not available in the array, that is, if N is the missing element, then we should follow the below technique.
//We first need to sort the array and should check whether each element is in its assigned position, and if it does, the N is the answer.

package com.company;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {0,3,1,5,4};
        int miss = missingNumber(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(miss);
    }

    public static int missingNumber(int[] nums) {
        //Using the same code in the cyclic sort program.
        int i = 0;
        while (i < nums.length) {
            if (nums[i]<nums.length && nums[i] != i) {
                swap(nums, i, nums[i]);
            } else {
                i++;
            }
        }

        for (int index = 0; index < nums.length; index++) {
            if (nums[index]!=index){
                return index;
            }
        }
        return nums.length;
    }

    private static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}

