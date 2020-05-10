package com.self.lesson6.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of size n, find the majority element. The majority element is the element that
 * appears more than ⌊ n/2 ⌋ times.
 *
 * <p>You may assume that the array is non-empty and the majority element always exist in the array.
 *
 * <p>Example 1:
 *
 * <p>Input: [3,2,3] Output: 3
 */
public class MajorityElement {

  public static void main(String[] args) {
    System.out.println(majorityElement(new int[] {2, 2, 1, 1, 1, 2, 2}));
    System.out.println(majorityElement2(new int[] {2, 2, 1, 1, 1, 2, 2}));
  }

  public static int majorityElement(int[] nums) {
    if (nums.length == 1) {
      return nums[0];
    }
    int maxCount = -1;
    int number = -1;

    final Map<Integer, Integer> map = new HashMap<>();
    for (int value : nums) {
      Integer count = map.get(value);
      if (count == null) {
        count = 1;
      } else {
        ++count;
      }

      if (count > maxCount) {
        maxCount = count;
        number = value;
      }
      map.put(value, count);
    }
    return number;
  }

  public static int majorityElement2(int[] nums) {
    Arrays.sort(nums);
    return nums[nums.length / 2];
  }
}
