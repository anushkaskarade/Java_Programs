
import java.util.Scanner;

   class Person 
   {
    String name; 
    String address;
    int date;
    int month;
    int year;
    double height=0;
    double weight=0;

    void GetInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: "); 
        name = sc.nextLine();
        System.out.println("Enter your Address: "); 
        address = sc.nextLine();
        System.out.println("Enter your height: "); 
        height = sc.nextDouble();
        System.out.println("Enter your weight: "); 
        weight = sc.nextDouble();
     }
    
    void CalculateAge()
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

class Student extends Person{
   int rollno;

     void CalculateAvg()
     {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the rollno: "); 
    rollno = sc.nextInt();
    System.out.println("Enter the number of subjects:");
    int n=sc.nextInt();
    int[] marks= new int[n];
    System.out.println("Enter the marks: ");
    for(int i =0; i < n; i++)
    {
        marks[i]=sc.nextInt();
    }
    double avg= 0;

    for(int i =0; i < n; i++)
    {
        avg = avg + marks[i];
    }
    avg = avg / n;
    System.out.println("Average of the marks is: "+avg);
   }

}

class Employee extends Person{
    Scanner sc = new Scanner(System.in);
    double empid=0;
    double Tax=0;
    double salary=0;

    void GetEInfo() 
    {
        System.out.println("Enter the Salary: ");
        salary = sc.nextDouble();
        sc.nextLine();
    }

    void CalculateTax(){
        
       if((salary>=600000) && (salary<=900000))
       {
           Tax=salary*0.1;
           System.out.println("The tax on salary is:"+Tax);
       }
       else if((salary>=1000000) && (salary<=1200000))
       {
           Tax=salary*1.5;
           System.out.println("The tax on salary is:"+Tax);
       }
       else if((salary>=1200000) && (salary<=1500000))
       {
           Tax=salary*0.2;
           System.out.println("The tax on salary is:"+Tax);
       }
       else if((salary>=1500000))
       {
           Tax=salary*0.3;
           System.out.println("The tax on salary is:"+Tax);
       }
       else
       {
        System.out.println("There is no tax for this annual salary");
       }
    }
}
class TestInheritance{

    public static void main(String[] args) 
    {
        Student s =new Student();
        s.GetInfo();
        s.CalculateAge();
        s.CalculateAvg();
        Employee e = new Employee();
        e.GetEInfo();
        e.CalculateTax();
    }

}


