package com.self.lesson6.arrays;

import org.junit.Assert;

public class ReshapeTheMatrix {
  /**
   * You're given a matrix represented by a two-dimensional array, and two positive integers r and c
   * representing the row number and column number of the wanted reshaped matrix, respectively.
   *
   * <p>The reshaped matrix need to be filled with all the elements of the original matrix in the
   * same row-traversing order as they were.
   *
   * <p>If the 'reshape' operation with given parameters is possible and legal, output the new
   * reshaped matrix; Otherwise, output the original matrix.
   *
   * <p>Example 1: Input: nums = [[1,2], [3,4]] r = 1, c = 4 Output: [[1,2,3,4]]
   */
  public static void main(String[] args) {
    Assert.assertArrayEquals(
        new int[][] {new int[] {1, 2, 3, 4}}, matrixReshape(new int[][] {{1, 2}, {3, 4}}, 1, 4));
    Assert.assertArrayEquals(
        new int[][] {{1, 2}, {3, 4}}, matrixReshape(new int[][] {{1, 2}, {3, 4}}, 2, 4));
    Assert.assertArrayEquals(
        new int[][] {new int[] {1}, {2}, {3}, {4}},
        matrixReshape(new int[][] {{1, 2}, {3, 4}}, 4, 1));
    Assert.assertArrayEquals(new int[][] {}, matrixReshape(new int[][] {}, 4, 1));
    Assert.assertArrayEquals(
        new int[][] {{0}, {1}}, matrixReshape(new int[][] {{0}, {1}}, 1, 1)); // 2 rows column 1
    Assert.assertArrayEquals(
        new int[][] {new int[] {1, 2}, {3, 4}}, matrixReshape(new int[][] {{1, 2}, {3, 4}}, 2, 2));
  }

  /**
   * Runtime: 1 ms, faster than 100.00% of Java online submissions for Reshape the Matrix. Memory
   * Usage: 40.5 MB, less than 55.56% of Java online submissions for Reshape the Matrix.
   */
  public static int[][] matrixReshape(int[][] nums, int r, int c) {
    if (nums.length == 0) return nums;
    if (nums[0].length * nums.length != r * c) return nums;
    int[][] result = new int[r][c];
    int row = 0;
    int column = 0;

    int i = 0; // 2
    int j = 0; // 2

    while (i < nums.length && j < nums[i].length) {
      result[row][column] = nums[i][j];
      j++;
      column++;

      if (j == nums[i].length) {
        j = 0;
        i++;
      }

      if (column == c) {
        row++;
        column = 0;
      }
    }
    return result;
  }
}
