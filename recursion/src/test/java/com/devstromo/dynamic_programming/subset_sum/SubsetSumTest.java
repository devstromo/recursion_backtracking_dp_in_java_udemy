package com.devstromo.dynamic_programming.subset_sum;

import org.junit.jupiter.api.Test;

class SubsetSumTest {

    @Test
    public void testSubsetSumProblem() {
        int[] numbers = { 1, 7, 4, 3, 6, 5, 9, 11 };
        int m =43;
        SubsetSum problem = new SubsetSum(numbers, m);
        problem.solve();
        problem.showResult();
    }

}