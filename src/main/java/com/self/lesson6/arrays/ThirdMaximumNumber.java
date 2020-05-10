package com.self.lesson6.arrays;

import java.util.*;

public class ThirdMaximumNumber {
  /**
   * Given a non-empty array of integers, return the third maximum number in this array. If it does
   * not exist, return the maximum number. The time complexity must be in O(n).
   *
   * <p>Example 1: Input: [3, 2, 1]
   *
   * <p>Output: 1
   *
   * <p>Explanation: The third maximum is 1.
   */
  public static void main(String[] args) {
    System.out.println(thirdMax(new int[] {1, 2, 2, 5, 3, 5}));
  }

  public static int thirdMax(int[] nums) {
    if (nums.length == 1) return nums[0];
    if (nums.length == 2) {
      return nums[0] > nums[1] ? nums[0] : nums[1];
    }
    final List<Integer> list1 = new ArrayList<>();
    int maximum = Integer.MIN_VALUE;
    for (int value : nums) {
      if (maximum < value) {
        maximum = value;
      }
      if (list1.contains(value)) {
        continue;
      }
      list1.add(value);
    }
    return list1.size() < 3 ? maximum : list1.get(2);
  }
}
