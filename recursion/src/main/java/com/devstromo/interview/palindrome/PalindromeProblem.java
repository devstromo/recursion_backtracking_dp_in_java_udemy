package com.devstromo.interview.palindrome;

public class PalindromeProblem {
    public boolean solve(String input) {
        int forward = 0;
        int backward = input.length() - 1;
        while (forward < backward) {
            if (input.charAt(forward) != input.charAt(backward))
                return false;

            forward++;
            backward--;
        }
        return true;
    }
}
