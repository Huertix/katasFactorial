package com.dev.factorial;


public class Factorial {
    public static long calculate(long n) {
        if (n<=1) return 1;
        return calculate(n-1) * n;
    }
}
