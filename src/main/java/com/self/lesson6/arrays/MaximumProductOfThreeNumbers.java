package com.self.lesson6.arrays;

import org.junit.Assert;

public class MaximumProductOfThreeNumbers {

  /**
   * Given an integer array, find three numbers whose product is maximum and output the maximum
   * product.
   *
   * <p>Example 1:
   *
   * <p>Input: [1,2,3] Output: 6
   */
  public static void main(String[] args) {
    Assert.assertEquals(6, maximumProduct(new int[] {1, 2, 3}));
    Assert.assertEquals(-6, maximumProduct(new int[] {-1, -2, -3, -4}));
    Assert.assertEquals(24, maximumProduct(new int[] {1, 2, 3, 4}));
    Assert.assertEquals(24, maximumProduct(new int[] {-1, -2, -3, 4}));
    Assert.assertEquals(720, maximumProduct(new int[] {-4, -3, -2, -1, 60}));
    Assert.assertEquals(-6, maximumProduct(new int[] {-3, -2, -1}));
    Assert.assertEquals(0, maximumProduct(new int[] {-3, -2, 0}));
  }

  /**
   * Runtime: 2 ms, faster than 99.13% of Java online submissions for Maximum Product of Three
   * Numbers. Memory Usage: 41.1 MB, less than 46.43% of Java online submissions for Maximum Product
   * of Three Numbers.
   */
  public static int maximumProduct(int[] nums) {
    int first = Integer.MIN_VALUE;
    int sec = Integer.MIN_VALUE;
    int third = Integer.MIN_VALUE;
    int min1 = Integer.MAX_VALUE;
    int min2 = Integer.MAX_VALUE;

    for (int i = 0; i < nums.length; i++) {
      int number = nums[i];
      if (first < number) {
        third = sec;
        sec = first;
        first = number;
      } else if (sec < number) {
        third = sec;
        sec = number;
      } else if (third < number) {
        third = number;
      }
      if (number < min1) {
        min2 = min1;
        min1 = number;
      } else if (number < min2) {
        min2 = number;
      }
    }
    int productOFMAx3 = first * sec * third;
    int prodWithMin = min1 * min2 * first;
    return productOFMAx3 > prodWithMin ? productOFMAx3 : prodWithMin;
  }
}
