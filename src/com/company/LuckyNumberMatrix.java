//30 August 2021
//https://leetcode.com/problems/lucky-numbers-in-a-matrix/
//Leet code - 1380, easy.

//We need to find the maximum of each row and minimum of each column and if one particular element is both minimum in a col and maximum in a row, then it is said to be a lucky number.
//We need to save max of each row in an array first and minimum of each col. Then if a particular element is present in both the array, then we should push it to the array list.

package com.company;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumberMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{7, 8}, {1, 2}};
        List<Integer> ans = new ArrayList<>();
        ans = luckyNumbers(matrix);
        System.out.println(ans);

    }

    public static List<Integer> luckyNumbers(int[][] matrix) {
        //finding the min element of each row.
        List<Integer> max_elements = new ArrayList<>();
        List<Integer> min_elements = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            int min = matrix[i][0];
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
            min_elements.add(min);
        }

        //finding the max element of each column.

        int[][] arr = new int[matrix.length][];
        arr = transpose(matrix);

        //Now that the columns are converted back to rows, we can just find the max of each row in the new array.

        for (int i = 0; i < arr.length; i++) {
            int max = arr[i][0];
            for (int j = 1; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            max_elements.add(max);
        }

        min_elements.retainAll(max_elements); //this takes out the common elements from both the list and will return that.

        return min_elements;
    }

    public static int[][] transpose(int[][] matrix) {
        int col = matrix.length;
        int row = matrix[0].length;
        int transpose[][] = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }


        return transpose;
    }
}
