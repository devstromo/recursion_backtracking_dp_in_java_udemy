package com.devstromo.backtracking.hamiltonian;

public class HamiltonianCycleProblem {

    private final int numOfVertexes;
    private final int[] hamiltonianPath;
    private final int[][] adjacencyMatrix;

    public HamiltonianCycleProblem(int[][] adjacencyMatrix) {
        this.adjacencyMatrix = adjacencyMatrix;
        this.numOfVertexes = adjacencyMatrix[0].length;
        this.hamiltonianPath = new int[numOfVertexes];
    }

    public void solve() {
        // we start with first index vertex(with index 0)
        hamiltonianPath[0] = 0;
        if (findSolution(1)) {
            showResult();
        } else {
            System.out.println("There is no solution..");
        }
    }

    private boolean findSolution(int position) {
        // we have considered all the vertex so end of the algorithm
        if (position == this.numOfVertexes) {
            // there is a connection back to the first node(index 0) so the cycle exists
            if (adjacencyMatrix[hamiltonianPath[position - 1]][hamiltonianPath[0]] == 1)
                return true;
            else
                return false;
        }
        // try all the possible vertex in the graph
        for (int vertexIndex = 1; vertexIndex < numOfVertexes; ++vertexIndex) {
            // if the node is feasible then this is the next node in the Hamiltonian cycle
            if (isValid(vertexIndex, position)) {
                // we include the vertex in the Hamiltonian Path
                hamiltonianPath[position] = vertexIndex;
                if (findSolution(position + 1))
                    return true;
                // BACKTRACK !!!
                // HERE BACKTRACKING DOES NOTHING - WE JUST CONSIDER ANOTHER VERTEX
            }
        }
        // tired all the vertex without a success
        return false;
    }

    private boolean isValid(int vertex, int actualPosition) {
        // first criteria: whether the two nodes are connected?
        if (adjacencyMatrix[hamiltonianPath[actualPosition - 1]][vertex] == 0) {
            return false;
        }
        // second criteria: whether we have already visited this given node?
        for (int i = 0; i < actualPosition; i++) {
            if (hamiltonianPath[i] == vertex) {
                return false;
            }
        }
        return true;
    }

    private void showResult() {
        System.out.println("Hamiltonian cycle exists:");
        for (int node : hamiltonianPath) {
            System.out.print(node + " - ");
        }
        System.out.println(hamiltonianPath[0]);
    }
}
