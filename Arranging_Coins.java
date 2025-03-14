class Solution {
    public int arrangeCoins(int n) {
        
        long start=1;
        long end=n;
        long ans=0;
        long mid=0;
        long coincount=0;

        while(start<=end)
        {
            mid= start + (end-start)/2;
            coincount=(mid*(mid+1))/2;

            if(coincount>n)
            {
                end=mid-1;
            }
            else
            {
                ans=mid;
                start=mid+1; 
            }
        }
        
        return (int)ans;
    }
}
