class Solution {
    public int maxProfit(int[] prices) {
        int Max_Profit = 0;
        int Min_Buy = prices[0];
        int Max_Sell = 0;

        for(int i = 1; i < prices.length; i++){

            Max_Profit = Math.max(Max_Profit, (prices[i] - Min_Buy));
            Min_Buy = Math.min(Min_Buy, prices[i]);

        }
        return Max_Profit;
    }
}