package com.devstromo.backtracking.knights_tour;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class KnightTourTest {

    @Test
    public void testKnightTourNotSolution() {
        KnightTour problem = new KnightTour(4);
        assertFalse(problem.solve());
    }

    @Test
    public void testKnightTourSolution() {
        KnightTour problem = new KnightTour(5);
        assertTrue(problem.solve());
    }

}