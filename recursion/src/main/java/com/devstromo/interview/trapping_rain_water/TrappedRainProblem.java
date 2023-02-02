package com.devstromo.interview.trapping_rain_water;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class TrappedRainProblem {

    // it has O(N) running time(with additional O(N) memory complexity)
    // dp approach - memoization
    public int solve(int[] heights) {
        // less than 3 bars can not trap any water
        if (heights.length < 3) {
            return 0;
        }

        //create arrays for the max left and right values
        int[] leftMax = new int[heights.length];
        int[] rightMax = new int[heights.length];

        // calculating the left max values(from left to right)
        leftMax[0] = 0;
        for (int i = 1; i < leftMax.length; i++) {
            leftMax[i] = max(leftMax[i - 1], heights[i - 1]);
        }

        // calculating the right max values(from right to left)
        rightMax[heights.length - 1] = 0;
        for (int i = heights.length - 2; i >= 0; i--) {
            rightMax[i] = max(rightMax[i + 1], heights[i + 1]);
        }
        //consider all the items in O(N) running time
        int trapped = 0;
        for (int i = 1; i < heights.length - 1; i++) {
            int min = min(leftMax[i], rightMax[i]);
            if (min > heights[i]) {
                trapped += min - heights[i];
            }
        }
        return trapped;
    }
}
