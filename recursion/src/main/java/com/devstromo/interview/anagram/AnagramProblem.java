package com.devstromo.interview.anagram;

import static java.util.Arrays.sort;

public class AnagramProblem {

    public boolean solve(char[] s1, char[] s2) {
        if (s1.length != s2.length) {
            return false;
        }

        //sort the letters of the string
        //O(NlogN) this is the bottleneck of the algorithm
        sort(s1);
        sort(s2);

        // consider all the letters one by one, and we have to
        // compare these letters
        for (int i = 0; i < s1.length; ++i) {
            if (s1[i] != s2[i])
                return false;
        }
        return true;
    }
}
