//https://leetcode.com/problems/merge-sorted-array/
//Leet code - 88, easy.

//We are given with two sorted arrays (ascending order), we need to merge the two arrays and store the resultant array in the first array.
//The resultant array should be sorted and the first array can have the size of m + n, where m is the size of the first array and n is the size of the second array.

//We can concatenate the first and the second array in the first array as the array is mutable and then, we can sort the resultant array.

//To sort the resultant array, I am going to use insertion sort mechanism.

package com.company;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums2 = {1};
        int[] nums1 = {2, 0};
        int m = 1;
        int n = 1;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int start = m;
        for (int i = 0; i < n; i++) {
            nums1[start] = nums2[i];
            start++;
        }
        //Now that the array is concatenated, it will be enough if we just sort the array, which is done by insertion sort here.

        int length = nums1.length;
        for (int i = 1; i < length; i++) {
            int key = nums1[i];
            int j = i - 1;
            while (j >= 0 && nums1[j] > key) {
                nums1[j + 1] = nums1[j];
                j = j - 1;
            }
            nums1[j + 1] = key;
        }
    }
}
