//29 August 2021
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
//Leet code - 448, easy.

//Google Interview Question.

//This question is similar to missing numbers question.
//Given an array from 1 to n numbers, we need to find all the missing numbers in the array and return the missing number array.
//This can be done using cyclic sort method as we have the hint of 1 to n.
//For all the indexes that does not have the correct element are the answer.


package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllNumbersDisappearedInArray {
    public static void main(String[] args) {
        int[] arr = {0, 3, 1, 5, 4};
        List<Integer> ans = new ArrayList<>();
        ans = findDisappearedNumbers(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(ans);
    }

    public static List<Integer> findDisappearedNumbers(int[] arr) {
        //Using the same code in the cyclic sort program.
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[correct] != arr[i]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                ans.add(index + 1);
            }
        }
        return ans;
    }

    private static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }


}

//The code got accepted in Leet Code, but I am unable to run it here.