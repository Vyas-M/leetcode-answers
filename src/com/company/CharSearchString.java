package com.company;

import java.util.Scanner;

public class CharSearchString {

    public static void main(String[] args) {
        String str;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        str = input.next();
        System.out.println("Enter the character to search: ");
        char target = input.next().charAt(0);
        boolean result;
        result = search(str, target);
        if (result==true){
            System.out.println("The character which you want is present in the string. ");
        }
        else {
            System.out.println("The character which you want is not present in the string. ");
        }
    }

    //We can also do this in the for each method.

    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }

        return false;
    }
}
