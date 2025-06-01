
import java.util.Scanner;

public class Recursion2 {
    
    Scanner sc=new Scanner(System.in);

    public static int Fibonacci(int n)
    {
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }
        return Fibonacci(n-1)+Fibonacci(n-2);
    }

    public static void main(String[] args) 
    {

        Scanner sc=new Scanner(System.in);
        int n=0;
        System.out.println("Enter the  number:");
        n=sc.nextInt();
        
        System.out.println("The fibonacci series is:");
        for(int i=0;i<n;i++)
        {
            System.out.println(""+Fibonacci(i));
        }
        
    }
}
