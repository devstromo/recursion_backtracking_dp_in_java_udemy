# KNIGHT'S TOUR PROBLEM

- The problema is that we have to visit every cell on an `NxN` chessboard such that we visit every cell exactly once
- closed tour - when the knight end point is the same as the starting point
- the knight's tour problem is an instance of the more general **Hamiltonian path** problem
- of course the closed knight's tour is the same as finding the **Hamiltonian cycle** of a `G(V,E)` graph
- we can make 8 possible move with the knight in a single iteration, but we have to do it to `NxN` every cell of the board
- it has **`O(2^(3(NxN)))` exponential running time** complexity
- unlike Hamiltonian path problem it can be solved in `O(N)` linear time with **divide-and-conquer** approach

## ALGORITHM:


- For an `MxN` chessboard the closed knight tour problem is always feasible, unless:

    - **M** and **N** are both odds
    - **M** = 1,2 or 4
    - **M** = 3 and **N** = 4,6, or 8