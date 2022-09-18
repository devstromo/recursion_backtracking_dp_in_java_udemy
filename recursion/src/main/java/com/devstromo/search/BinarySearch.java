package com.devstromo.search;

public class BinarySearch {

    public int find(int[] container, int item, int left, int right) {
        if (right <= left)
            return -1;
        int middle = (right + left) / 2;
        if (container[middle] == item)
            return middle;
        if (container[middle] < item)
            return find(container, item, middle + 1, right);
        return find(container, item, left, middle - 1);
    }

    public int find(int[] container, int item) {
        int left = 0;
        int right = container.length;
        int middle = -1;
        while (left < right) {
            middle = (right + left) / 2;
            if (container[middle] == item)
                return middle;
            if (container[middle] < item) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }
}
