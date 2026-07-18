class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int sell;
        int profit = 0;
        for(int i=0;i<prices.length-1;i++){
            sell = prices[i+1];
            profit = Math.max(profit , sell - buy);
            buy = Math.min(buy,prices[i+1]);
            
        }
        return profit;

    }
}
