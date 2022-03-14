//https://leetcode.com/problems/product-of-array-except-self/
//Leet code - 238, medium
//28 August 2021

//Here, the function gets an array and then will return an array containing the elements which are product of each elements of the array, except the particular element.
//Which means, the first element of the new array will be the product of elements of the first array except the first element of the array.

//If the array has only one element, then we should return a null array.

package com.company;

import java.util.Arrays;

public class Product_of_Array_Except_Self {
    public static void main(String[] args) {
        int[] nums = {-1, 1, 0, -3, 3};
        int[] ans = productExceptSelf(nums);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    product = product * nums[j];
                }
            }
            arr[i] = product;
        }
        return arr;
    }
}




//The code is working for smaller array size, but the constrain given in the probelm is the array has the size of 10^5 and for that array, the time limit has exceeded.
//Should retry using different time complexity.