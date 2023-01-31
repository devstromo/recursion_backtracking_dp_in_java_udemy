package com.devstromo.interview.largest_sum_subarray;

import static java.lang.Math.max;

public class LargestSumSubarray {
    public int solve(int[] nums) {
        int globalMax = nums[0];
        int currentMax = nums[0];

        for (int i = 1; i < nums.length; ++i) {
            currentMax = max(nums[i], currentMax + nums[i]);
            if (currentMax > globalMax) {
                globalMax = currentMax;
            }
        }
        return globalMax;
    }
}
