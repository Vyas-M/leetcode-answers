//26 August 2021
//Here we are going to code the algorithm for selection sort.
//In the lowest level, we are just going to swap two number here.

package com.company;

import java.util.Arrays;

//public class SelectionSort {
//    public static void main(String[] args) {
//        int[] arr = {4, 2, 7, 1, 8, 5, 3};
//        selectionSort(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//
//    public static void selectionSort(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            int last = arr.length - i - 1;
//            int maxIndex = getMaxIndex(arr, 0, last);
//            swap(arr, maxIndex, last);
//        }
//    }
//
//    private static int getMaxIndex(int[] arr, int start, int last) {
//        int max = start;
//        for (int i = 1; i < last; i++) {
//            if (arr[max] < arr[i]) {
//                max = i;
//            }
//        }
//        return max;
//    }
//
//    static void swap(int[] arr, int first, int second){
//        int temp = arr[first];
//        arr[first] = arr[second];
//        arr[second] = temp;
//    }
//}


//This code is not working for some inputs, need to re write.

class SelectionSort
{
    void sort(int arr[])
    {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    // Prints the array
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    // Driver code to test above
    public static void main(String args[])
    {
        SelectionSort ob = new SelectionSort();
        int arr[] = {4, 2, 7, 1, 8, 5, 3};
        ob.sort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}