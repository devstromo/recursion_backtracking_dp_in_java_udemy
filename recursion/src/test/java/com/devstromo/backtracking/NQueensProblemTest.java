package com.devstromo.backtracking;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class NQueensProblemTest {

    @Test
    public void testNQueenProblemNoSolution() {
        NQueensProblem problem = new NQueensProblem(3);
        assertFalse(problem.solve());
    }

    @Test
    public void testNQueenProblemWithSolution() {
        NQueensProblem problem = new NQueensProblem(5);
        assertTrue(problem.solve());
    }
}