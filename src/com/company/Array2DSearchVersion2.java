//This program is similar to the Array2DSearch, but the difference is that, this returns the index value of the
//target element in the 2d matrix.
//Thing to improve -> There should be a if else loop for saying whether the target is present in the array or not.


package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Array2DSearchVersion2 {
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

        int[] result = search(arr,target);
        System.out.println("The target element is present in the idex numbers: " + Arrays.toString(result));
    }

    private static int[] search(int[][] arr, int target) {
        if (arr.length==0){
            return new int[]{0,0};
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (target == arr[i][j]) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
