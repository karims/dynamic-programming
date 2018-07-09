package com.scificoding.dp;

/**
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 * Also asked in Leetcode - 53
 */
public class MaxContiguousSum {

  /**
   * To get max sub array
   * @param nums :: Input Array
   * @return max sum of contiguous subarray
   */
  public int maxSubArray(int[] nums) {
    int maxSoFar = nums[0], maxEndingHere = nums[0];

    for(int i = 1; i< nums.length; i++) {
      maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
      maxSoFar = Math.max(maxSoFar, maxEndingHere);
    }
    return maxSoFar;
  }
}
