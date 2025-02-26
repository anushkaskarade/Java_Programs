import java.util.Scanner;

public class Fact_Recursion {
   
    public static int Fact(int n)
    {
        int factorial=n;
    
    if(n==1 || n==0)
    {
        return 1;
    }

    factorial=factorial*Fact(n-1);
    return factorial;

    }
    

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=0;
        System.out.println(" Enter the number:");
        n=sc.nextInt();
        int value=Fact(n);
        System.out.println("The factorial is:"+value);
        


    }
}

