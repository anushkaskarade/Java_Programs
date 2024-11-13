class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> ans=new ArrayList<>();
        comb(ans,new ArrayList<>(),nums);
        return ans;
    }

    private void comb(List<List<Integer>> ans,List<Integer>subans,int [] nums)
    {
        if(subans.size()==nums.length)
        {
            ans.add(new ArrayList<>(subans));
        }
        for(int i=0;i<nums.length;i++)
        {
            if(subans.contains(nums[i]))
            {
                continue;
            }
            subans.add(nums[i]);
            comb(ans,subans,nums);
            subans.remove(subans.size()-1);
        }
    }
}