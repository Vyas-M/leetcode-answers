package com.company;

import java.util.Scanner;

//the logic in this code is not the same as the logic behind matrix multiplication, but I just wanted to try to build something similar
// and so did this.

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] a = new int[3][3];
        int[][] b = new int[3][3];


        System.out.println("Enter the values for the first Matrix:");

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = input.nextInt();
            }
        }

        System.out.println("Enter the values for the second Matrix:");

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = input.nextInt();
            }
        }

        int[][] product = new int[3][3];

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                product[i][j] = a[i][j] * b[i][j];
            }
        }

        System.out.println("The product of the two arrays are: ");

        for (int[] ints : product) { //for every ints in product. Here, for the loop, the data type is integer array.
            for (int anInt : ints) { // for every anInt in ints, print anInt, which is print the element.
                System.out.print(anInt + "\t");
            }
            System.out.println("");
        }

    }


}
