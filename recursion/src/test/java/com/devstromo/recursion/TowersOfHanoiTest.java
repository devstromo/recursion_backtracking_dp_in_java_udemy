package com.devstromo.recursion;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TowersOfHanoiTest {

    private static TowersOfHanoi hanoi;

    @BeforeAll
    public static void init() {
        hanoi = new TowersOfHanoi();
    }

    @Test
    public void solveTest() {
        hanoi.solve(2, 'A', 'B', 'C');
    }

}