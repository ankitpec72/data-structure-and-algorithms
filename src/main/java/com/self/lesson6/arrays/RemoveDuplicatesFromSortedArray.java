package com.self.lesson6.arrays;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

  public static void main(String[] args) {
    System.out.println(removeDuplicates(new int[] {1, 1, 2}));
  }

  public static int removeDuplicates(int[] nums) {
    if (nums.length == 0) return 0;
    int j = 0;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] != nums[j]) {
        j++;
        nums[j] = nums[i];
      }
    }
    System.out.println(Arrays.toString(nums));
    return j + 1;
  }
}
