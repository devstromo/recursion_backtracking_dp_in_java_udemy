package com.devstromo.interview.integer_reversion;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class IntegerReversionTest {

    IntegerReversion reversion = new IntegerReversion();

    @Test
    public void testReverseInteger(){
        assertEquals(1234, reversion.solve(4321));
    }

    @Test
    public void testReverseIntegerWithZero(){
        assertEquals(34, reversion.solve(4300));
    }

}