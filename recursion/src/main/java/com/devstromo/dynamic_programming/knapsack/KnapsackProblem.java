package com.devstromo.dynamic_programming.knapsack;

import static java.lang.Math.max;

public class KnapsackProblem {

    // total number of items
    private final int n;
    // this is th M capacity of the knapsack
    private final int capacity;

    // dynamic programming table (2 dimensional array)
    private int[][] S;
    private final int[] weights;
    private final int[] values;

    public KnapsackProblem(int n, int capacity, int[] weights, int[] values) {
        this.n = n;
        this.capacity = capacity;
        this.weights = weights;
        this.values = values;
        this.S = new int[n + 1][capacity + 1];
    }

    public void solve() {
        // initialize
        // time complexity: O(n*M)
        for (int i = 1; i < n + 1; i++) {
            for (int w = 1; w < capacity + 1; w++) {
                // whether to take the item 'i' or not
                int notTakingItem = S[i - 1][w];
                int takingItem = 0;

                if (weights[i] <= w) {
                    takingItem = values[i] + S[i - 1][w - weights[i]];
                }
                // memoization -we store the sub-results in an array
                S[i][w] = max(takingItem, notTakingItem);
            }
        }
    }

    public void showResult() {
        System.out.println("Total benefit: " + S[n][capacity]);
        for (int i = n, w = capacity; i > 0; i--) {
            if (S[i][w] != 0 && S[i][w] != S[i - 1][w]) {
                System.out.println("We take item: #" + i);
                w = w - weights[i];
            }
        }
    }
}
