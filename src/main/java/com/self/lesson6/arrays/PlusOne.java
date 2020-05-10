package com.self.lesson6.arrays;

import java.util.Arrays;

public class PlusOne {

  /**
   * Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
   *
   * <p>The digits are stored such that the most significant digit is at the head of the list, and
   * each element in the array contain a single digit.
   *
   * <p>You may assume the integer does not contain any leading zero, except the number 0 itself.
   *
   * <p>Example 1:
   *
   * <p>Input: [1,2,3] Output: [1,2,4] Explanation: The array represents the integer 123.
   */
  public static void main(String[] args) {
    System.out.println(Arrays.toString(plusOne(new int[] {9, 9, 9})));
  }

  public static int[] plusOne(int[] digits) {
    for (int i = digits.length - 1; i >= 0; i--) {
      if (digits[i] < 9) {
        digits[i] += 1;
        return digits;
      } else if (digits[i] == 9 && i == 0) {
        int arr[] = new int[digits.length + 1];
        arr[0] = 1;
        return arr;
      } else if (digits[i] == 9) {
        digits[i] = 0;
      }
    }
    return digits;
  }
}
