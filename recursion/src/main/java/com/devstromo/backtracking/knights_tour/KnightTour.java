package com.devstromo.backtracking.knights_tour;

import static java.lang.Integer.MIN_VALUE;

public class KnightTour {
    private final int[][] chessTable;
    private final int boardSize;
    private final int[] xMoves = { 2, 1, -1, -2, -2, -1, 1, 2 };
    private final int[] yMoves = { 1, 2, 2, 1, -1, -2, -2, -1 };

    public KnightTour(int boardSize) {
        this.boardSize = boardSize;
        this.chessTable = new int[boardSize][boardSize];
        initializeChessTable();
    }

    private void initializeChessTable() {
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                chessTable[i][j] = MIN_VALUE;
            }
        }
    }

    public boolean solve() {
        //initial value (0,0)
        chessTable[0][0] = 0;
        if (solveProblem(1, 0, 0)) {
            showSolution();
            return true;
        } else {
            System.out.println("There is no solution");
            return false;
        }
    }

    private boolean solveProblem(int stepCount, int x, int y) {
        // base-case
        // this when we have considered all the cells of the chess board
        if (stepCount == boardSize * boardSize) {
            return true;
        }

        // consider all posible moves
        for (int moveIndex = 0; moveIndex < yMoves.length; moveIndex++) {
            int nextX = x + xMoves[moveIndex];
            int nextY = y + yMoves[moveIndex];
            //if the move is valid
            if (isValid(nextX, nextY)) {
                //make valid move
                chessTable[nextX][nextY] = stepCount;

                //solve the problem for the next index(nxt step)
                if (solveProblem(stepCount + 1, nextX, nextY))
                    return true;

                // can not solve the problem, so we backtrack
                // remove from solutions "BACKTRACKING"
                chessTable[nextX][nextY] = MIN_VALUE;
            }
        }
        // consider all possible moves but still can not find a feasible move
        return false;
    }

    private boolean isValid(int x, int y) {
        // can not leave the board horizontally and vertically
        if (x < 0 || x >= boardSize)
            return false;
        if (y < 0 || y >= boardSize)
            return false;
        // we cannot visit the same cell multiple times
        if (chessTable[x][y] != MIN_VALUE)
            return false;
        return true;
    }

    private void showSolution() {
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                System.out.print(this.chessTable[i][j] + " ");
            }
            System.out.println();
        }
    }
}
