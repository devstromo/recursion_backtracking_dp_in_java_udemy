package com.devstromo.backtracking.coloring;


import org.junit.jupiter.api.Test;

class GraphColoringTest {

    private final int[][] graph ={
      {0,1,1,1,0,0},
      {1,0,1,0,1,1},
      {1,1,0,1,0,1},
      {1,1,1,0,0,1},
      {1,0,1,1,0,0},
      {0,1,1,1,1,0},
    };


    @Test
    public void testColoringNoSolution(){
        GraphColoring coloring = new GraphColoring(graph, 3);
        coloring.solve();
    }

    @Test
    public void testColoringSolution(){
        GraphColoring coloring = new GraphColoring(graph, 4);
        coloring.solve();
    }

}