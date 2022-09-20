package com.devstromo.search;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class LinearSearchTest {

    private static LinearSearch search;
    int[] nums = { 1, 5, -5, 3, 10, 100 };

    @BeforeAll
    public static void init() {
        search = new LinearSearch();
    }

    @Test
    public void linearSearchTest() {
        assertEquals(5, search.find(nums, 100));
    }

    @Test
    public void linearSearchNotFoundTest() {
        assertEquals(-1, search.find(nums, 1000));
    }

    @Test
    public void linearSearchRecursiveTest() {
        assertEquals(5, search.find(nums, 100, 0));
    }

    @Test
    public void linearSearchRecursiveNotFoundTest() {
        assertEquals(-1, search.find(nums, 1000, 0));
    }
}