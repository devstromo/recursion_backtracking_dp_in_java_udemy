# SUDOKU PROBLEM

- It is a combinatorial number-placement puzzle
- the objective is to fill a **9x9** grid with digits so that each column, each row and each of the nine **3x3** subgrids (boxes) that compose the grid contain all of the digits from **1** to **9**
- initially we have a partially completed grid which for a well-posed puzzle ha a unique solution
- the same integer may not appear twice in the same row, same column or in any of the nine **3x3** boxes of the **9x9** grid
- It's a **NP-complete** problem
- Search space is exponentially large
- this is why it has exponential `O(M^N)` running time complexity
- where M is the number of possibilities for a single cell(9) and `N` is the number of blank fields at the beginning
- we can use **backtracking** to solve this problem