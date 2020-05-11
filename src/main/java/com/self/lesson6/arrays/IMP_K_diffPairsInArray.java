package com.self.lesson6.arrays;

import java.util.*;
import org.junit.Assert;

public class IMP_K_diffPairsInArray {

  /**
   * Given an array of integers and an integer k, you need to find the number of unique k-diff pairs
   * in the array. Here a k-diff pair is defined as an integer pair (i, j), where i and j are both
   * numbers in the array and their absolute difference is k.
   *
   * <p>Example 1: Input: [3, 1, 4, 1, 5], k = 2 Output: 2 Explanation: There are two 2-diff pairs
   * in the array, (1, 3) and (3, 5). Although we have two 1s in the input, we should only return
   * the number of unique pairs.
   */
  public static void main(String[] args) {
    Assert.assertEquals(1, findPairs2(new int[] {1, 3, 1, 5, 4}, 0));
    Assert.assertEquals(4, findPairs2(new int[] {1, 2, 3, 4, 5}, 1));
    Assert.assertEquals(2, findPairs2(new int[] {3, 1, 4, 1, 5}, 2));
  }

  public static int findPairs2(int[] nums, int k) {
    Arrays.sort(nums);
    int left = 0;
    int right = 1;
    int length = nums.length;
    int count = 0;

    while (right < length) {
      int diff = nums[right] - nums[left];
      if (diff > k) {
        left++;
      } else if (diff < k || left == right) {
        right++;
      } else {
        count++;
        int x = nums[right];
        while (right < length && nums[right] == x) {
          right++;
        }
      }
    }
    return count;
  }
}
