package com.self.lesson6.arrays;

public class MissingNumber {
  /**
   * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is
   * missing from the array.
   *
   * <p>Example 1:
   *
   * <p>Input: [3,0,1] Output: 2 Example 2:
   *
   * <p>Input: [9,6,4,2,3,5,7,0,1] Output: 8
   */
  public static void main(String[] args) {
    System.out.println(missingNumber(new int[] {0, 1}));
  }
  /**
   * Runtime: 0 ms, faster than 100.00% of Java online submissions for Missing Number. Memory Usage:
   * 40.1 MB, less than 100.00% of Java online submissions for Missing Number.
   */
  public static int missingNumber(int[] nums) {
    int length = nums.length;
    int totalSum = (length * (length + 1)) / 2;
    int sum = 0;
    for (int value : nums) {
      sum += value;
    }
    return totalSum - sum;
  }
}
