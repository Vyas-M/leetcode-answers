//Leet code - 1672
//Should find the sum of each induvidual array in a two dimensional array and should return the maximum value from that
//https://leetcode.com/problems/richest-customer-wealth/
package com.company;

public class MaxCustomerWealth {
    public static void main(String[] args) {

    }

    public static int maximumWealth(int[][] accounts) {

        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            int sum = 0;
            for (int anInt : ints) {
                sum = sum + anInt;
            }
            if (sum > ans) {
                ans = sum;
            }
        }

        return ans;
    }
}

