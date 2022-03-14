//17 October 2021
//https://leetcode.com/problems/contains-duplicate/

//Leet code - 217, easy.

//Check if the array has duplicate elements and return true or false.

//Should sort the array first and if the element is same as its next element, then there is duplicate element or otherwise not.

package com.company;

import java.util.Arrays;

public class Contains_Duplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        boolean ans = containsDuplicate(arr);
        System.out.println(ans);
    }

    public static boolean containsDuplicate(int[] arr) {
        selectionSort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            swapElement(arr, min_index, i);
        }
    }

    private static void swapElement(int[] arr, int maxElement, int last) {
        int temp = arr[maxElement];
        arr[maxElement] = arr[last];
        arr[last] = temp;
    }

}

//This submission took so long, leet code gave the error time limit exceeded. Check in the second version of the question for the answer.