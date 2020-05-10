package com.self.lesson6.arrays;

import java.util.Arrays;

public class RotateArrayLater {

  public static void main(String[] args) {
    int[] arr1 = {};
    rotate(arr1, 3);
  }

  public static void rotate(int[] nums, int k) {
    int size = nums.length;

    if (size == 0 || size == 1 || k == 0) {
      return;
    }
    while (k > 0) {
      int temp = nums[size - 1];
      for (int i = size - 1; i > 0; i--) {
        nums[i] = nums[i - 1];
      }
      nums[0] = temp;
      k--;
    }
    System.out.println(Arrays.toString(nums));
  }
}
