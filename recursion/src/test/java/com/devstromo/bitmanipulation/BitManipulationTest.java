package com.devstromo.bitmanipulation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class BitManipulationTest {

    @Test
    public void testANDOperator() {
        assertEquals(11, 27 & 15);
    }

    @Test
    public void testOROperator() {
        assertEquals(31, 27 | 15);
    }

    @Test
    public void testXOROperator() {
        assertEquals(20, 27 ^ 15);
    }

    @Test
    public void testLeftShiftOperator() {
        // increment the value
        assertEquals(54, 27 << 1);
    }

    @Test
    public void testRightShiftOperator() {
        // decrement the value
        assertEquals(13, 27 >> 1);
    }

    @Test
    public void testBinaryRepresentation() {
        assertEquals("1111000", Integer.toBinaryString(120));
    }

    @Test
    public void testCountBits() {
        assertEquals(7, BitManipulation.countBits(120));
    }

    @Test
    public void testIsEven() {
        assertTrue(BitManipulation.isEven(120));
    }

    @Test
    public void testIsOdd() {
        assertFalse(BitManipulation.isEven(11));
    }

    @Test
    public void testMultiplication() {
        assertEquals(50, BitManipulation.multiply(5, 10));
    }

    @Test
    public void testMultiplicationWithRecursion() {
        assertEquals(50, BitManipulation.multiplyRecursion(5, 10));
    }
}
