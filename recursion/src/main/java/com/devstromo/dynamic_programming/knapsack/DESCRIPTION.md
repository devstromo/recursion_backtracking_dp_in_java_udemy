# KNAPSACK PROBLEM

- it is a **combinatorial optimization** related problem
- given a set of **N** items - usually numbered from **1** to **N**
- each of these item has a mass **w<sub>i</sub>** and value **v<sub>i</sub>**
- determine the number of each item to include in a collection so that the total weight **M** is less than or equals to a given limit and the total value is as large as possible.
- the problem often arises in resource allocation where there are financial constraints

# APPLICATIONS

- finding the least wasteful way to cut raw materials
- selection of investments and portafolios
- selection of assets for asset-backed securities
- construction and scoring of tests in which the test-takers have a choice as to which questions they answer

There are two types

- **DIVISIBLE KP** (we can take fractions of the given items-fast algorithm)
- **0-1 KP** (EITHER WE TAKE A GIVEN ITEM OR DO NOT TAKE - COMPLEX SOLUTION)

## DIVISIBLE KP

- if we can take fractions of the given items then the greedy approach can be used
- sort the items according to their values - can be done in **O(NlogN)**
- start with the item that is the most valuable and take as much as possible - starting with highest **v<sub>i<sub>** item
- then try with the next item from our sorted list - we make a linear search in **O(N)** time complexity
- overall running time is **O(NlogN) + O(N) = O(NlogN)**
- so we can solve the divisible knapsack problem quite fast

## 0-1 KP

- we are not able to take fractions - we have to decide whether to take an item **(x=1)** or not **(x=0)**
- the greedy algorithm will not provide the optimal result
- another approach would be to sort by cost per unit weight and include from highest on down until knapsack is full but again not a good solution
- how many possible solutions are there with **N** items? The **brute-force approach** has **O(2<sup>N</sup>)** exponential running time
- we should use **dynamic programming** instead
- solves larger problems by relating to overlapping solve problems and then solve the same problems one by one.
- it works through the exponential set of solutions, but doesn't consider them all explicitly.
- stores intermediate results with the help of **memorization**, so they are not going to be re computed
- the solution to the original problem is easily computed from the solutions to the same
- running time of the KP: **O(nM)**
- it's not polynomial - it's so-called **pseudo-polynomial**
- numeric algorithm runs in **pseudo-polynomial time** if its running time is polynomial in the *numeric value* of the input - but is exponential in the *length* of the input (so the number of bits required to represent it)