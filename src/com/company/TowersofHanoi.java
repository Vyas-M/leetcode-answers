package com.company;

public class TowersofHanoi {
    static void towersofHanoi(int n, char from, char dest, char aux){
        if (n == 1){
            System.out.println("Move disk 1 from " + from + " to " + dest);
            return;
        }
        towersofHanoi(n-1, from, aux, dest);
        System.out.println("Move disk "+ n + " from rod " + from +" to rod " + dest );
        towersofHanoi(n-1, aux, dest, from);
    }
    public static void main(String[] args) {
        int n = 3;
        towersofHanoi(3, 'A', 'C', 'B');

    }
}
