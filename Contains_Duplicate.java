class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        int i=0;
        Arrays.sort(nums);
        int n=nums.length;

        
       for( i=1;i<n;i++)
       {
            if(nums[i]==nums[i-1])
            {
                return true;
            }
       }
       return false;
    }
}
