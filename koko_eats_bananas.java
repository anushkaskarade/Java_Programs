class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int l=1;
        int r=Arrays.stream(piles).max().getAsInt();

        while(l<r)
        {
            int mid=l+(r-l)/2;

            if(canitAll(piles,h,mid))
            {
                r=mid;
            }
            else
            {
                l=mid+1;
            }
        }

        return l;
    }

    boolean canitAll(int []piles,int h,int mid)
    {
        int actualhours=0;
        for(int i : piles)
        {
            actualhours+=i/mid;
            if(i%mid!=0)
            {
                actualhours++;
            }
        }

        return actualhours<=h;
    }
}
