import java.util.*;

class hello
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the date:");
        int date=sc.nextInt();
        System.out.println("Enter the month:");
        int month=sc.nextInt();
        System.out.println("Enter the year:");
        int year=sc.nextInt();
        
          int day=0;
            
            if(month==1)
            {
                day=date;
            }
            else if(month==2)
            {
                day=31+date;
            }
            else if(month==3)
            {
                day=31+28+date;
            }
            else if(month==4)
            {
                day=31+28+31+date;
            }
            else if(month==5)
            {
                day=90+30+date;
            }
            else if(month==6)
            {
                day=120+31+date;
            }
            else if(month==7)
            {
                day=151+30+date;
            }
            else if(month==8)
            {
                day=181+31+date;
            }
            else if(month==9)
            {
                day=212+30+date;
            }
            else if(month==10)
            {
                day=242+31+date;
            }
            else if(month==11)
            {
                day=273+30+date;
            }
            else if(month==12)
            {
                day=303+31+date;
            }
            else{
                System.out.println("Invalid");
            }
            if(year%4==0)
            {
                System.out.println("This is a leap year");
                day=day+1;
            }
            System.out.print("The date is ");
            System.out.print(day);
            System.out.print(" day in year");
        }
    }
