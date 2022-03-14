package com.company;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char ch = input.next().trim().charAt(0);

        //int a  = ch;

        //System.out.println(a);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("The character is in lower case.");
        }

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("The character is in upper case.");
        }
    }
}
