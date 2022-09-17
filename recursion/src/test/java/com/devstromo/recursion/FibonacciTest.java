package com.devstromo.recursion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class FibonacciTest {
    private static Fibonacci fibonacci;

    @BeforeAll
    public static void init() {
        fibonacci = new Fibonacci();
    }

    @Test
    public void fibHeadTest() {
        assertEquals(55, fibonacci.head(10));
    }

    @Test
    public void fibTailTest() {
        assertEquals(55, fibonacci.tail(10, 0, 1));
    }

    @Test
    public void fibIterativeTest() {
        fibonacci.iterative(10);
    }
}