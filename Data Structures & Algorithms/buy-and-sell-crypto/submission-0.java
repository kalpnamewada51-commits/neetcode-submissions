class Solution {
    public int maxProfit(int[] prices) {
        
        int buy=prices[0];
        int maxProfit =0;
        int profit=0;
        for(int i =1;i<prices.length;i++)
        {
            int price = prices[i];
            if(price<buy)
            {
                buy =price;
            }
            else
            profit = price-buy;
            maxProfit = Math.max(maxProfit,profit);
        }
        return maxProfit;
        
    }
}
