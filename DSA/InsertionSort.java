import java.util.*;

public class InsertionSort {
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=0;
        System.out.println("Enter the size of an array:");
        n=sc.nextInt();
        int[] arr=new int [n];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
    
    
    for(int i=0;i<arr.length;i++)
    {
       int current=arr[i];
       int j=i-1;
       while(j>=0 && current<arr[j])
       {
         arr[j+1]=arr[j];
         j--;
       }

       arr[j+1]=current;
    }
    

    System.out.println("The sorted array is:");
    for(int i=0;i<arr.length;i++)
    {
       System.out.println(arr[i]);

    }
    }

}
