package com.devstromo.interview.palindrome;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PalindromeProblemTest {
    private final PalindromeProblem palindromeProblem = new PalindromeProblem();

    @Test
    public void testIsPalindrome() {
        assertTrue(palindromeProblem.solve("radar"));
    }

    @Test
    public void testIsNotPalindrome() {
        assertFalse(palindromeProblem.solve("adam"));
    }
}