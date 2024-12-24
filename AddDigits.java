class Solution {

    public int addDigits(int num) 
    {
        if(num==0)
        {
            return 0;
        }
        int r,sum=0;
        
        while(num>=10)
        {
            sum=0;
            while(num>0)
            {
            r=num%10;
            num=num/10;
            sum+=r;
            }
             num=sum;
        }
       

        return num;
    }
}
