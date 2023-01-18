# ROD CUTTING PROBLEM

- Given a rod with certain length **N**
- Given the **p<sub>i</sub>** prices for roods of length **i** where **1 <= i <= N**
- each cut is integer length
- what is the optimal way of cutting the rod into smaller parts in order to **maximize profit**?

Given a rod with length **N = 4**

1m 2m 3m 4m
$2 $5 $7 $3

- the naive approach(brute-force method) is to use a simple recursion
- **N - 1** cuts can be mde in the rod of length **N**
- the problem that there are a huge number of overlapping subproblems (as usual with recursion)
- it has **O(2<sup>N</sup>)** exponential time complexity - where **N** is the length of the rod in units
- for every length we have **2** options whether to cut or not
- we do not know in advance where to cut
- let **r<sub>i</sub>** be the max(optimal) revenue for rod size **i**
- if we cut the rod when **i=1** then the total revenue is **p[1]+r<sub>n-1</sub>** and so on

