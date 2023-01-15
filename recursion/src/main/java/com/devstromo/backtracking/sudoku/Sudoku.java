package com.devstromo.backtracking.sudoku;

import static com.devstromo.backtracking.sudoku.Constants.BOARD_SIZE;
import static com.devstromo.backtracking.sudoku.Constants.MAX_NUMBER;
import static com.devstromo.backtracking.sudoku.Constants.MIN_NUMBER;

public class Sudoku {
    private final int[][] sudokuTable;

    public Sudoku(int[][] sudokuTable) {
        this.sudokuTable = sudokuTable;
    }

    public boolean solveProblem() {
        if (solve(0, 0)) {
            showSolution();
            return true;
        }
        System.out.println("There is no solution...");
        return false;
    }

    private boolean solve(int rowIndex, int colIndex) {
        //check the base-cases
        if (rowIndex == BOARD_SIZE) {
            colIndex++;
            // we have considered all the cells - end of algorithm
            if (colIndex == BOARD_SIZE) {
                return true;
            } else {
                // hop to the next column so re-initialize rowIndex=0;
                rowIndex = 0;
            }
        }
        // skip filled cell
        if (sudokuTable[rowIndex][colIndex] != 0) {
            return solve(rowIndex + 1, colIndex);
        }
        // consider all the numbers from 1-9
        for (int num = MIN_NUMBER; num < MAX_NUMBER; ++num) {
            if (isValid(rowIndex, colIndex, num)) {
                //we assign the number to that location
                sudokuTable[rowIndex][colIndex] = num;
                if (solve(rowIndex + 1, colIndex))
                    return true;
                // BACKTRACK !!
                // 0 means that it is an empty cell
                sudokuTable[rowIndex][colIndex] = 0;
            }
        }
        return false;
    }

    private boolean isValid(int rowIndex, int colIndex, int num) {
        return true;
    }

    private void showSolution() {
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
