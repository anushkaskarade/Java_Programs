import java.util.Scanner;
class Employee
{
    Scanner sc=new Scanner(System.in);
     String name;
     String Address;
     double Salary=0;
     String Job_Title;
}

class Manager extends Employee
{

   void m_set()
   {
    System.out.print("Enter the name of the employee:");
    name=sc.nextLine();
    sc.nextLine();
    System.out.println("Enter the Address of the employee:");
    Address=sc.nextLine();
    System.out.println("Enter the salary of the emploee:");
    Salary=sc.nextDouble();
    sc.nextLine();
    System.out.println("Enter the job title:");
    Job_Title=sc.nextLine();

   }

   void m_get()
   {
    System.out.println("Name of the employee is:"+name);
    System.out.println("Address of the employee is:"+Address);
    System.out.println("Enter the salary of the emploee:"+Salary);
    System.out.println("Job of the employee is:"+Job_Title);
   }

    void Calculate_bonus()
    {
      System.out.println("Enter the bonus% on salary:");
      double bonus_rate=sc.nextDouble();
      double bonus=Salary*0.01*bonus_rate;
      System.out.println("The bonus is:"+bonus);
    }
    
}

class Developer extends Employee
{
    
    void d_set()
    {
            System.out.print("Enter the name of the Developer:");
            name=sc.nextLine();
            System.out.println("Enter the Address of the Developer:");
            Address=sc.nextLine();
            System.out.println("Enter the salary of the Developer:");
            Salary=sc.nextDouble();
            sc.nextLine();
            System.out.println("Enter the job title:");
            Job_Title=sc.nextLine();
            sc.nextLine();
            
        
    }

    void d_get()
    {
        System.out.println("Name of the Developer is:"+name);
        System.out.println("Address of the Developer is:"+Address);
        System.out.println("Salary of the Developer:"+Salary);
        System.out.println("Job of the Developer is:\n"+Job_Title);
    }

    void performance_report()
    {
        System.out.println("Enter the performance as good/better/best :");
        String p=sc.nextLine();
        System.out.println("The performance is:"+p);
    }

}

class Programmer extends Employee
{
   
    void p_set()
    {
            System.out.print("Enter the name of the programmer:");
            name=sc.nextLine();
            System.out.println("Enter the Address of the programmer:");
            Address=sc.nextLine();
            System.out.println("Enter the salary of the programmer:");
            Salary=sc.nextDouble();
            sc.nextLine();
            System.out.println("Enter the job title:");
            Job_Title=sc.nextLine();
        
    }

    void p_get()
    {
        System.out.println("Name of the programmer is:"+name);
        System.out.println("Address of the programmer is:"+Address);
        System.out.println("Enter the salary of the programmer:"+Salary);
        System.out.println("Job of the programmer is:"+Job_Title);
    }

    void projects()
    {
        System.out.println("Enter no. of projects");
        int n=sc.nextInt();
        sc.nextLine();
        String [] arr=new String[n];
        System.out.println("Enter the projects:");
        for(int i=0;i<n;i++)
        {
         arr[i]=sc.nextLine();
        }
        System.out.println("The projects are:");
        for(int i=0;i<n;i++)
        {
          System.out.println(arr[i]);
        }
    }

}


class Company
{
   public static void main(String [] args)
   {
       Manager m=new Manager();
       m.m_set();
       m.m_get();
       m. Calculate_bonus();
       Developer d=new Developer();
       d.d_set();
       d.d_get();
       d.performance_report();
       Programmer p=new Programmer();
       p.p_set();
       p.p_get();
       p. projects();
   }

}