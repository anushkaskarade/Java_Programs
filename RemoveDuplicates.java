
class Solution {
    public int removeDuplicates(int[] nums) {
        
        int k=1;
        int l=nums.length;
        for(int i=1;i<l;i++)
        {
            if(nums[i]!=nums[i-1])
            {
                nums[k]=nums[i];
                k++;
            }
           
        }

        return k;
    }
}

class RemoveDuplicates{

    public static void main(String [] args)
    {
        int [] nums={1,1,2,3,3};
        Solution s=new Solution();
       int result= s.removeDuplicates(nums);
        System.out.println("The no. of duplicate elements:"+result);
        System.out.println("The array is:");
        for(int i=0;i<result;i++)
        {
        System.out.println(""+nums[i]);
        }
    }
}

