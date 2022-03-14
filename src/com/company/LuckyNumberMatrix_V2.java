//Dad gave an idea and I just wanted to try it out.
//The first version is working properly and is also submitted in leet code.
//This is giving index out of bound error and I am not going to sit debugging it.
//This gives output for some input, but not to all of them.

package com.company;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumberMatrix_V2 {

    public static void main(String[] args) {
        int[][] matrix = {{1, 10, 4, 2}, {9, 3, 8, 7}, {15, 16, 17, 12}};
        List<Integer> ans = new ArrayList<>();
        ans = luckyNumbers(matrix);
        System.out.println(ans);

    }

    public static List<Integer> luckyNumbers(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        //finding minimum element in each row.

        List<Integer> max_elements = new ArrayList<>();
        List<Integer> min_elements = new ArrayList<>();

        for (int i = 0; i < row; i++) {
            int min = matrix[i][0];
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
            min_elements.add(min);
        }

        //finding maximum element in each column.

        for (int i = 0; i < col; i++) {
            int max = matrix[0][i];
            for (int j = 0; j < row; j++) {
                if (matrix[j][i] > max) {
                    max = matrix[j][i];
                }
            }
            max_elements.add(max);
        }

        System.out.println(min_elements);
        System.out.println(max_elements);
        min_elements.retainAll(max_elements);
        return min_elements;
    }
}
