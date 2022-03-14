//https://leetcode.com/problems/sqrtx/
//Leet code - 69, easy.

//We need to find the square root of a given number and return it.
//It is enough if we find the integer part of the square root and not the whole thing.

package com.company;

public class Square_Root {
    public static void main(String[] args) {
        int x =2147395600;
        int ans = mySqrt(x);
        System.out.println(ans);

    }

    public static int mySqrt(int x) {
        long start = 0L, end = x/2 + 1L;
        while(start<end){
            long mid = start + (end-start+1)/2L;
            if(mid*mid<=x){
                start = mid;
            }
            else{
                end = mid-1;
            }
        }
        return (int)(start);
    }
}
