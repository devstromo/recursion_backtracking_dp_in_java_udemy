package com.devstromo.interview.two_eggs;

import static com.devstromo.interview.two_eggs.Constants.NUM_OF_EGG;
import static com.devstromo.interview.two_eggs.Constants.NUM_OF_FLOOR;
import static java.lang.Math.max;

public class EggDroppingProblem {

    // dp table to store the values for the sub-problems
    // dbTable[i][j] represents the minimum number of drops with i eggs and j floors
    private final int[][] dpTable = new int[NUM_OF_EGG + 1][NUM_OF_FLOOR + 1];

    public int solve() {
        // the first column is initialized with 1s
        // first column values are 1
        dpTable[0][0] = 1;
        dpTable[1][0] = 1;

        // linear search
        for (int i = 0; i <= NUM_OF_FLOOR; i++) {
            dpTable[1][i] = i;
        }

        // n is the index for the eggs - m is the index for the floors
        for (int n = 2; n <= NUM_OF_EGG; n++) {
            for (int m = 1; m <= NUM_OF_FLOOR; m++) {
                dpTable[n][m] = Integer.MAX_VALUE;

                // check dropping the egg from 1 to teh current floor m
                //NOTE: WE CAN REUSE THE SUB-SOLUTIONS FROM THE TABLE !!!
                for (int x = 1; x <= m; x++) {
                    // add one to include the current drop
                    // if an egg breaks then we have n-1 egg, and we need to check x-1 floors
                    // else if an egg doesn't break then we have n egg, and we need to check m-x floors
                    int maxDrops = 1 + max(dpTable[n - 1][x - 1], dpTable[n][m - x]);

                    // this is taking the minimum
                    if (maxDrops < dpTable[n][m]) {
                        dpTable[n][m] = maxDrops;
                    }
                }
            }
        }
        // the last item in the table contains the minimum number of drops
        return dpTable[NUM_OF_EGG][NUM_OF_FLOOR];
    }

}
