package com.self.lesson6.arrays;

import java.util.Arrays;

public class MoveZeroes {

  public static void main(String[] args) {
    moveZeroes(new int[] {0, 0, 1, -1});
  }

  public static void moveZeroes(int[] nums) {
    if (nums.length == 0 || nums.length == 1) {
      return;
    }
    int j = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        j++;
      }
    }
    System.out.println(Arrays.toString(nums));
  }
}
