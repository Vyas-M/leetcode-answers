//https://leetcode.com/problems/transpose-matrix/
//Leet code - 867, easy.

//To find the transpose of the matrix.

package com.company;

import java.util.Arrays;

public class TransposeofMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int [][] trm = new int[matrix.length][];
        trm = transpose(matrix);
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
