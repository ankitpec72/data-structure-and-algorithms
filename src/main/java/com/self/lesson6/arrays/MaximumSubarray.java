package com.self.lesson6.arrays;

public class MaximumSubarray {

  public static void main(String[] args) {
    int[] arr = new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    int[] arr1 = new int[] {-2, -1};
    int[] arr2 = new int[] {0};
    System.out.println(maxSubArray(arr));
    System.out.println(maxSubArray(arr1));
    System.out.println(maxSubArray(arr2));
    System.out.println(checkWithOther(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    System.out.println(my2ndSolution(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}));
  }

  public static int maxSubArray(int[] nums) {
    if (nums.length == 0) return 0;
    if (nums.length == 1) return nums[0];

    int maxSum = Integer.MIN_VALUE;
    int previousSum = 0;
    for (int i = 0; i < nums.length; i++) { //
      int sum = previousSum + nums[i]; // 1
      if (sum < 0) {
        previousSum = 0;
        maxSum = Math.max(maxSum, sum);
        continue;
      }
      previousSum += nums[i]; // 6
      maxSum = Math.max(maxSum, previousSum);
    }
    return maxSum;
  }

  private static int checkWithOther(int nums[]) {
    int ans = Integer.MIN_VALUE, sum = 0;
    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
      sum = Math.max(nums[i], sum);
      ans = Math.max(sum, ans);
    }
    return ans;
  }

  private static int my2ndSolution(int nums[]) {
    int ans = Integer.MIN_VALUE, sum = 0;
    for (int i = 0; i < nums.length; i++) { // -2, 1, -3, 4, -1, 2, 1, -5, 4
      sum += nums[i]; //
      sum = Math.max(nums[i], sum);
      /** its resetting here */
      ans = Math.max(sum, ans);
    }
    return ans;
  }
}
