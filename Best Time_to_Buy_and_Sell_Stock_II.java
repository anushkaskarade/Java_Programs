class Solution {
    public int maxProfit(int[] prices) {

        int i=0;
        int profit=0;

        for(i=0; i<prices.length-1; i++)
        {
            if(prices[i]<prices[i+1])
            {
                profit=profit+prices[i+1]-prices[i];
            }
        }
        
        return profit;
    }
}
