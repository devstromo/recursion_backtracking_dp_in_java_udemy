package com.devstromo.recursion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class FactorialTest {
    private static Factorial factorial;

    @BeforeAll
    public static void init() {
        factorial = new Factorial();
    }

    @Test
    public void factorialTest() {
        assertEquals(120, factorial.head(5));
    }

    @Test
    public void factorialTailTest() {
        assertEquals(120, factorial.tail(5, 1));
    }
}