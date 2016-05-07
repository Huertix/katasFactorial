package com.dev.factorial;


public class Factorial {
    public static long calculate(long n) {
        return n>1 ? calculate(n-1) * n : 1;
    }
}
