//https://leetcode.com/problems/flipping-an-image/
//Leet code - 832, easy.

//Should input a 2d Array and then should reverse each of its row and then should change the values of the elements to 1 if it is 0 and vice versa.
//The 2d array should contain only 0s and 1s as their elements. This is the constrain.

package com.company;

import java.util.Arrays;

public class FlippinganImage {
    public static void main(String[] args) {
        System.out.println("Hi");
        int[][] arr = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int [][] ans = new int[arr.length][];
        ans = flipAndInvertImage(arr);
        System.out.println("hi");
        for (int[] an : ans) {
            System.out.println(Arrays.toString(an));
        }
        //System.out.println(Arrays.toString(ans));
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        int[][] ans = new int[image.length][];
        for (int i = 0; i < image.length; i++) {
            reverseArray(image[i]);
        }

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                if (image[i][j] == 1) {
                    image[i][j] = 0;
                } else {
                    image[i][j] = 1;
                }
            }
        }
        return image;
    }

    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int temp = 0;
        while (start <= end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}


//This got accepted, but is not very efficient it seems, and also, the memory usage is higher.
//Should need to resolve after learning other techniques.