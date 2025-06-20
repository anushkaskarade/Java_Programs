class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int max=Integer.MIN_VALUE;
        int count=0;
        int i=0;
        int prev=nums[0];

        if(prev==0)
        {
            max=0;
        }

        while(i<nums.length)
        {
            
            if(nums[i]==1)
            {
                count++;
                if(count>max)
                {
                    max=count;

                }
            }
            else
            {
                count=0;
            }
            i++;
            
        }

        return max;
    }
}
