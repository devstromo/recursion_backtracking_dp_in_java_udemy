package com.devstromo.recursion;

public class Recursion {

    public int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum(n - 1);
    }

    //we sum up the first n integers
    public int iterationSum(int n) {
        int result = 0;

        for (int num = 0; num <= n; num++) {
            result += num;
        }
        return result;
    }

    public int recursionSum(int n) {
        //we have to define the base-case
        if (n == 1)
            return 1;
        return n + recursionSum(n - 1);
    }

    // may produce and stackoverflow
    public int factorial(int N) {
        if (N == 1)
            return 1;
        return N * factorial(N - 1);
    }

    public int factorial(int N, int result) {
        if (N == 1)
            return result;
        return factorial(N - 1, N * result);
    }

    public void head(int n) {
        if (n == 0)
            return;
        //we call the method recursively
        head(n - 1);
        // we do some operations
        // operation = System.out.println
        System.out.println("The value n=" + n);
    }

    public void tail(int n) {
        if (n == 0)
            return;
        // we do some operations
        // operation = System.out.println
        System.out.println("The value n=" + n);
        //we call the method recursively
        tail(n - 1);
    }
}
