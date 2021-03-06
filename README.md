
A set of Dynamic programming problems solved in Java

1. Max contiguous sum in an Array :: [MaxContiguousSum.java](src/main/java/com/scificoding/dp/MaxContiguousSum.java)

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
    
 Let <img src="svgs/f0b7066ab97b643052e3de5559a82e4d.svg?sanitize=true&invert_in_darkmode" align=middle width=34.11295304999999pt height=24.65753399999998pt/> be the cost to reach step <img src="svgs/77a3b857d53fb44e33b53e4c8b68351a.svg?sanitize=true&invert_in_darkmode" align=middle width=5.663225699999989pt height=21.68300969999999pt/>,  
 then,  
  <img src="svgs/12a4e03bf8cb8944b8e8d5f962748378.svg?sanitize=true&invert_in_darkmode" align=middle width=273.58149225pt height=24.65753399999998pt/>
   
  Base case:  
  <img src="svgs/edd6525ca89c8a93144d9c6a8318625c.svg?sanitize=true&invert_in_darkmode" align=middle width=85.52736719999999pt height=24.65753399999998pt/>,    
  <img src="svgs/195c02650bce9ef645cbd305c7458af8.svg?sanitize=true&invert_in_darkmode" align=middle width=85.52736719999999pt height=24.65753399999998pt/>
    
  Result:  
  <img src="svgs/198e6aae4a23919d4b4c45dd58450d06.svg?sanitize=true&invert_in_darkmode" align=middle width=153.17180009999998pt height=24.65753399999998pt/>