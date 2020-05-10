package com.self.lesson6.arrays;

public class MaxConsecutiveOnes {

  /**
   * Given a binary array, find the maximum number of consecutive 1s in this array.
   *
   * <p>Example 1: Input: [1,1,0,1,1,1] Output: 3 Explanation: The first two digits or the last
   * three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
   *
   * <p>1,0,1,1,0,1,1,1
   */
  public static void main(String[] args) {
    System.out.println(findMaxConsecutiveOnes(new int[] {}));
  }

  /**
   * Runtime: 1 ms, faster than 100.00% of Java online submissions for Max Consecutive Ones. Memory
   * Usage: 41.5 MB, less than 5.88% of Java online submissions for Max Consecutive Ones.
   */
  public static int findMaxConsecutiveOnes(int[] nums) {
    int max = 0;
    int current = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 1) {
        current++;
        if (max < current) {
          max = current;
        }
      } else {
        current = 0;
      }
    }
    return max;
  }
}
