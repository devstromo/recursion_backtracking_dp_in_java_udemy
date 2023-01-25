package com.devstromo.optimal_packing.bin_packing;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class FirstFitDecreasingAlgorithmTest {

    @Test
    public void testBinProblem() {
        var items = Arrays.asList(5, 5, 5);
        int binCapacity = 5;

        FirstFitDecreasingAlgorithm algorithm = new FirstFitDecreasingAlgorithm(items, binCapacity);
        algorithm.solve();
        algorithm.showResults();
    }

    @Test
    public void testBinProblemNotSolution() {
        var items = Arrays.asList(5, 5, 5);
        int binCapacity = 3;

        FirstFitDecreasingAlgorithm algorithm = new FirstFitDecreasingAlgorithm(items, binCapacity);
        algorithm.solve();
        algorithm.showResults();
    }

}