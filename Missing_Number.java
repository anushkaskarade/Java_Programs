class Solution {
    public int missingNumber(int[] nums) {
        
        int n=nums.length;
        int Tsum=0;
        Tsum=n*(n+1)/2;
        int Asum=0;
        
        for(int i=0;i<n;i++)
        {
           Asum=Asum+nums[i];
        }

        int missing_num=Tsum-Asum;
        return missing_num;
        
    }
}
