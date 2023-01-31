package com.devstromo.interview.largest_sum_subarray;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LargestSumSubarrayTest {

    @Test
    public void testLargestSum() {
        // using kadane's algorithm
        LargestSumSubarray largestSumSubarray = new LargestSumSubarray();
        assertEquals(10, largestSumSubarray.solve(new int[] { 1, -2, 3, 4, -5, 8 }));
    }

}