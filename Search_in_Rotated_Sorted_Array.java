class Solution {
    public int search(int[] nums, int target) {
        
        int first=0;
        int last=nums.length-1;
        int mid=0;

        while(first<=last)
        {
            mid=first+(last-first)/2;
            
            if(nums[mid]==target)
            {
                return mid;
            }

            if( nums[first]<=nums[mid])
            {
               if(nums[first]<=target && target<nums[mid])
               {
                  last=mid-1;
               }
               else
               {
                   first=mid+1;
               }
            }   

            else
            {
                if(target>=nums[mid] && target<=nums[last])
               {
                  first=mid+1;
               }
               else
               {
                  last=mid-1;
               }  
              x
            }
        }
        return -1;

    }
    
}
