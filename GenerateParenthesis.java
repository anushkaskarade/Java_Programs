class Solution {
    public List<String> generateParenthesis(int n) {
        
        List<String> result=new ArrayList<>();
        backTrack(result,"",0,0,n);
        return result;
        
    }

    void backTrack(List<String> result,String current,int open,int close,int n)
    {
        if(open==n && close==n)
        {
            result.add(current);
            return;
        }
        if(open<n)
        {
            backTrack(result,current+"(",open+1,close,n);
        }
        if(close<open)
        {
            backTrack(result,current+")",open,close+1,n);
        }
    }
}
