package com.self.lesson6.arrays;

import java.util.Arrays;
import org.junit.Assert;

public class ArrayPartition1 {

  /**
   * Given an array of 2n integers, your task is to group these integers into n pairs of integer,
   * say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as
   * large as possible.
   *
   * <p>Example 1: Input: [1,4,3,2]
   *
   * <p>Output: 4 Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4).
   */
  public static void main(String[] args) {
    Assert.assertEquals(4, arrayPairSum(new int[] {1, 4, 3, 2}));
    Assert.assertEquals(0, arrayPairSum(new int[] {0}));
    Assert.assertEquals(1, arrayPairSum(new int[] {0, 1, 0, 1}));
    Assert.assertEquals(-1, arrayPairSum(new int[] {0, -1, 0, 1}));
  }

  /**
   * Runtime: 10 ms, faster than 95.69% of Java online submissions for Array Partition I. Memory
   * Usage: 41.5 MB, less than 100.00% of Java online submissions for Array Partition I.
   */
  public static int arrayPairSum(int[] nums) {
    if (nums.length == 1) {
      return nums[0];
    }
    Arrays.sort(nums);
    int sum = 0;
    for (int i = 0; i < nums.length; i += 2) {
      sum += nums[i];
    }
    return sum;
  }
}
