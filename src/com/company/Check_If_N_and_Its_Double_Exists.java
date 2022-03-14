//https://leetcode.com/problems/check-if-n-and-its-double-exist/
//Leet code - 1346, easy.

//For each and every element, we need to check if the double of the element is present in the same array or not.
//If it is present, then we should return true and if not, then false.

//In this class, I am trying to pass each element in an for loop and trying to check whether 2 times of the same element is present in the array using another for loop.
//But, before passing, I am going to sort the array in the first hand.

//This can also be done using binary search and I am going to implement that in the version 2 of this program.
package com.company;

public class Check_If_N_and_Its_Double_Exists {
    public static void main(String[] args) {
        int[] arr = {-10,12,-20,-8,15};
        boolean ans = checkIfExist(arr);
        System.out.println(ans);
    }

    public static boolean checkIfExist(int[] arr) {
        arrange(arr); //Sorting the array in the ascending order.
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {  //If the array is sorted in the ascending order, then 2 times of the element will for sure be placed in the position after the element.
                if ((2*arr[i]) == arr[j] || (2*arr[j]) == arr[i]){ //The or statement is included to accept negative elements too.
                    return true;
                }
            }
        }

        return false;
    }

    public static void arrange(int[] arr) {
        int temp;
        {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] < arr[j]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
    }
}
