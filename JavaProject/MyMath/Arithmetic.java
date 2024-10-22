package MyMath;

public class Arithmetic {
    
    public float add(float a,float b)
    {
        return a+b;
    }

    public float sub(float a,float b)
    {
        return a-b;
    }

    public float mul(float a,float b)
    {
        return a*b;
    }

    public float div(float a,float b)
    {
        if(b==0)
        {
            System.out.println("Cannot divide by zero:");
            return 0;
        }
        else
        {
            return a/b;
        }
        
    }
    


}
