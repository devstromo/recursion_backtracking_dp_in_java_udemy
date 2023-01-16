package com.devstromo.dynamic_programming.fibonacci;

import java.util.Map;

public class Algorithm {

    public int fibonacci(int n) {
        if (n == 0 || n == 1)
            return 1;
        return fibonacci(n - 2) + fibonacci(n - 1);
    }

    // top-down approach MEMOIZATION
    public int fibonacci(int n, Map<Integer, Integer> table) {
        if (n == 0 || n == 1)
            return 1;

        if (!table.containsKey(n))
            table.put(n, fibonacci(n - 2, table) + fibonacci(n - 1, table));

        return table.get(n);
    }

    // bottom-up approach TABULATION
    public int fibonacciTabulation(int n, Map<Integer, Integer> table) {
        if (n == 0 || n == 1)
            return 1;
        // this has O(n) linear running time complexity
        for (int i = 2; i <= n; i++) {
            table.put(i, table.get(i - 2) + table.get(i - 1));
        }
        return table.get(n);
    }
}
