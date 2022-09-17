package com.devstromo.recursion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class GCDTest {
    private static GCD gcd;

    @BeforeAll
    public static void init() {
        gcd = new GCD();
    }

    @Test
    public void gcdRecursiveTest() {
        assertEquals(5, gcd.recursive(45, 10));
    }

    @Test
    public void gcdIterativeTest() {
        assertEquals(1, gcd.iterative(21, 11));
    }

    @Test
    public void gcdIterativeTwoTest() {
        assertEquals(5, gcd.iterative(45, 10));
    }
}