package com.devstromo.dynamic_programming.rod_cutting;

import org.junit.jupiter.api.Test;

class RodCuttingTest {

    @Test
    public void testRodCuttingAlgorithm() {
        int n = 5;
        int[] prices = { 0, 2, 5, 7, 3, 9 };

        RodCutting rodCutting = new RodCutting(n, prices);
        rodCutting.solve();
        rodCutting.show();
    }

}