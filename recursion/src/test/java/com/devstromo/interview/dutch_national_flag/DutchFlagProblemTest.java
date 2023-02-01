package com.devstromo.interview.dutch_national_flag;

import org.junit.jupiter.api.Test;

class DutchFlagProblemTest {

    @Test
    public void testDutchFlagProblem() {
        DutchFlagProblem problem = new DutchFlagProblem(new int[] { 2, 1, 0, 0 });
        problem.solve();
        problem.showResult();
    }

}