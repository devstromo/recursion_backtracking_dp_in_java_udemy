package com.devstromo.divide_and_conquer.merge_sort;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MergeSortTest {

    @Test
    public void testMergeSort() {
        int[] nums = { 5, -1, 0, 7, 2, 3, 2, 1, 0, 1, 2 };
        MergeSort sort = new MergeSort(nums);
        sort.sort();
        sort.showArray();
    }

    @Test
    public void testMergeSort1() {
        int[] nums = { -1, 0, 1 };
        MergeSort sort = new MergeSort(nums);
        sort.sort();
        sort.showArray();
    }

}