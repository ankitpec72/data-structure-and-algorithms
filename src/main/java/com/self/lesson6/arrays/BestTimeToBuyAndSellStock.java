package com.self.lesson6.arrays;

public class BestTimeToBuyAndSellStock {

  public static void main(String[] args) {
    System.out.println(maxProfitInMultipleTransactions(new int[] {7, 1, 5, 3, 6, 4}));
  }

  public static int maxProfit(int[] prices) {
    int profit = 0;
    int lowest = Integer.MAX_VALUE;
    for (int i = 0; i < prices.length; i++) {
      if (prices[i] < lowest) {
        lowest = prices[i];
      }
      if (prices[i] - lowest > profit) {
        profit = prices[i] - lowest;
      }
    }
    return profit;
  }

  // {1,2,3,4,5}
  public static int maxProfitInMultipleTransactions(int[] prices) {
    int i = 0;
    int valley = prices[0];
    int peak = prices[0];
    int maxprofit = 0;
    while (i < prices.length - 1) {
      while (i < prices.length - 1 && prices[i] >= prices[i + 1]) {
        i++;
      }
      valley = prices[i];
      while (i < prices.length - 1 && prices[i] <= prices[i + 1]) {
        i++;
      }
      peak = prices[i];
      maxprofit += peak - valley;
    }
    return maxprofit;
  }
}
