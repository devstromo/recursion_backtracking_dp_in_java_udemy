package com.devstromo.search;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class BinarySearchTest {
    private static BinarySearch search;
    int[] nums = { -5, 1, 3, 5, 10, 100 };

    @BeforeAll
    public static void init() {
        search = new BinarySearch();
    }

    @Test
    public void binarySearchTest() {
        assertEquals(5, search.find(nums, 100, 0, nums.length));
    }

    @Test
    public void binarySearchNotFoundTest() {
        assertEquals(-1, search.find(nums, 1001, 0, nums.length));
    }


    @Test
    public void binarySearchIterativeTest() {
        assertEquals(5, search.find(nums, 100));
    }

    @Test
    public void binarySearchIterativeNotFoundTest() {
        assertEquals(-1, search.find(nums, 1001));
    }
}