package com.devstromo.dynamic_programming.fibonacci;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

class AlgorithmTest {

    private final Algorithm algorithm = new Algorithm();

    @Test
    public void testFibonacciRecursion() {
        assertEquals(34, algorithm.fibonacci(8));
    }

    @Test
    public void testFibonacciRecursionLongComputation() {
        assertEquals(1346269, algorithm.fibonacci(30));
    }

    @Test
    public void testFibonacciMemoization() {
        assertEquals(1346269, algorithm.fibonacci(30, new HashMap<>()));
    }

    @Test
    public void testFibonacciTabulation() {
        var table = new HashMap<Integer, Integer>();
        table.put(0, 1);
        table.put(1, 1);
        assertEquals(1346269, algorithm.fibonacci(30, table));
    }

}