package com.devstromo.backtracking.maze;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class MazeProblemTest {

    @Test
    public void testMazeProblem() {
        int mazeTable[][] = { { 1, 1, 1, 1 }, { 1, 0, 1, 0 }, { 0, 0, 1, 1 }, { 1, 0, 1, 1 }, };
        MazeProblem problem = new MazeProblem(mazeTable);
        assertTrue(problem.solve());
    }

    @Test
    public void testMazeProblemNotSolution() {
        int mazeTable[][] = { { 1, 0, 1, 1 }, { 1, 0, 1, 0 }, { 0, 0, 1, 1 }, { 1, 0, 1, 1 }, };
        MazeProblem problem = new MazeProblem(mazeTable);
        assertFalse(problem.solve());
    }

    @Test
    public void testMazeProblemWithStepBack() {
        int mazeTable[][] = { { 1, 1, 1, 1, 1 }, { 0, 0, 0, 0, 1 }, { 1, 0, 1, 1, 1 }, { 0, 0, 1, 0, 0 }, { 1, 0, 1, 1, 1 }, };
        MazeProblem problem = new MazeProblem(mazeTable);
        //        assertTrue(problem.solve());
        // need to implement step back
    }

}