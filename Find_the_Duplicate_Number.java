class Solution {
    public int findDuplicate(int[] nums) {
        
        Set<Integer> set=new HashSet<>();

        for(int i=0; i<nums.length-1; i++)
        {
            if(!set.contains(nums[i]))
            {
                set.add(nums[i]);
            }
            else
            {
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
}
