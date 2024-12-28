class Solution {
    public boolean isHappy(int n) {
        
        int sum=0;
        int r=0;
        int c=0;

        while(n!=0)
        { 
            sum=0;
            while(n>0)
            {
            r=n%10;
            sum=sum+(r*r);
            n=n/10;
            }
            if(c>10)
            {
                return sum==1;
            }  
            n=sum;   
            c++;      
        }
        return sum==1;

    }
}
