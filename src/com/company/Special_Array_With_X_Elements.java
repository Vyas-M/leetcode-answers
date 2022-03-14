//https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/
//Leet code - 1608, easy.

//Given an array of elements, if number of elements in the array which is greater than or equal to a particular element has the same value as the element, then we should return the element.
//Else, we need to return -1.

//For ex, if an array contains 5 elements 1, 2, 3, 4, 5, then we should return 3 as there are 3 elements in the array which is greater or equal to 3.

//My guess is to sort the array and find the mid element. After finding the mid index, if the mid element is greater than the array length  - mid index, then there could not be that much numbers which is equal or greater than the element. So, we can just return -1.
//If the mid element is smaller than the difference between array length and mid element, then we can increment mid.
//If difference between array length and mid is equal, then we can just return the mid element.

//This is my version of understanding the problem, but I didn't get the desired output for one of the example test cases. So, I just followed another method, which is not that worth of documenting.

package com.company;

public class Special_Array_With_X_Elements {
    public static void main(String[] args) {
        int[] nums = {3,5};
        int ans = specialArray(nums);
        System.out.println(ans);
    }

    public static int specialArray(int[] nums) {
        arrange(nums);
        int ans = 0;
        int mid = nums.length / 2;
        while (mid < nums.length) {
            if (nums[mid] < nums.length - mid) {
                mid = mid + 1;
            } else if (nums[mid] > nums.length - mid) {
                return -1;
            } else {
                return nums[mid];
            }
        }
        return -1;
    }

    private static void arrange(int[] arr) {
        int temp;
        {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] < arr[j]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
    }
}
