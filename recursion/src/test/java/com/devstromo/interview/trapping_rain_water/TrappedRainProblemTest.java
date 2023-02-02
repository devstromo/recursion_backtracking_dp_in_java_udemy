package com.devstromo.interview.trapping_rain_water;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TrappedRainProblemTest {

    @Test
    public void testTrappedRainProblem() {

        TrappedRainProblem problem = new TrappedRainProblem();
        assertEquals(7, problem.solve(new int[] { 4, 1, 3, 1, 5 }));
        assertEquals(3, problem.solve(new int[] { 2, 1, 3, 1, 4 }));
        assertEquals(0, problem.solve(new int[] { 2, 1 }));

    }

}