package com.devstromo.backtracking.sudoku;

import static com.devstromo.backtracking.sudoku.Constants.BOARD_SIZE;
import static com.devstromo.backtracking.sudoku.Constants.BOX_SIZE;
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
        for (int num = MIN_NUMBER; num <= MAX_NUMBER; ++num) {
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
        // if the given number is already in the column: the number
        // cannot be part of the solution
        for (int i = 0; i < BOARD_SIZE; ++i)
            if (sudokuTable[i][colIndex] == num)
                return false;

        // if the given number is already in the row: the number
        // cannot be part of the solution
        for (int i = 0; i < BOARD_SIZE; ++i)
            if (sudokuTable[rowIndex][i] == num)
                return false;

        // if the given number is already in the box: the number
        // cannot be part of the solution
        int boxRowOffset = (rowIndex / 3) * BOX_SIZE;
        int boxColumnOffset = (colIndex / 3) * BOX_SIZE;
        // all the 9 items of the box
        for (int i = 0; i < BOX_SIZE; ++i)
            for (int j = 0; j < BOX_SIZE; ++j)
                if (sudokuTable[boxRowOffset + i][boxColumnOffset + j] == num)
                    return false;
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
