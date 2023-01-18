package com.devstromo.dynamic_programming.knapsack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class KnapsackProblemTest {

    @Test
    public void testKPProblem() {
        int numOfItems = 4;
        int capacityOfKnapsack = 7;
        int[] weightOfItems = { 0, 1, 3, 4, 5 };
        int[] profitOfItems = { 0, 1, 4, 5, 7 };
        KnapsackProblem problem = new KnapsackProblem(numOfItems, capacityOfKnapsack, weightOfItems, profitOfItems);
        problem.solve();
        problem.showResult();
    }

    @Test
    public void testKPProblemRecursion() {
        int numOfItems = 3;
        int capacityOfKnapsack = 6;
        int[] weightOfItems = { 2, 3, 3 };
        int[] profitOfItems = { 1, 2, 5 };
        int result = KnapsackProblem.solveRecursion(capacityOfKnapsack, weightOfItems, profitOfItems, numOfItems);
        assertEquals(7, result);
    }

}