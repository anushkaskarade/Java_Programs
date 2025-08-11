class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        
        int n=grid.length*grid.length;
        int count[]=new int [n+1];
        int result[]=new int[2];

        for(int i=0; i<grid.length; i++)
        {
            for(int j=0; j<grid.length; j++)
            {
                int num=grid[i][j]; 
                count[num]=count[num]+1;
            }
        }

        for(int i=1; i<=n; i++)
        {
            if(count[i]>1)
            {
                result[0]=i;
            }
            else if(count[i]==0)
            {
                result[1]=i;
            }
        }
        return result;
    }
}
