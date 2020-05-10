package com.self.lesson6.arrays;

import java.util.*;

public class FindAllNumbersDisappearedInArray {

  /**
   * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice
   * and others appear once.
   *
   * <p>Find all the elements of [1, n] inclusive that do not appear in this array.
   *
   * <p>Could you do it without extra space and in O(n) runtime? You may assume the returned list
   * does not count as extra space.
   *
   * <p>Example:
   *
   * <p>Input: [4,3,2,7,8,2,3,1]
   *
   * <p>Output: [5,6]
   */
  public static void main(String[] args) {
    System.out.println(findDisappearedNumbers(new int[] {3, 2, 1, 2, 3, 4}));
  }

  /**
   * Runtime: 5 ms, faster than 81.04% of Java online submissions for Find All Numbers Disappeared
   * in an Array. Memory Usage: 49 MB, less than 32.08% of Java online submissions for Find All
   * Numbers Disappeared in an Array.
   */
  public static List<Integer> findDisappearedNumbers(int[] nums) {
    List<Integer> result = new ArrayList<>();
    if (nums.length == 0) {
      return result;
    }
    for (int i = 0; i < nums.length; i++) {
      int idx = Math.abs(nums[i]) - 1;
      if (nums[idx] > 0) {
        nums[idx] = -nums[idx];
      }
    }
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > 0) result.add(i + 1);
    }
    return result;
  }
}
