import java.util.*;
public class Fact {


    public static int factorial(int num)
    {
        int fact=1;
        if(num==0  || num==1)
        {
            return 1;
        }
        for(int i=num;i>0;i--)
        {
           fact=fact*(i);
        }
        return fact;
    }

    public static boolean isPrime(int num)
    {

        if(num<=1)
        {
            System.out.println("The number is not prime!");
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++)
        {
            System.out.println("The number is prime!");
            return false;
        }
        return true;
    }

    public static void printPositiveNegative(int num)
    {
        if(num<0)
        {
            System.out.println("The number is negative!");
        }
        else
        {
            System.out.println("The number is positive!");
        }

    }
    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        int n=0;
        System.out.println("Enter the number:");
        n=sc.nextInt();
        Fact f=new Fact();
        f.printPositiveNegative(n);
        f.isPrime(n);
        int fact=f.factorial(n);
        System.out.println("The factorial is:"+fact);
    }


    
}
