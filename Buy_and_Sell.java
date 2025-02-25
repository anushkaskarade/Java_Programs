class Solution {
    public int maxProfit(int[] prices) {
        
        int lsf=Integer.MAX_VALUE;
        int op=0;
        int p=0;

        for(int i=0;i<prices.length;i++)
        {
           if(prices[i]<lsf)
           {
            lsf=prices[i];
           }
           p=prices[i]-lsf;
           if(op<p)
           {
            op=p;
           }
        }
    return op;
    }
}
