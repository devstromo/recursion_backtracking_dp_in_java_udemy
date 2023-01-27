package com.devstromo.interview.integer_reversion;

public class IntegerReversion {
    public int solve(int input) {
        var reversed = 0;
        var remainder = 0;
        while (input > 0) {
            remainder = input % 10;
            input = input / 10;
            reversed = reversed * 10 + remainder;
        }
        return reversed;
    }
}
