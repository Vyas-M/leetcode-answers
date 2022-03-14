//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
//Leet code - 1431, easy
//We should return an array list of boolean values.
//The description in the problem is enough.

package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumCandy {
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extra = 3;
        List<Boolean> result = new ArrayList<>();
        result = kidsWithCandies(candies, extra);
        System.out.println(result);
    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int max = candies[0];
        for (int candy : candies) {
            if (max < candy) {
                max = candy;
            }
        }
        for (int i = 0; i < candies.length; i++) {
            if ((candies[i] + extraCandies) >= max) {
                ans.add(true);
            } else {
                ans.add(false);
            }
        }
        return ans;
    }
}
