package com.devstromo.dynamic_programming.maximum_subarray;

import static java.lang.Math.max;

public class KadaneAlgorithm {

    // O(N) linear running time
    public int run(int[] nums) {
        int globalMax = nums[0];
        int localMax = nums[0];

        for (int i = 1; i < nums.length; ++i) {
            localMax = max(nums[i], localMax + nums[i]);
            if (localMax > globalMax) {
                globalMax = localMax;
            }
        }
        return globalMax;
    }
}
