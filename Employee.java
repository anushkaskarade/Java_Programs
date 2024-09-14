import java.util.*;

class emp{
    Scanner sc=new Scanner(System.in);
    String fname,lname;
    double salary=0;

    emp() {

       String fname;
       String lname;
       double salary=0;
    }

    void Setfname()
    {
       System.out.println("Enter the first name of the employee:");
       fname=sc.nextLine();
      
    }

    void Setlname()
    {
       System.out.println("Enter the last name of the employee:");
       lname=sc.nextLine();
      
    }

    void Setsalary()
    {
        System.out.println("Enter the salary of the employee:");
        salary=sc.nextDouble();
    }

    void Getfname()
    {
    
        System.out.println("INFORMATION OF THE EMPLOYEE");
        System.out.println("The first name of the employee is:" + fname);
    }

    void Getlname()
    {
        System.out.println("The last name of the employee is:" + lname);
    }

    void Getsalary()
    {
        System.out.println("The salary of the employee is:" + salary);
    }

    void Salary()
    {
        double value=salary*0.1;
        salary=value+ (salary*12);
        System.out.println("The annualy increased salary of the employee is:"+ salary);
    }
}

class Employee{
    public static void main(String[] args) 
    {
        emp e1=new emp();
        emp e2=new emp();
        e2.Setfname();
        e2.Setlname();
        e2.Setsalary();
        e2.Getfname();
        e2.Getlname();
        e2.Getsalary();
        e2.Salary();
    }
}
