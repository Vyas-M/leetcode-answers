//https://leetcode.com/problems/add-to-array-form-of-integer/
//Leet code - 989, easy.

//Given an array and an number, we must convert the array into an integer, and then should add the integer with the second integer and convert the result back to an array.


package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AddtoArrayFormInteger {
    public static void main(String[] args) {
        List<Long> ans;
        int[] arr = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        ans = addToArrayForm(arr, 1);
        System.out.println(ans);
    }

    public static List<Long> addToArrayForm(int[] arr, int k) {
        //first, we need to convert the array to an integer.
        long num = 0;
        long n = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            //We are going to access from the last element.
            num = num + (arr[i] * n);
            n = n * 10;
        }
        num = num + k;
        //Now, we need to convert the num into an arraylist.
        n = 1;
        int sum = 0;
        ArrayList<Long> list = new ArrayList<>();
        while (num > 0) {
            list.add(num % 10);
            num = num / 10;
        }

        Collections.reverse(list);

        return list;
    }
}
