package com.devstromo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class RecursionTest {

    private static Recursion recursion;

    @BeforeAll
    public static void init() {
        recursion = new Recursion();
    }

    @Test
    public void iteracion() {
        assertEquals(15, recursion.iterationSum(5));
    }

    @Test
    public void recursionTest() {
        assertEquals(15, recursion.recursionSum(5));
    }
}
