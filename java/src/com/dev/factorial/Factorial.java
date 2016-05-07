package com.dev.factorial;


public class Factorial {
    public static int calculate(int n) {
        if (n<=1) return 1;
        return calculate(n-1) * n;
    }
}
