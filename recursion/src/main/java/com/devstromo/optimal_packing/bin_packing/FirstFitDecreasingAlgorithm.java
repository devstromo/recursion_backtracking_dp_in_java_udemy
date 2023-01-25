package com.devstromo.optimal_packing.bin_packing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FirstFitDecreasingAlgorithm {

    private final List<Bin> bins;
    private final List<Integer> items;
    private final int binCapacity;
    private int binCounter = 1;

    public FirstFitDecreasingAlgorithm(List<Integer> items, int binCapacity) {
        this.binCapacity = binCapacity;
        this.items = items;
        this.bins = new ArrayList<>(items.size());
    }

    public void solve() {
        //sort items in descending order
        items.sort(Collections.reverseOrder());

        // that there is no feasible solution
        if (items.get(0) > binCapacity) {
            System.out.println("No feasible solution");
            return;
        }
        //first bin !!!
        bins.add(new Bin(binCounter, binCapacity));

        for (Integer item : items) {
            //track whether we have put the item into a bin or not
            boolean isOk = false;
            // this is how we track the actual bin
            int currentBin = 0;
            while (!isOk) {
                // item does not fit in last bin -> try a new bin
                if (currentBin == bins.size()) {
                    Bin newBin = new Bin(++binCounter, binCapacity);
                    newBin.put(item);
                    bins.add(newBin);
                    isOk = true;
                } else if (bins.get(currentBin)
                  .put(item)) {
                    isOk = true;
                } else {
                    // trying the next bin
                    currentBin++;
                }
            }
        }
    }

    public void showResults() {
        for (Bin bin : bins) {
            System.out.println(bin);
        }
    }
}
