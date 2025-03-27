
import java.util.Scanner;

public class Recursion {
    
    Scanner sc=new Scanner(System.in);
    

    public static int Sum_Numbers(int n)
    {
       if(n==0)
       {
        return 0;
       }
       return n+Sum_Numbers(n-1);
    }

    public static void main(String[] args) 
    {   
        
        Scanner sc=new Scanner(System.in);
        int n=0;
        System.out.println("Enter the number:");
        n=sc.nextInt();
        int value=0;
        value=Sum_Numbers(n);
        System.out.println("The sum of numbers is:"+value);


        
    }



}
