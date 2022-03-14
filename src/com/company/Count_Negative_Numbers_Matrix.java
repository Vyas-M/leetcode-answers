//https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
//Leet code - easy.

//The question has a matrix arranged in descending order and we need to count the number of negative numbers in the matrix.
//Using binary search for finding the index position of the first occurrence of the negative number in the array and then, subtracting that index position
//from the array length gives the number of negative element for that row.

package com.company;

public class Count_Negative_Numbers_Matrix {
    public static void main(String[] args) {
        int arr[][] = {{3, 2}, {1, 0}};
        int ans = countNegatives(arr);
        System.out.println(ans);
    }

    public static int countNegatives(int[][] grid) {
        int count = 0;
        int ans = 0;
        for (int[] arr : grid) {
            int start = 0;
            int end = arr.length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] >= 0) {
                    start = mid + 1;
                } else if (arr[mid] < 0) {
                    end = mid - 1;
                }
            }
            ans = start; //this is the first occurence of a negative value.
            if (start < arr.length) {
                count = count + arr.length - ans;
            }

        }

        return count;
    }
}
