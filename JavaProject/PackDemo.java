import MyMath.Arithmetic;
import MyMath.Stat;
import MyMath.Trig;
import java.util.Scanner;

public class PackDemo {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        float angle=0;
        System.out.println("Enter the angle in degree:");
        angle=sc.nextFloat();

        Trig t = new Trig(angle); 
        System.out.println("Sine of angle: " + t.getSine());
        System.out.println("Cosine of angle: " + t.getCosine());
        System.out.println("Tangent of angle: " + t.getTangent());
        System.out.println("Cosecant of angle: " + t.getCosecant());
        System.out.println("Secant of angle: " + t.getSecant());
        System.out.println("Cotangent of angle: " + t.getCotangent());

    
        Arithmetic ar = new Arithmetic();
        float a = 0, b = 0;
        System.out.println("Enter two numbers for arithmetic calculations:");
        a=sc.nextFloat();
        b=sc.nextFloat();
        System.out.println("Addition: " + ar.add(a, b));
        System.out.println("Subtraction: " + ar.sub(a, b));
        System.out.println("Multiplication: " + ar.mul(a, b));
        System.out.println("Division: " + ar.div(a, b));

    
        Stat stat = new Stat();
        System.out.println("Enter the size of array of elements:");
        int s=sc.nextInt();
        float[] numbers = new float[s];
        System.out.println("Enter the elements in an array:");
        for(int i=0;i<s;i++)
        {
            numbers[i]=sc.nextFloat();
        }
        System.out.println("Min: " + stat.min(numbers));
        System.out.println("Max: " + stat.max(numbers));
        System.out.println("Sum: " + stat.sum(numbers));
        System.out.println("Average: " + stat.average(numbers));
    }
}

