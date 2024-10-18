class Solution {
    public int reverse(int x) {
        
        int r;
        int rev=0;
        int num=x;
       
        while(x!=0)
        {
         r=x%10;
         if(rev>Integer.MAX_VALUE/10 || (rev==Integer.MAX_VALUE && r>7) )
         {
            return 0;
         }

         if(rev<Integer.MIN_VALUE/10 || (rev==Integer.MIN_VALUE && r<-8))
         {
            return 0;
         }
         rev=rev*10+r;
         x=x/10;

        }

    return rev; 
        }
}


class Reverse{

    public static void main(String [] args)
    {
        int n=-5624,result=0;
        Solution s=new Solution();
        result=s.reverse(n);
        System.out.println("The reverse number is:"+result);
    }
}