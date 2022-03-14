//05 March 2022
//Leet code - 1523, Easy
//This is a part of programming skills path in leetcode, just wanted to check how it goes, as I am coding after a long time.

//Given two numbers, we need to find the numbers of odd numbers between them including the given limits, if they are odd.

package com.company;

public class Count_Odd_Numbers_Interval_Range {
    static int countOdds(int low, int high) {
        int count = 0;

        if (low % 2 == 0 && high % 2 == 0) {
            count = ((high - low) / 2);
            return count;
        } else if (low % 2 != 0 && high % 2 != 0) {
            count = (int) ((high - low) / 2) + 1;
            return count;
        } else if ((low % 2 != 0 && high % 2 == 0) || (low % 2 == 0 && high % 2 != 0)){
            count = (int) ((high - low) / 2) + 1;
            return count;
        }

        return 0;
    }

    public static void main(String[] args) {
        int ans = countOdds(6, 12);
        System.out.println(ans);

    }
}
