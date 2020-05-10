package com.self.lesson6.arrays;

public class RemoveElement {

  /**
   * Given an array nums and a value val, remove all instances of that value in-place and return the
   * new length.
   *
   * <p>Do not allocate extra space for another array, you must do this by modifying the input array
   * in-place with O(1) extra memory.
   *
   * <p>The order of elements can be changed. It doesn't matter what you leave beyond the new
   * length.
   *
   * <p>Example 1:
   *
   * <p>Given nums = [3,2,2,3], val = 3,
   *
   * <p>Your function should return length = 2, with the first two elements of nums being 2.
   *
   * <p>It doesn't matter what you leave beyond the returned length
   */
  public static void main(String[] args) {
    System.out.println(removeElement(new int[] {1, 2, 3, 2, 2, 3}, 2));
  }

  public static int removeElement(int[] nums, int val) {
    if (nums.length == 0) return 0;
    int i = 0;
    for (int j = 0; j < nums.length; j++) {
      if (nums[j] != val) {
        nums[i] = nums[j];
        i++;
      }
    }
    return i;
  }
}
