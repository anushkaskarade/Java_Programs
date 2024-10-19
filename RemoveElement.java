class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0,k=0;
        int n=nums.length;
        for(i=0;i<n;i++)
        {
          if(nums[i]!=val)
          {
            nums[k]=nums[i];
             k++;
          }
        }

        return k;
    }
}

class RemoveElement{

    public static void main(String [] args)
    {
        int [] nums={0,1,2,2,3,0,4,2};
        int v=2;
        Solution s=new Solution();
        int l=s.removeElement(nums,v);
        System.out.println("The array of elements which is noy equal to value:");
        for(int i=0;i<l;i++)
        {
            System.out.println(nums[i]);
        }
        
    }
}