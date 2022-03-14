//https://leetcode.com/problems/guess-number-higher-or-lower/
//leet code - 374, easy.

//Based on the integer which we get in return, we need to find the number that was guessed by the user.
//We need to do binary search and that's it.


package com.company;

public class Guess_Number_Higher_Lower {
    public static void main(String[] args) {

    }

    public int guessNumber(int n) {
        int start = 1;
        int end = n;
        while (start <= end){
            int mid = start + (end -start) / 2;
            int ans = guess(mid);
            if (ans == -1){
                end = mid -1;
            } else if (ans == 1){
                start = mid + 1;
            } else {
                return mid;
            }

        }

        return -1;
    }

    private int guess(int mid) { // This is an API to be called in Leet code, defined here so that the error message doesn't appear.
        return 5;
    }
}
