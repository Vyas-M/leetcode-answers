//Leet code - 34
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
//Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
//If target is not found in the array, return [-1, -1].

//The optimized version of this same program will be found in the same folder with the same name, but different version.
//The file name is FirstandLastPosition_V


package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class FirstandLastPosition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter the values of the array element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        arrange(arr);

        System.out.println(Arrays.toString(arr));
        System.out.print("Enter the target element to which the ceiling has to be found: ");
        int target = input.nextInt();
        int[] ans;
        ans = Ceiling(arr, target);
        System.out.println(Arrays.toString(ans));
//        if (ans != -1) {
//            System.out.println("The element is present in the array in the index and it is the ceiling of the target too:" +
//                    " " + ans);
//        } else {
//            System.out.println("The ceiling of the target element is: " + ans);
//        }
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


    static int[] Ceiling(int[] nums, int target) {

        int start = 0;
        int end=nums.length-1;
        int res=0;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else if (target == nums[mid]){
                res++;
            }
        }
        if (res==1){
            start = 0;
            end = nums.length - 1;

            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            int ans2 = start;

            start = 0;

            //Finding the foot of the target
            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            int ans1 = end;

            while (nums[ans2] == target) {
                ans2++;
            }

            while (nums[ans1] == target) {
                ans1--;
            }
            ans1++;
            ans2--;
            return new int[]{ans1, ans2};
        }

        else {
            return new int[]{-1,-1};
        }
    }
}


//The code is completely working, but the problem is that this is not the best practice I guess, because the time complexity
//of the code is too long and leet code displays the error as time limit exceeded.
