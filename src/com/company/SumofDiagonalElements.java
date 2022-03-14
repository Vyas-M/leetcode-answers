//https://leetcode.com/problems/matrix-diagonal-sum/
//Leet Code - 1572, easy.

//Sum of diagonal elements is to be found and if an element occurs in both primary and secondary diagonal, then only one instance of that should be added.

package com.company;

public class SumofDiagonalElements {
    public static void main(String[] args) {
        int[][] arr = {{1,1,1,1}, {1,1,1,1}, {1,1,1,1}, {1,1,1,1}};
        int sum = diagonalSum(arr);
        System.out.println(sum);
    }

    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            sum = sum + mat[i][i];
        }
        int j=0;

        for (int i = mat.length-1; i >=0 ; i--) {

            sum = sum + mat[j][i];
            j++;
        }

        int n = mat.length;

        if (n%2!=0){
            int num = n/2;
            sum = sum - mat[num][num];
        }
        return sum;

    }
}


//Better code is:

//    public int diagonalSum(int[][] mat) {
//        int n = mat.length;
//        int left = 0, right = n - 1, sum = 0;
//        for(int i = 0; i < n; i ++) {
//            if(left != right)
//                sum = sum + mat[i][left] + mat[i][right];
//            else
//                sum = sum + mat[i][left];
//            left ++;
//            right --;
//        }
//        return sum;
//    }
