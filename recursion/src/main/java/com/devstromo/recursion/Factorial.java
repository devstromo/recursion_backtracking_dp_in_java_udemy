package com.devstromo.recursion;

public class Factorial {

    public int head(int n) {
        // the factorial of 1 is 1(1!=1)
        if (n == 1)
            return 1;
        int res1 = head(n - 1);        // n! = n*(n-1)...
        return n * res1;
    }

    public int tail(int n, int accumulator) {
        // the factorial of 1 is 1(1!=1)
        if (n == 0)
            return accumulator;
        // n! = n*(n-1)...
        return tail(n - 1, n * accumulator);
    }
}
