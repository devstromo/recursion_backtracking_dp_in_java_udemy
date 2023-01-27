package com.devstromo.divide_and_conquer.closest_pair_of_points;

import static java.lang.Math.abs;
import static java.lang.Math.min;
import static java.lang.Math.sqrt;

import java.util.ArrayList;
import java.util.List;

public class CPOP {

    private List<Point> points;

    public CPOP(List<Point> points) {
        this.points = points;
    }

    public double solveProblem() {
        List<Point> sortedXPoints = new ArrayList<>();
        List<Point> sortedYPoints = new ArrayList<>();

        for (var point : points) {
            sortedXPoints.add(point);
            sortedYPoints.add(point);
        }
        // we have to sort the items(points) based on X and Y
        sortedXPoints.sort(new XSorter());
        sortedYPoints.sort(new YSorter());

        return findClosestPoint(sortedXPoints, sortedYPoints, sortedXPoints.size());
    }

    private double findClosestPoint(List<Point> sortedXPoints, List<Point> sortedYPoints, int numOfPoints) {
        if (numOfPoints <= 3) {
            return bruteForceSearch(sortedXPoints);
        }

        int middleIndex = numOfPoints / 2;
        Point middlePoint = sortedXPoints.get(middleIndex);

        // DIVIDE PHASE - we keep dividing the data-set into left and right sub-arrays
        var leftSubPointsSortedX = new ArrayList<Point>();
        var rightSubPointsSortedX = new ArrayList<Point>();

        for (int index = 0; index < numOfPoints; ++index) {
            if (sortedXPoints.get(index)
              .getX() <= middlePoint.getX()) {
                leftSubPointsSortedX.add(sortedXPoints.get(index));
            } else {
                rightSubPointsSortedX.add(sortedXPoints.get(index));
            }
        }
        // then we have to find the CPP in the left and right sub-arrays
        double deltaLeft = findClosestPoint(leftSubPointsSortedX, sortedYPoints, middleIndex);
        double deltaRight = findClosestPoint(rightSubPointsSortedX, sortedYPoints, numOfPoints - middleIndex);

        double delta = min(deltaLeft, deltaRight);

        var pointsInStrip = new ArrayList<Point>();

        // linear search for the items that fall within the strip [middleItem.x - delta, middleItem.x + delta]
        for (int index = 0; index < numOfPoints; ++index) {
            if (abs(sortedYPoints.get(index)
              .getX() - middlePoint.getX()) < delta) {
                pointsInStrip.add(sortedYPoints.get(index));
            }
        }

        double minDistanceStrip = findMinimumDistanceInStrip(pointsInStrip, delta);

        // CONQUER
        return min(delta, minDistanceStrip);
    }

    private double findMinimumDistanceInStrip(List<Point> pointsInStrip, double delta) {
        double minDistance = delta;

        // O(16) x O(N) = O(N)

        // this is a O(N) running time algorithm
        for (int i = 0; i < points.size(); ++i) {
            for (int j = i + 1; j < points.size() && (points.get(j)
              .getY() - points.get(i)
              .getY()) < minDistance; ++j) {
                minDistance = distance(points.get(i), points.get(j));
            }
        }
        return minDistance;
    }

    private double bruteForceSearch(List<Point> points) {
        // this approach has O(NxN) running time
        // we want to check the distance between the points just once
        // d(a,b) = d(b,a)
        double minDistance = Double.MAX_VALUE;

        for (int i = 0; i < points.size() - 1; ++i) {
            for (int j = i + 1; j < points.size(); ++j) {
                var actualDistance = distance(points.get(i), points.get(j));
                if (actualDistance < minDistance) {
                    minDistance = actualDistance;
                }
            }
        }
        return minDistance;
    }

    private double distance(Point point1, Point point2) {
        var xDistance = point1.getX() - point2.getX();
        var yDistance = point1.getY() - point2.getY();
        return sqrt(xDistance * xDistance + yDistance * yDistance);
    }
}
