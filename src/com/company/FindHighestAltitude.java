//https://leetcode.com/problems/find-the-highest-altitude/
//Leet code - 1732, easy.
// 25 August 2021
//We need to find the highest altitude that the biker has travelled in his journey.
//The given array is not the original altitude array, but the gain of the altitude, which means that it is the net gain from the point of i and i+1.
//We need to return the highest altitude of the given array.

//Need to make an original array and then shoud find the maximum of that array.
package com.company;

public class FindHighestAltitude {
    public static void main(String[] args) {

    }

    public int largestAltitude(int[] gain) {
        int[] altitude = new int[gain.length + 1];
        altitude[0] = 0;
        altitude[1] = gain[0];
        for (int i = 2; i < altitude.length; i++) {
            altitude[i] = altitude[i - 1] + gain[i - 1];
        }

        int max = altitude[0];

        for (int i = 1; i < altitude.length; i++) {
            if (altitude[i]>max){
                max = altitude[i];
            }
        }
        return max;
    }
}
