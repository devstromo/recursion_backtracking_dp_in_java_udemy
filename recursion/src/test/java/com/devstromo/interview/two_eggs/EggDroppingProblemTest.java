package com.devstromo.interview.two_eggs;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class EggDroppingProblemTest {

    @Test
    public void testTwoEggsProblem() {
        EggDroppingProblem problem = new EggDroppingProblem();
        assertEquals(14, problem.solve());
    }

}