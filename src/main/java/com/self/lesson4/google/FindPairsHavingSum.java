package com.self.lesson4.google;

import static com.self.util.Util.print;

import java.util.HashSet;
import java.util.Set;

public class FindPairsHavingSum {

  public static void main(String[] args) {
    FindPairsHavingSum findPairsHavingSum = new FindPairsHavingSum();
    int[] arr = {1, 4, 5, 6, 7, 9, 11, 12, 15};

    print("found " + findPairsHavingSum.hasPairWithSumUnordered(arr, 16));
    print("found " + findPairsHavingSum.hasPairWithSumOrdered(arr, 5));
  }

  /**
   * loop once and create a list with compliment look for the compliement number, if found, return
   * true otherwise, false
   */
  private boolean hasPairWithSumUnordered(int[] arr, int sum) {

    if (arr == null) {
      return false;
    }

    Set<Integer> list = new HashSet<>();
    for (int value : arr) {
      if (list.contains(value)) {
        return true;
      }
      list.add(sum - value);
    }
    return false;
  }

  private boolean hasPairWithSumOrdered(int[] arr, int sum) {

    if (arr == null) {
      return false;
    }
    // 1,4,5,6,7,9,11,12,15
    // sum = 7

    int length = arr.length;
    for (int i = 0, j = length - 1; i < j; ) {
      int foundSum = arr[i] + arr[j];
      if (foundSum == sum) {
        return true;
      } else if (foundSum > sum) {
        print("descresed j");
        j--;
      } else {
        print("increased i");
        i++;
      }
    }
    return false;
  }
}
