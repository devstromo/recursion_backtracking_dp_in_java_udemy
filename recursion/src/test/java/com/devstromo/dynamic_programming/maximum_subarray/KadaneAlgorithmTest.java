package com.devstromo.dynamic_programming.maximum_subarray;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KadaneAlgorithmTest {

    @Test
    public void testKadaneAlgorithm() {
        int[] n = { 1, -2, 3, 4 };
        KadaneAlgorithm algorithm = new KadaneAlgorithm();
        assertEquals(7, algorithm.run(n));
    }

}