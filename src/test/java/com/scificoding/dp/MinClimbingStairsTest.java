package com.scificoding.dp;

import junit.framework.TestCase;

public class MinClimbingStairsTest extends TestCase {
  private MinClimbingStairs climbingStairs;

  public void setUp() throws Exception {
    super.setUp();
    climbingStairs = new MinClimbingStairs();
  }

  public void tearDown() throws Exception {
  }

  public void testMinCostClimbingStairs() throws Exception {
    assertEquals(6, climbingStairs.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    assertEquals(15, climbingStairs.minCostClimbingStairs(new int[]{10, 15, 20}));
  }

}