package com.devstromo.divide_and_conquer.closest_pair_of_points;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class CPOPTest {

    @Test
    public void testAlgorithm() {
        var points = Arrays.asList(
          new Point(2, 3),
          new Point(3, 3),
          new Point(1, 1),
          new Point(1, 2),
          new Point(2, 1),
          new Point(2, 2));

        CPOP cpop = new CPOP(points);
        assertEquals(1.0, cpop.solveProblem());
    }

}