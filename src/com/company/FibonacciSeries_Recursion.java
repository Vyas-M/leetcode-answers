//22 September 2019.
//We are just executing fibonacci series using recursion. Based on the videos of Kunal Kuswaha.

package com.company;

public class FibonacciSeries_Recursion {
    public static void main(String[] args) {
        System.out.println(fibo(6 )  );
    }

    static int fibo(int n) {
        //base condition
        if (n<2){
            return n;
        }

        return fibo(n - 1) + fibo(n - 2);
    }
}
