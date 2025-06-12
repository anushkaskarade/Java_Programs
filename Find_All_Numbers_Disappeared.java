class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        HashSet<Integer> set= new HashSet<>();
        List<Integer> ans= new ArrayList<>();
        int i=0;

        for(i=0;i<nums.length; i++)
        {
            int curr=nums[i];
            set.add(curr);
        }

        for(i=1;i<=nums.length;i++)
        {
            if(!set.contains(i))
            {
                ans.add(i);
            }
        }

        return ans;
    }
}
