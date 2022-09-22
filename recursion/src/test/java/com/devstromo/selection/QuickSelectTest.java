package com.devstromo.selection;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QuickSelectTest {

    int[] nums = { 1, -5, 10, 55, 2, 3, -7, 7, 11, 100 };

    @Test
    public void quickSelect() {
        QuickSelect quickSelect = new QuickSelect(nums);
        assertEquals(-5, quickSelect.select(2));
    }


    @Test
    public void quickSelect3th() {
        QuickSelect quickSelect = new QuickSelect(nums);
        assertEquals(1, quickSelect.select(3));
    }

    @Test
    public void quickSelectSort() {
        QuickSelect quickSelect = new QuickSelect(nums);
        quickSelect.sort();
    }

}