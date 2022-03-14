//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
//Leet code - 167


package com.company;

public class Two_Sum_2 {
    public static void main(String[] args) {

    }

    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        int ans[] = new int[2];
        int sum = numbers[start] + numbers[end];
        while (start <= end) {
            if (sum == target) {
                ans[0] = start + 1;
                ans[1] = end + 1;
                return ans;
            } else if (sum < target) {
                start++;
            } else {
                end--;
            }
        }
        return new int[]{-1, -1};
    }
}
