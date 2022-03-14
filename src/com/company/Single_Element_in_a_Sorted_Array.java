//https://leetcode.com/problems/single-element-in-a-sorted-array/
//Leet code - 540, medium.

//The sorted array has all the elements twice except one and we need to find that one element which is not repeated twice.

//Since, the time complexity is given as O(log n), we need to use binary search.
//One thing we can clearly say is that the size of the array will always be in odd number, because, only one element is not repeated twice.

package com.company;

public class Single_Element_in_a_Sorted_Array {
    public static void main(String[] args) {
        int[] nums = {3, 3, 7, 7, 10, 11, 11};
        int ans = singleNonDuplicate(nums);
        System.out.println(ans);

    }

    public static int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 2; //To get away from index out of bounds error.
        if (nums.length == 1) {
            return nums[0];
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid % 2 == 0){
                if (nums[mid] == nums[mid+1]){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            if (mid % 2 != 0){
                if (nums[mid] == nums[mid-1]){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return nums[start]; //If all the elements are repeated twice.
    }
}
