class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int l1=nums1.length;
        int l2=nums2.length;
        int l3=l1+l2;
        int arr[]=new int[l3];
        int i=0;
        for(i=0;i<l1;i++)
        {
           arr[i]=nums1[i];
        }
        int j=0;
        for( j=0;j<l2;j++)
        {
            arr[l1+j]=nums2[j];    
        }
          double median=0;
        
          for (i = 0; i < l3 - 1; i++) {
            for ( j = 0; j < l3 - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
       
        int mid=0;
        if(l3%2==0)
        {
            mid=l3/2;
            median=(arr[mid]+arr[mid-1])/2.0;
        }
        else
        {
            mid=l3/2;
            median=arr[mid];
        }
        return median;
        
    }
}
