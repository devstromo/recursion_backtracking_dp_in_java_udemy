package com.devstromo.divide_and_conquer.merge_sort;

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
    public void testMergeSortTwo() {
        int[] nums = { -1, 0, 1 };
        MergeSort sort = new MergeSort(nums);
        sort.sort();
        sort.showArray();
    }

    @Test
    public void testMergeSortReverse() {
        int[] nums = { -1, 0, 1 };
        MergeSort sort = new MergeSort(nums);
        sort.reverseOrder();
        sort.showArray();
    }

    @Test
    public void testMergeSortReverseTwo() {
        int[] nums = { 5, -1, 0, 7, 2, 3, 2, 1, 0, 1, 2 };
        MergeSort sort = new MergeSort(nums);
        sort.reverseOrder();
        sort.showArray();
    }

}