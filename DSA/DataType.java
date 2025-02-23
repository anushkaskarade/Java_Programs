
import java.util.*;
public class DataType{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        double a=0.0;
        double b=0.0;
        boolean val1;
        boolean val2;
        System.out.println("Enter First double values:");
        if(sc.hasNextDouble() && !sc.hasNextInt())
        {
            a=sc.nextDouble();
            val1=true;

        }
        else
        {
            val1=false;
            System.out.println("Entered value is not double value");
            
        }
        System.out.println();
        System.out.println("Enter Second double values:");
       
        if(sc.hasNextDouble() && !sc.hasNextInt())
        {
            b=sc.nextDouble();
            val2=true;
        }
        else
        {
            val2=false;
            System.out.println("Entered value is not double value");
        }

        if(val1 && val2)
        {
            double avg=(a+b)/2;
            System.out.println("The avg is:"+avg);
        }







    }
}
