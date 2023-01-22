package com.devstromo.dynamic_programming.longest_common_subsequence;

import static java.lang.Math.max;

public class LCS {
    public String lcs(String s1, String s2) {
        // we need a 2d array to memoize the sub-results
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];

        // this is why the running time is O(m*n)
        // m=s1.length() and n=s2.length()
        for (int i = 1; i < s1.length() + 1; ++i) {
            for (int j = 1; j < s2.length() + 1; ++j) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        StringBuilder lcs = new StringBuilder();
        int i = s1.length();
        int j = s2.length();
        while (i > 0 && j > 0) {
            // if the current characters of s1 and s2 are matching then the
            // character is part of the LCS
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                lcs.append(s2.charAt(j - 1));
                i--;
                j--;
                // if letters are ot matching then find the larger of two and
                // take a step in the direction of the larger
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }
        return lcs.reverse().toString();
    }

}
