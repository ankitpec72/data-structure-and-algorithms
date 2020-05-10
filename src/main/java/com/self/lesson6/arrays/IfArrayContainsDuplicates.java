package com.self.lesson6.arrays;

import java.util.*;

public class IfArrayContainsDuplicates {

  public static void main(String[] args) {
    System.out.printf("" + containsDuplicate(new int[] {1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
  }

  public static boolean containsDuplicate(int[] nums) {
    if (nums.length == 0 || nums.length == 1) {
      return false;
    }
    final Set<Integer> set = new HashSet<>(nums.length);
    for (int value : nums) {
      if (!set.add(value)) {
        return true;
      }
    }
    return false;
  }
}
