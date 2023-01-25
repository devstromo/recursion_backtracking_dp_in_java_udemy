package com.devstromo.optimal_packing.bin_packing;

import java.util.ArrayList;
import java.util.List;

public class Bin {
    private int id;

    // capacity
    private int capacity;
    // actualSize - sp the units of items we already store
    private int actualSize;
    private List<Integer> items;

    public Bin(int id, int capacity) {
        this.id = id;
        this.capacity = capacity;
        this.actualSize = 0;
        this.items = new ArrayList<>();
    }

    public boolean put(Integer item) {
        // the item does not fit into the bin
        if (actualSize + item > capacity)
            return false;
        // add the item to the bin
        items.add(item);
        actualSize += item;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder contentOfBin = new StringBuilder("Items in bin #" + this.id + ": ");
        for (Integer item : this.items) {
            contentOfBin.append(item)
              .append(" ");
        }
        return contentOfBin.toString();
    }
}
