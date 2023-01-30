package com.devstromo.interview.duplicates_in_array;

import static java.lang.Math.abs;

public class RepeatedIntegersProblem {

    public void solve(int[] array) {

        // this is why it is an O(N) running time algorithm
        for (int i = 0; i < array.length; ++i) {

            // if  this value is positive we have to flip
            if (array[abs(array[i])] > 0) {
                // otherwise it is negative: it means repetition
                array[abs(array[i])] = -array[abs(array[i])];
            } else {
                System.out.println(abs(array[i]) + " is a repetition!");
            }
        }
    }
}
