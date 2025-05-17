class Solution {
    public int maxProfit(int[] prices) {
    int left = 0; // Buy
    int right = 1; // Sell
    int maxProfit = 0;
    while(right<prices.length)
    {
        if(prices[left]<prices[right])
        {
            int profit=prices[right]-prices[left];
            maxProfit=Math.max(maxProfit,profit);
        }
        else
        {
            left=right;
        }
            right=right+1;
        
    }
return maxProfit;
   
    }

}
