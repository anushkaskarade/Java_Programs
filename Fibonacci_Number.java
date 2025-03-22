class Solution {
    public int fib(int n) {
        
        int fibo=0;
        if(n==0)
        {
            fibo=fibo+0;
        }
        else if(n==1)
        {
            fibo=fibo+1;
        }
        else
        {
            fibo=fibo+fib(n-1)+fib(n-2);
            
        }
        return fibo;
        
        
    }
}
