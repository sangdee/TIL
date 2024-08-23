package algorithm.leetcode;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int result = 0;

        for (int i = 0; i < prices.length; i++) {
            if (min >= prices[i]) {
                min = prices[i];
            } else {
                if (prices[i] - min > result) {
                    result = prices[i] - min;
                }
            }
        }
        return result;
    }
}
