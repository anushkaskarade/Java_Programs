import java.util.*;

public class date {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter date:");
        int date=sc.nextInt();
        System.out.println("Enter month:");
        int month=sc.nextInt();
        System.out.println("Enter year:");
        int year=sc.nextInt();
        int days=0;

        if(year==2024 || year>2024)
        {
            if(month==1)
            {
                days=date;
            }
            else if(month==2)
            {
                days=31+date;
            }
            else if(month==3)
            {
                days=59+date;
            }
            else if(month==4)
            {
                days=90+date;
            }
            else if(month==5)
            {
                days=120+date;
            }
            else if(month==6)
            {
                days=151+date;
            }
            else if(month==7)
            {
                days=181+date;
            }
            else if(month==8)
            {
                days=212+date;
            }
            else if(month==9)
            {
                days=243+date;
            }
            else if(month==10)
            {
                days=273+date;
            } 
            else if(month==11)
            {
                days=304+date;
            } 
            else if(month==12)
            {
                days=334+date;
            }
            else{
                System.out.println("Invalid");
            }
           
            int c=0;
            if(year==2024 || year>2024 )
            {
                  for(int i=2024;i<=year;i++)
                    {
                        if(i%4==0)
                        {
                            c=c+1;

                        }
                        days=days+1;
                    }                    
                    days=days+c-1;                    
                    if(year%4==0)  
                    {
                     days=days-1;}   
                }
            }

        if (days%7==0)
        {
            System.out.println("The day is Sunday!");
        }
        else if(days%7==1 )
        {
             System.out.println("The day is Monday!");
        }
        else if(days%7==2)
        {
            System.out.println("The day is Tuesday!");
        }
        else if(days%7==3)
        {
            System.out.println("The day is Wednesday!");
        }
        else if(days%7==4)
        {
            System.out.println("The day is Thursday!");
        }
        else if(days%7==5) 
        {
            System.out.println("The day is Friday!");
        }
        else if (days%7==6)
        {
            System.out.println("The day is Saturday!");
        }       
    } 
}