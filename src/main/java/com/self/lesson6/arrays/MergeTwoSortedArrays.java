package com.self.lesson6.arrays;

import java.util.Arrays;

public class MergeTwoSortedArrays {

  public static void main(String[] args) {
    int[] arr1 = {1, 5, 10, 11, 20};
    int[] arr2 = {5, 9, 15};
    System.out.println(mergeTwoSortedArrays(arr1, arr2));
  }

  /**
   * 1. traverse arrays with minimum length and compare and insert 2. Comapare leftover array with
   * the last element, either swipe or insert
   */
  private static String mergeTwoSortedArrays(int[] arr1, int[] arr2) {
    //  int[] arr1 = {1, 5, 10, 20};
    //    int[] arr2 = {5, 9, 15};
    int arr[] = new int[arr1.length + arr2.length]; // 7
    int arr1Length = arr1.length; // 4
    int arr2Length = arr2.length; // 3
    int index = 0;
    int firstArrayIndex = 0;
    int secondIndexArray = 0;

    while (firstArrayIndex < arr1Length && secondIndexArray < arr2Length) {
      if (arr1[firstArrayIndex] < arr2[secondIndexArray]) {
        arr[index++] = arr1[firstArrayIndex++]; // firstArrayIndex = 3
      } else {
        arr[index++] = arr2[secondIndexArray++]; // second 2
      }
    }

    while (firstArrayIndex < arr1Length) {
      arr[index++] = arr1[firstArrayIndex++];
    }

    while (secondIndexArray < arr2Length) {
      arr[index++] = arr2[secondIndexArray++];
    }
    return Arrays.toString(arr);
  }
}
