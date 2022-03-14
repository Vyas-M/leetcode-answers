//https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
//Leet code - 1304, easy.

//The function will be given an integer value and the function should return an array containing that integer number of elements whose sum is 0


package com.company;

import java.util.Arrays;

public class N_Unique_Integers_Sum_Zero {
    public static void main(String[] args) {
        int[] ans = sumZero(12);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] sumZero(int n) {
        if (n == 0) {
            int[] arr = {0};
            return arr;
        } else if (n % 2 != 0) {
            //If the number of elements is odd, then we should have 0 as the middle element.
            int[] arr = new int[n];
            arr[n / 2] = 0;
            int k = 1;
            for (int i = 0; i < n / 2; i++) {
                arr[i] = k;
                arr[n - i - 1] = -1 * k;
                k++;
            }

            return arr;
        } else {
            //If the number of elements is even, then we don't need to add 0 in the middle.
            int[] arr = new int[n];
            int k = 1;
            for (int i = 0; i < n - 1; i += 2) {
                arr[i] = k;
                arr[i+1] = -1*k;
                k++;
            }
            return arr;
        }
    }
}
