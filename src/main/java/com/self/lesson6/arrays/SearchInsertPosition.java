package com.self.lesson6.arrays;

public class SearchInsertPosition {

  /**
   * Given a sorted array and a target value, return the index if the target is found. If not,
   * return the index where it would be if it were inserted in order. You may assume no duplicates
   * in the array. Example 1:
   *
   * <p>Input: [1,3,5,6], 5 Output: 2
   */
  public static void main(String[] args) {
    System.out.println(searchInsert(new int[] {1, 3, 5, 6}, 7));
  }

  public static int searchInsert(int[] nums, int target) {
    //        if (nums.length == 0) return 0;
    int i = 0;
    for (; i < nums.length; i++) {
      if (target == nums[i] || nums[i] >= target) {
        return i;
      }
    }
    return i == nums.length ? i : 0;
  }
}
