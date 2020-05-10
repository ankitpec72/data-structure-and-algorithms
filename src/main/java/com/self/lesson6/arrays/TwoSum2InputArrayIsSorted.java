package com.self.lesson6.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum2InputArrayIsSorted {

  /**
   * Given an array of integers that is already sorted in ascending order, find two numbers such
   * that they add up to a specific target number.
   *
   * <p>The function twoSum should return indices of the two numbers such that they add up to the
   * target, where index1 must be less than index2.
   *
   * <p>Note:
   *
   * <p>Your returned answers (both index1 and index2) are not zero-based. You may assume that each
   * input would have exactly one solution and you may not use the same element twice. Example:
   *
   * <p>Input: numbers = [2,7,11,15], target = 9 Output: [1,2] Explanation: The sum of 2 and 7 is 9.
   * Therefore index1 = 1, index2 = 2.
   */
  public static void main(String[] args) {
    System.out.println(Arrays.toString(twoSum2(new int[] {5, 25, 75}, 100)));
  }

  public static int[] twoSum(int[] numbers, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < numbers.length; i++) {
      if (map.containsKey(numbers[i])) {
        return new int[] {map.get(numbers[i]) + 1, i + 1};
      }
      map.put(target - numbers[i], i);
    }
    throw new RuntimeException("Error");
  }

  /**
   * Runtime: 0 ms, faster than 100.00% of Java online submissions for Two Sum II - Input array is
   * sorted. Memory Usage: 39.9 MB, less than 5.22% of Java online submissions for Two Sum II -
   * Input array is sorted.
   */
  public static int[] twoSum2(int[] numbers, int target) {
    int left = 0;
    int right = numbers.length - 1;
    while (left < right) {
      if (numbers[left] + numbers[right] == target) {
        return new int[] {left + 1, right + 1};
      } else if (target > numbers[left] + numbers[right]) { // 100, 80
        left++;
      } else {
        right--;
      }
    }
    return null;
  }
}
