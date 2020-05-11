package com.self.lesson6.arrays;

import org.junit.Assert;

public class CanPlaceFlowers {

  /**
   * Suppose you have a long flowerbed in which some of the plots are planted and some are not.
   * However, flowers cannot be planted in adjacent plots - they would compete for water and both
   * would die.
   *
   * <p>Given a flowerbed (represented as an array containing 0 and 1, where 0 means empty and 1
   * means not empty), and a number n, return if n new flowers can be planted in it without
   * violating the no-adjacent-flowers rule.
   *
   * <p>Example 1: Input: flowerbed = [1,0,0,0,1], n = 1 Output: True
   */
  public static void main(String[] args) {
    Assert.assertEquals(true, canPlaceFlowers(new int[] {1, 0, 0, 0, 1}, 1));
    Assert.assertEquals(false, canPlaceFlowers(new int[] {1, 0, 0, 0, 1}, 2));
    Assert.assertEquals(false, canPlaceFlowers(new int[] {1, 0, 0, 1, 0}, 1));
    Assert.assertEquals(false, canPlaceFlowers(new int[] {}, 0));
    Assert.assertEquals(true, canPlaceFlowers(new int[] {0}, 1));
    Assert.assertEquals(false, canPlaceFlowers(new int[] {1}, 1));
    Assert.assertEquals(true, canPlaceFlowers(new int[] {0, 0, 1, 0}, 1));
    Assert.assertEquals(true, canPlaceFlowers(new int[] {1, 0, 1, 0, 0}, 1));
    Assert.assertEquals(true, canPlaceFlowers(new int[] {1, 0, 1, 0, 1}, 0));
  }

  /**
   * Runtime: 1 ms, faster than 93.97% of Java online submissions for Can Place Flowers. Memory
   * Usage: 41.3 MB, less than 7.14% of Java online submissions for Can Place Flowers.
   */
  public static boolean canPlaceFlowers(int[] flowerbed, int n) {

    if (flowerbed.length == 0) return false;
    if (flowerbed.length == 1 && n == 1 && flowerbed[0] == 0) return true;
    if (n == 0) return true;

    for (int i = 0; i < flowerbed.length; i++) {
      if (flowerbed[i] == 0
          && ((i != flowerbed.length - 1 && flowerbed[i + 1] == 0)
              || (i == flowerbed.length - 1 && flowerbed[i] == 0))
          && (i == 0 || flowerbed[i - 1] == 0)) {
        flowerbed[i] = 1;
        n -= 1;
        if (n == 0) {
          return true;
        }
      }
    }
    return false;
  }
}
