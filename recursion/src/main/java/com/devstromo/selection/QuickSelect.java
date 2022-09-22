package com.devstromo.selection;

import java.util.Random;

public class QuickSelect {

    private int[] nums;

    public QuickSelect(int[] nums) {
        this.nums = nums;
    }

    public void sort() {
        for (int i = 1; i < nums.length + 1; ++i) {
            System.out.println(select(i));
        }
    }

    public int select(int k) {
        // first_index, last_index, k' <- k' = k-1
        return quickSelect(0, nums.length - 1, k - 1);
    }

    // this is selection phase
    private int quickSelect(int firstIndex, int lastIndex, int k) {
        int pivot = partition(firstIndex, lastIndex);
        // if pivot < k
        if (pivot < k) {
            // we can discard the left sub-array, so we have to
            // consider the items on the right
            return quickSelect(pivot + 1, lastIndex, k);
        } else if (pivot > k) {
            // if pivot > k
            // we can discard the right sub-array, so we have to
            // consider the items on the left
            return quickSelect(firstIndex, pivot - 1, k);
        }
        return nums[pivot];
    }

    // partition phase
    private int partition(int firstIndex, int lastIndex) {
        // index of the random pivot [firstIndex, lastIndex]
        int pivot = new Random().nextInt(lastIndex - firstIndex + 1) + firstIndex;
        swap(pivot, lastIndex);

        for (int i = firstIndex; i < lastIndex; i++) {
            // < to find smallest and > to find largest k-th element
            if (nums[i] < nums[lastIndex]) {
                swap(i, firstIndex);
                firstIndex++;
            }
        }
        swap(lastIndex, firstIndex);

        // this is the index of the pivot
        return firstIndex;
    }

    private void swap(int pivot, int lastIndex) {
        int temp = nums[pivot];
        nums[pivot] = nums[lastIndex];
        nums[lastIndex] = temp;
    }
}
