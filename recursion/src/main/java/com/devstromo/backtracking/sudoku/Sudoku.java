package com.devstromo.backtracking.sudoku;

import static com.devstromo.backtracking.sudoku.Constants.BOARD_SIZE;

public class Sudoku {
    private final int[][] sudokuTable;

    public Sudoku(int[][] sudokuTable) {
        this.sudokuTable = sudokuTable;
    }

    public boolean solveProblem() {
        return false;
    }

    private boolean solve(int rowIndex, int colIndex) {
        return false;
    }

    private boolean isValid(int rowIndex, int colIndex, int num) {
        return true;
    }

    public void showSolution() {
        for (int i = 0; i < BOARD_SIZE; ++i) {
            if (i % 3 == 0)
                System.out.println();
            for (int j = 0; j < BOARD_SIZE; ++j) {
                if (j % 3 == 0)
                    System.out.print(" ");
                System.out.print(sudokuTable[i][j] + " ");
            }
            System.out.println();
        }
    }
}
