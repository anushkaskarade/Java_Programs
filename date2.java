import java.util.*;

class date2{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int date;
        int month;
        int year,i;
        int days=0;
        System.out.println("Enter the date:");
        date=sc.nextInt();
        System.out.println("Enter the month:");
        month=sc.nextInt();
        System.out.println("Enter the year:");
        year=sc.nextInt();

        if(year<2024)
        { 
            if(month==1)
            {
                days=(31-date)+334;
            }
            else if(month==2)
            {
                days=(28-date)+306;
            }
            else if(month==3)
            {
                days=(31-date)+275;
            }
            else if(month==4)
            {
                days=(30-date)+245;
            }
            else if(month==5)
            {
                days=(31-date)+214;
            }
            else if(month==6)
            {
                days=(30-date)+184;
            }
            else if(month==7)
            {
                days=(31-date)+153;
            }
            else if(month==8)
            {
                days=(31-date)+122;
            }
            else if(month==9)
            {
                days=(30-date)+92;
            }
            else if(month==10)
            {
                days=(31-date)+61;
            } 
            else if(month==11)
            {
                days=(30-date)+31;
            } 
            else if(month==12)
            {
                days=(31-date);
            }
            else{
                System.out.println("Invalid");
            }  
        }
        
        for(i=year;i<2023;i++)
        {         
          days=days+364;
          days=days-1;
          if(i%4==0)
          {
            days=days-1;
          }
        }
        System.out.println(days);
 
        int ch=days%7;
        System.out.println(ch);

        switch (ch) {
            case 0 :System.out.println("The day is Sunday!");
                      break;
            case 1 :System.out.println("The day is Monday!");
                       break;
            case 2 :System.out.println("The day is Tuesday!");
                       break;
            case 3 :System.out.println("The day is Wednesday!");
                       break;
            case 4 :System.out.println("The day is Thursday!");
                       break;
            case 5 :System.out.println("The day is Friday!");
                       break;
            case 6 :System.out.println("The day is Saturday!");
                    break;
            default:System.out.println("Invalid!");
                
        }

           
    } 
}
    