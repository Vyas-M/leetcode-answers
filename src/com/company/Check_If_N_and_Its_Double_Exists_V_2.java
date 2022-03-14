//This is a leet code problem and the details can be checked in the first version of the program which is named as Check_If_N_and_Its_Double_Exists
//This program was found in the searching part of the assignment and the first version which I did was not based on the searching technique.
//I am going to implement binary search concept in this for each element to find its 2 times value in the same array.


//This method is working for most of the cases, but is giving error if 0 is passed. So, an additional parameter should be added to the search program is that, the current index should not be checked.
//This program works well, but is slower than the first version.
package com.company;

public class Check_If_N_and_Its_Double_Exists_V_2 {
    public static void main(String[] args) {
        int[] arr = {-2, 0, 10, -19, 4, 6, -8};
        boolean ans = checkIfExist(arr);
        System.out.println(ans);
    }

    public static boolean checkIfExist(int[] arr) {
        arrange(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0 && arr[i + 1] == 0) {
                return true;
            }
            if (arr[i] != 0){
                boolean ans = search(arr, 2 * arr[i]);
                if (ans == true) {
                    return ans;
                }
            }
        }

        return false;
    }

    private static boolean search(int[] arr, int target) {
        //Here, we just need to do normal binary search and return true if the target element is found and false if it is not.
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return true;
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
