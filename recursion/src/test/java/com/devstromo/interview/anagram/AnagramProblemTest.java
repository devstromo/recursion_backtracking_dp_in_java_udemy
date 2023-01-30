package com.devstromo.interview.anagram;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class AnagramProblemTest {

    private final AnagramProblem problem = new AnagramProblem();

    @Test
    public void testAnagramNotMatching() {
        assertFalse(problem.solve("Adam".toCharArray(), "Daniel".toCharArray()));
    }

    @Test
    public void testAnagramMatching() {
        assertTrue(problem.solve("restful".toCharArray(), "fluster".toCharArray()));
    }

}