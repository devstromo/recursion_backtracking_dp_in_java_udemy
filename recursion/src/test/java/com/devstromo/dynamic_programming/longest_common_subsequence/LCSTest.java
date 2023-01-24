package com.devstromo.dynamic_programming.longest_common_subsequence;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LCSTest {

    @Test
    public void testLCS() {
        LCS lcs = new LCS();
        String result = lcs.lcs("abcd", "fg");
        assertEquals("", result);
    }

    @Test
    public void testLCSMatch() {
        LCS lcs = new LCS();
        String result = lcs.lcs("abcd", "bd");
        assertEquals("bd", result);
    }

    @Test
    public void testLCSMatchDifferentLength() {
        LCS lcs = new LCS();
        String result = lcs.lcs("abcd", "rtbxxxxd");
        assertEquals("bd", result);
    }

    @Test
    void testLcsRecursive() {
        var lcs = new LCS();
        var x = "MZJAWXU";
        var y = "XMJYAUZ";

        assertEquals(6, lcs.lcs(x, y, x.length(), y.length()));
    }

}