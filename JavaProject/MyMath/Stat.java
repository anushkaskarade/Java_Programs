package MyMath;

public class Stat {

    public float min(float[] numbers) 
    {
        int l=numbers.length;
        float minValue = numbers[0];
        for(int i=0;i<l;i++)
        {
            if(numbers[i]<minValue)
            {
                minValue=numbers[i];
            }
        } 
        return minValue;
    }

    public float max(float[] numbers) 
    {
        int l=numbers.length;
        float maxValue = numbers[0];
        for(int i=0;i<l;i++)
        {
            if(numbers[i]>maxValue)
            {
                maxValue=numbers[i];
            }
        } 
      
        return maxValue;
    }

    public int count(float[] numbers) 
    {
        return numbers.length;
    }

    public float sum(float[] numbers) 
    {
        int l=numbers.length;
        float total = 0;
        for (int i=0;i<l;i++)
        {
            total += numbers[i];
        }
        return total;
    }

    public float average(float[] numbers) 
    {
        return sum(numbers) / count(numbers);
    }
}

