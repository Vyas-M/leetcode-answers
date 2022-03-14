//https://leetcode.com/problems/count-items-matching-a-rule/
//Leet code - 1773, easy
//25 August 2021
//We need to return the number of the row for which the rule key and rule value matches.


package com.company;

import java.util.List;

public class CountItemsMatchingRule {
    public static void main(String[] args) {

    }

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int in;
        if (ruleKey.equals("type")) {
            in = 0;
        } else if (ruleKey.equals("color")) {
            in = 1;
        } else {
            in = 2;
        }
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).get(in).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}
