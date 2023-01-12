# COLORING PROBLEM

- We have to color the vertices of a `G(V,E)` graph such that no two adjacent vertices share the same color
- We use integer representation for the given colors
- the smallest number of colors needed to color a graph `G(V,E)` is called its **chromatic number**
- there may be more than one solution - for the example we can color a graph with **4** vertices in **12** ways with **3** colors
- there are several applications of this problem
- it's an **NP-complete** problem
- if we have `k` colors and want to assign colors to vertices in a `G(V,E)` graph then the running time is `O(k^v)` 
- so with brute-force approach we can achieve **exponential running** time complexity

# APPROACHES

- **greedy approach** - it finds a solution but not necessarily the best one possible(it may use more colors)
- **backtracking** - it can discard and reject multiple bad states within a single iteration(or recursive function call)
- **Powell-Welsh algorithm** - relies on sorting the nodes based on the degree(number of edges)

# BACKTRACK ALGORITHM

- we assign **colors** one by one to different vertices starting from the first vertex(for example with index **0**)
- before assigning a color: we check for safety by considering already assigned colors to the adjacent vertices
- if we find a color assignment which is feasible: we mark the color assigment as part of the solution
- if we do not a find color due to clashes: we **BACKTRACK**

# APPLICATIONS

### 1- BIPARTITE GRAPHS

- determining if a graph can be colored with **2** colors is equivalent to determining whether or not the graph is bipartite
- this problem is computable in `O(N)` linear time using breadth-first search
- bipartite graph: a graph whose vertices can be divided into two disjoint sets `U` and `V`(`U` and `V` are independent sets) such that every edge connects a vertex in `U` to one in `V`

### 2- SCHEDULING

- the aim is to make an **exam schedule** for a university
- we have different subjects and different students enrolled on every subject - many subjects would have common students
- how do we schedule the exam so that no two exams with a common student are scheduled at the same time?
- how manu minimum time slots are needed to schedule all exams?
- this problem can be represented as a `G(V,E)` graph where every vertex is a subject and an edge between two vertices means there is a common student
- so this is a `G(V,E)` graph `coloring problem` where minimum number of time slots is equals to the **k chromatic number** of the graph

### 3- RADIO FREQUENCY ASSIGMENT

- when frequencies are assigned to towers - frequencies assigned to all towers at the same location must be different because of the interference
- **how to assign frequencies with this constraint? what is the minimum number of frequencies needed?**
- this problem is also an instance of graph coloring prom where every tower represents a vertex
- an edge between two towers represents that they are in range each other

### 4- REGISTER ALLOCATION(COMPUTERS)

- **compiler optimization** relies heavily on the coloring problem
- register allocation is the process of assigning a large number of target program variables onto a small number of **CPU** registers

### 5- MAP COLORING

- we want to construct a map of countries or states where adjacent countries or states can not be assigned the same color 
- this is one of the widely known algorithmic problems
- four colors are enough to color any map - this is the so-called **"four color theorem"**

