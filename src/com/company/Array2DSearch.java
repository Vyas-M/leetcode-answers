//This program says only whether the target value is present in the array or not.
//The program will not return the value of the index for the target element present in the array.

package com.company;

import java.util.Scanner;

public class Array2DSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int row = input.nextInt();
        System.out.println("Enter the number of columns:");
        int col = input.nextInt();

        int[][] arr = new int[row][col];

        System.out.println("Enter the array elements: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = input.nextInt();
            }
        }

        System.out.println("Enter the element which you need to search: ");
        int target = input.nextInt();

        int result = search(arr,target);

        if (result==0){
            System.out.println("The array is empty.");
        }
        else if (result==-1){
            System.out.println("The array element is not found.");
        }
        else {
            System.out.println("The target value is found.");
        }

    }

    static int search(int[][] arr, int target) {

        if (arr.length==0){
            return 0;
        }

        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (target == anInt) {
                    return 1;
                }
            }
        }

        return -1;
    }
}
