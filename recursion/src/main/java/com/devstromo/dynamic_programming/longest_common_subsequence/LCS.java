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
        return lcs.reverse()
          .toString();
    }

    // O(2^N) - n == m
    public int lcs(String s1, String s2, int m, int n) {
        // we keep decrementing m and n
        // this is the base-case for recursion
        if (m == 0 || n == 0) {
            return 0;
        }
        // the characters are matching in s1 and s2
        // we keep comparing the characters starting with the last ones!!!
        if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
            return 1 + lcs(s1, s1, m - 1, n - 1);
        } else {
            // characters are not matching: we either exclude the character
            // from the first string or from the second
            var x = lcs(s1, s2, m - 1, n);
            var y = lcs(s1, s2, m, n - 1);
            return max(x, y);
        }
    }

}
