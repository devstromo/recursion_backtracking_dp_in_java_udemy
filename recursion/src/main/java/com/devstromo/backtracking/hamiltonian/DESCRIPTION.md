# HAMILTONIAN CYCLE PROBLEM
- The **Hamiltonian problem** is the problem of determining whether such paths and cycles exist in a `G(V,E)` graph or not 
- In Graph Theory a **Hamiltonian path** is a path in a directed or undirected graph that visits each vertex exactly once.
- **Hamiltonian cycle** is a Hamiltonian path that is a **cycle**
- brute-force approach has `O(N!)` running time complexity
- we can eliminate and discard multiple states ignore iteration if we are using **backtracking**
- this is a so-called NP-complete problem
- **DIRAC-PRINCIPLE**: a simple `G(V,E)` graph with `V` vertices is hamiltonian if every vertex has degree `V/2` or greater
- degree is the number of edges of a vertex
- **NOTE**: finding Hamiltonian path is NP-complete but we can decide whether such path exists in linear time complexity with topological order

## BACKTRACKING ALGORITHM:

1. Start with a random node(for example with index 0)
2. Keep adding one of the neighbors of the actual node and we make sure it is not added already to the solution list
3. we may **backtrack** is necessary