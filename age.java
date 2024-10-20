import java.util.Scanner;
public class age {    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter birth date of the person:");
        System.out.println("Enter the date:");
        int date1=sc.nextInt();
        System.out.println("Enter the month:");
        int month1=sc.nextInt();
        System.out.println("Enter the year:");
        int year1=sc.nextInt();

        System.out.println("Enter today's date:");
        System.out.println("Enter the date2:");
        int date2=sc.nextInt();
        System.out.println("Enter the month2:");
        int month2=sc.nextInt();
        System.out.println("Enter the year:");
        int year2=sc.nextInt();

        int y=year2-year1;
        if(year1==2023)
        {
           y=0;
        }
        int m=0;
        if(month1>month2)
        {
            if(month1==10)
            {
               m=10;
            }
            else if(month1==11)
            {
                m=9;
            }
            else if(month1==12)
            {
                m=8;
            }
        }
        else if(month1==month2)
        {
            if(date1<date2)
            {
                m=11;
            }
            else
            {
                m=12;
            }
        }
        else
        {
             m=month2-month1;
             m--;
        }

        int days=0;
        days=30-date1+(date2-1);
       
        if((month1==1) || (month1==3) || (month1==5) || (month1==7) || (month1==8) || (month1==10) || (month1==12))
        {
            days=days+1;
        }
        while(days>=30)
        {
            m++;
            if((month1==1) || (month1==3) || (month1==5) || (month1==7) || (month1==8) || (month1==10) || (month1==12))
            {
                days=days-31;
            }
            else{
                days=days-30;
            }
        }
        if((date1==date2) && (month1==month2) && (year1==year2))
        {
            days=0;
            m=12;
        }
        System.out.print("Your age is "+y);
        System.out.print(" years "+m);
        System.out.print(" months " +days);
        System.out.println(" days");
    }
}
