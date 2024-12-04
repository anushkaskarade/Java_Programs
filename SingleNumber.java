class Solution {
    public int singleNumber(int[] nums) {
        
        int l=nums.length;
        int i=0;
        
        if(l==1)
        {
            return nums[0];
        }
        
        while(i<l)
        {
            int j=nums[i];
            boolean IsDuplicate=false;
            for(int k=0;k<l;k++)
            {
                if(k!=i && j==nums[k])
                {
                    IsDuplicate=true;
                   break;
                }

            }
            if(!IsDuplicate)
            {
               return j;
            }
            i++;
        }
        return 0;
    }
    
    
}
