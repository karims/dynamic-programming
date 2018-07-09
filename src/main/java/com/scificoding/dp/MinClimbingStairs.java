package com.scificoding.dp;

public class MinClimbingStairs {

  /**
   * On a staircase, the i-th step has some non-negative cost cost[i] assigned (0 indexed).
   * Once you pay the cost, you can either climb one or two steps. You need to find minimum cost to reach the top of the floor, and you can either start from the step with index 0, or the step with index 1.
   *
   * @param cost :: array of costs for each step
   * @return
   */
  public int minCostClimbingStairs(int[] cost) {
    int len = cost.length;
    int[] C = new int[len];
    C[0] = cost[0];
    C[1] = cost[1];

    for (int i = 2; i < len; i++) {
      C[i] = Math.min(C[i - 1], C[i - 2]) + cost[i];
    }

    return Math.min(C[len - 1], C[len - 2]);
  }
}
