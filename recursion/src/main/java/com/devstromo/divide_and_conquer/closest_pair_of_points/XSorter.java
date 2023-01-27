package com.devstromo.divide_and_conquer.closest_pair_of_points;

import java.util.Comparator;

public class XSorter implements Comparator<Point> {

    @Override
    public int compare(Point o1, Point o2) {
        return Double.compare(o1.getX(), o2.getX());
    }
}
