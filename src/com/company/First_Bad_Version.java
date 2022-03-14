//https://leetcode.com/problems/first-bad-version/
//Leet code - easy.
//An integer will be passed and we should consider numbers from 0 to that integer or 1 to that integer and, we need to find the first bad version by checking the api.
//We need to use binary search and it is like finding the first and last element of the array.
//If mid is not bad version, then we should change start after mid.
//After the first bad version, all elements will be bad version of the array, so we need to find the first bad version of it.
//This is similar to finding the first index of an element, but instead of an array, we are giving an integer here.

package com.company;

public class First_Bad_Version {
    public static void main(String[] args) {

    }

    public static int firstBadVersion(int n){
        int start = 0;
        int end = n -1;
        while (start<=end){
            int mid = start + (end - start) / 2;
            if (!isBadVersion(mid)){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return start;
    }

    private static boolean isBadVersion(int mid) { // This function is given as an api in leet code, so was not required to call.
        return false;
    }
}
