# MAZE PROBLEM

- The problem is that we have to construct an algorithm that can fund its way out of an `NxN` maze
- We can represent the problem with an **`NxN` matrix** again
- it is an important problem in **robotics**: how to navigate a robot in hte most effective manner
- for example: autonomous **vacuum cleaners**
- there may be several obstacles so we can use **backtracking** - or we can construct the search tree and use depth-first search

# ALGORITHM

- If we know the maze then we can use the heavy-weight graph algorithms: **Dijkstra's algorithm** and **A*** **search**
- if we do not know the maze: we can use **backtracking** (_Trémaux algorithms_ or depth-first search are the same)