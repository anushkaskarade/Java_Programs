class Solution {
    public int strStr(String haystack, String needle) {
        
        int l1=haystack.length();
        int l2=needle.length();
        if(l1<l2)
        {
            return -1;
        }
        if(l2==0)
        {
            return -1;
        }
        int i=0;
        for(i=0;i<=l1-l2;i++)
        {
            int j;
            for(j=0;j<l2;j++)
            {
            if(haystack.charAt(i+j)!=needle.charAt(j))
            {
               break;
            }
            }

        if(j==l2)
        {
            return i;
        }
       
        }
       
        return -1;
    }
}