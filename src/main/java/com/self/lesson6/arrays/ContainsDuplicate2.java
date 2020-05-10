package com.self.lesson6.arrays;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate2 {

  /**
   * Given an array of integers and an integer k, find out whether there are two distinct indices i
   * and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is
   * AT MOST (IMP) k.
   *
   * <p>Example 1:
   *
   * <p>Input: nums = [1,2,3,1], k = 3 Output: true
   */
  public static void main(String[] args) {
    System.out.println(containsNearbyDuplicate(new int[] {2, 2}, 3));
  }
  /** Runtime: 5 ms, faster than 88.44% of Java online submissions for Contains Duplicate II. */
  // IMP map.put returns value is already present :)
  public static boolean containsNearbyDuplicate(int[] nums, int k) {
    final Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      final Integer lastIndex = map.put(nums[i], i);
      if (lastIndex != null && Math.abs(lastIndex - i) <= k) {
        return true;
      }
    }
    return false;
  }
}
