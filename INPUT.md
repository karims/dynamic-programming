
A set of Dynamic programming problems solved in Java

1. Max contiguous sum in an Array :: [MaxContiguousSum.java](http://localhost)

    Explanation:
    
    
2. Min Cost Climbing Stairs :: [MinClimbingStairs.java](http://localhost)

    **Problem:**
    
    [Leetcode - 746](https://leetcode.com/problems/min-cost-climbing-stairs/description/)

    On a staircase, the i-th step has some non-negative cost `cost[i]` assigned (0 indexed).
    
     Once you pay the cost, you can either climb one or two steps. You need to find minimum cost to reach the top of the floor, and you can either start from the step with index 0, or the step with index 1.
     
       Example: 
       Input: cost = [10, 15, 20]
       Output: 15
       Explanation: Cheapest is start on cost[1], pay that cost and go to the top.
         
 Solution:
    
 Let $C\left( i\right)$ be the cost to reach step $i$,
    
 then,
  
  $$
  C(i) = min\{C(i-1), C(i-2)\} + A[i]
  $$
    
  Base case:
    
  $$C(0) = A[0]$$,
    
  $C(1) = A[1]$
    
  Result:
    
  $min\{C(n-1), C(n)\}$