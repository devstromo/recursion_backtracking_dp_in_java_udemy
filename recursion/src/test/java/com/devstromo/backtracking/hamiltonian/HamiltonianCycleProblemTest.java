package com.devstromo.backtracking.hamiltonian;


import org.junit.jupiter.api.Test;

class HamiltonianCycleProblemTest {

    @Test
    public void testHamiltonianCycle() {
        int[][] adjacencyMatrix = { { 0, 1, 0, 0, 0, 1 }, { 1, 0, 1, 0, 0, 0 }, { 0, 1, 0, 0, 1, 0 }, { 0, 0, 0, 0, 1, 1 }, { 0, 0, 1, 1, 0, 1 },
          { 1, 0, 0, 1, 1, 0 }, };
        var hamiltonianCycle = new HamiltonianCycleProblem(adjacencyMatrix);
        hamiltonianCycle.solve();
    }

}