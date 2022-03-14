//September 2 2021.

//https://leetcode.com/problems/valid-perfect-square/
//Leet code - 367, easy.

//If a number is a perfect square, then we should return true and if it is not, then we should return false.
//It is basically, we need to find the square root for the number using binary search and return boolean value based on that.

package com.company;

public class Valid_Perfect_Square {
    public static void main(String[] args) {
        int num = 9;
        boolean ans = isPerfectSquare(num);
        System.out.println(ans);
    }

    public static boolean isPerfectSquare(int num) {
        if (num == 1){
            return true;
        }
        long start = 1;
        long end = num / 2;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            if (mid * mid < num) {
                start = mid + 1;
            } else if (mid * mid > num) {
                end = mid - 1;
            } else if (mid * mid == num) {
                return true;
            }
        }
        return false;
    }
}
