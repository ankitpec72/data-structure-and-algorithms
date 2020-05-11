package com.self.lesson6.arrays;

import java.util.Arrays;
import org.junit.Assert;

public class ShortestUnsortedContinuousSubarray {

  /**
   * Given an integer array, you need to find one continuous subarray that if you only sort this
   * subarray in ascending order, then the whole array will be sorted in ascending order, too.
   *
   * <p>You need to find the shortest such subarray and output its length.
   *
   * <p>Example 1: Input: [2, 6, 4, 8, 10, 9, 15] Output: 5 Explanation: You need to sort [6, 4, 8,
   * 10, 9] in ascending order to make the whole array sorted in ascending order.
   */
  public static void main(String[] args) {
    Assert.assertEquals(5, findUnsortedSubarray(new int[] {2, 6, 4, 8, 10, 9, 15}));
    Assert.assertEquals(2, findUnsortedSubarray(new int[] {1, 3, 2, 8, 10, 13, 15}));
    Assert.assertEquals(3, findUnsortedSubarray(new int[] {1, 3, 2, 2, 8, 10, 13, 15}));
    Assert.assertEquals(0, findUnsortedSubarray(new int[] {1}));
    Assert.assertEquals(0, findUnsortedSubarray(new int[] {1, 2, 3}));
    Assert.assertEquals(2, findUnsortedSubarray(new int[] {1, 2, 3, 5, 4, 6}));
    Assert.assertEquals(2, findUnsortedSubarray(new int[] {2, 1}));
  }

  public static int findUnsortedSubarray(int[] nums) {
    int[] snums = nums.clone();
    Arrays.sort(snums);
    int start = snums.length, end = 0;
    for (int i = 0; i < snums.length; i++) {
      if (snums[i] != nums[i]) {
        start = start < i ? start : i;
        end = i > end ? i : end;
      }
    }
    return (end - start >= 0 ? end - start + 1 : 0);
  }
}
