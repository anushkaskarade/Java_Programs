import java.util.*;
import java.util.Scanner;

class Solution {
    public int searchInsert(int[] nums, int target) {
        
       int i=0;
       int l=nums.length;
       for(i=0;i<l;i++)
       {
          if(target==nums[i])
          {
            return i;
          }
          else
          {
            if(nums[i]>target)
            {
                return i;
            }
          }
       }  

     return i;  

    } 
}

class SearchInsertPosition{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Solution s=new Solution();
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target:");
        int t=sc.nextInt(); 
        s.searchInsert(arr, t);
    }
}
