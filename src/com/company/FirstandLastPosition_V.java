//Leet code - 34
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
//Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
//If target is not found in the array, return [-1, -1].


package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class FirstandLastPosition_V {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int[] nums = new int[10];
//        System.out.println("Enter the values of the array element: ");
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = input.nextInt();
//        }
//        arrange(nums);
//
//        System.out.println(Arrays.toString(nums));
//        System.out.print("Enter the target element to which the ceiling has to be found: ");

//        int target = input.nextInt();

        int[] nums = {5, 7, 7, 7, 7, 8, 8, 10};
        int target = 7;
        int[] ans;
        ans = searchRange(nums, target);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        int start = search(nums, target, true);
        int end = search(nums, target, false);

        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    private static int search(int[] nums, int target, boolean findStartIndex) {
        //here, we are basically employing binary search.
        int start = 0;
        int ans = -1;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

    static void arrange(int[] arr) {
        int temp;
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
