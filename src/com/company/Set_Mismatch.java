//30 August 2021
//https://leetcode.com/problems/set-mismatch/
//Leet code - 645, easy.

//The array contains elements from 1 to N and has one duplicate element. Due to this duplicate element, one element got missed out.
// We need to return an array which contains the duplicate element and the element which is missing.

//We need to find do cyclic sort to find the element which is duplicate and the element which is missed out is the element which is index + 1.

package com.company;

public class Set_Mismatch {
    public static void main(String[] args) {

    }

    public static int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[correct] != nums[i]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        //Finding which element is duplicated.
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index+1){
                return new int[] {nums[index], index+1};
            }
        }

        return new int[] {-1, -1};
    }

    private static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
