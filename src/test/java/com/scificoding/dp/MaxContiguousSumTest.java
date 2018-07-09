package com.scificoding.dp;

import junit.framework.TestCase;

public class MaxContiguousSumTest extends TestCase {
  MaxContiguousSum maxContiguousSum;

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    maxContiguousSum = new MaxContiguousSum();
  }

  public void testMaxSubArray() throws Exception {
    assertEquals(6, maxContiguousSum.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
  }

}