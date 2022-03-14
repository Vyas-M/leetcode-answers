//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
//19 August 2021
//this is same as the ceiling of the number, but the only difference here is that, we are using a character array.
//here, there is something called as letter wrap around

//Here, since we don't want to check whether the element and the target is equal, we will omit the equal to part.

package com.company;

public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] arr = {'c', 'f', 'j', 'k', 'o', 'p'};
        char target = 'm';

        nextGreatestLetter(arr, target);

    }
    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }

        return letters[start%letters.length];
    }
}
