//17 October 2021
//https://leetcode.com/problems/intersection-of-two-arrays/

//Leet code - 349

//Given two arrays, we need to find the intersection of both.
//My idea is that, after sorting both the arrys, for each element in the first array, if we do binary search for that element in the second array to find whether the element is present or not.
//We can then add those elements in the array list.

package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class IntersectionofTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {43, 85, 49, 2, 83, 2, 39, 99, 15, 70, 39, 27, 71, 3, 88, 5, 19, 5, 68, 34, 7, 41, 84, 2, 13, 85, 12, 54, 7, 9, 13, 19, 92};
        int[] nums2 = {10, 8, 53, 63, 58, 83, 26, 10, 58, 3, 61, 56, 55, 38, 81, 29, 69, 55, 86, 23, 91, 44, 9, 98, 41, 48, 41, 16, 42, 72, 6, 4, 2, 81, 42, 84, 4, 13};
        intersection(nums1, nums2);
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < nums1.length; i++) {
            boolean res = binarySearch(nums2, nums1[i]);
            if (res == true) {
                arr.add(nums1[i]);
            }
        }
//        for (int i = 0; i < arr.size() - 1; i++) {
//            if (arr.get(i) == arr.get(i + 1)) {
//                arr.remove(i);
//            }
//        }
        
        int[] res = new int[arr.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = arr.get(i).intValue();
        }
        return res;
    }

    private static boolean binarySearch(int[] nums2, int target) {
        int start = 0;
        int end = nums2.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums2[mid] == target) {
                return true;
            } else if (nums2[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
}

//This program works good, but the only issue here is that, if there are duplicate elements in the array, then we are getting duplicate ones even in the answers, so I need to rectify that part.