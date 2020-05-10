package com.self.lesson6.arrays;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Map;

public class TwoSum {

  public static void main(String[] args) {
    int[] arr1 = {3, 2, 4};
    System.out.println(Arrays.toString(twoSum(arr1, 6)));
  }

  public static int[] twoSum(int[] nums, int target) {
    final Map<Integer, Integer> map = new Hashtable<>();
    for (int i = 0; i < nums.length; ) { // 3, 4, 4
      final Integer valueFromMap = map.get(nums[i]);
      if (valueFromMap != null) {
        return new int[] {valueFromMap, i};
      }
      map.put(target - nums[i], i++); // 3,4,2
    }
    throw new RuntimeException("Invalid request");
  }
}
