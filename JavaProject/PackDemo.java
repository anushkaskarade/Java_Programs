import MyMath.Arithmetic;
import MyMath.Stat;
import MyMath.Trig;

public class PackDemo {
    public static void main(String[] args) {
    
        Trig trig = new Trig(30); 
        System.out.println("Sine of 30 degrees: " + trig.getSine());
        System.out.println("Cosine of 30 degrees: " + trig.getCosine());

    
        Arithmetic arithmetic = new Arithmetic();
        float a = 10, b = 5;
        System.out.println("Addition: " + arithmetic.add(a, b));

    
        Stat stat = new Stat();
        float[] numbers = {2, 4, 6, 8, 10};
        System.out.println("Min: " + stat.min(numbers));
        System.out.println("Max: " + stat.max(numbers));
    }
}

