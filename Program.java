
    class Saving_account{
    private static  double annualInterestRate;

    private double saving_balance=0;

    public  Saving_account(double temp)
    { 
        this.saving_balance=temp;
    }  

    public static void Set_rate(double rate)
    {
        
        annualInterestRate=rate/100;
    }


    public void Calculate_monthlyInterest()
    { 
       double monthInterest=0;
       monthInterest=(saving_balance*annualInterestRate)/12;
       saving_balance=saving_balance+monthInterest;
       System.out.println("The Total saving balance is : "+saving_balance);
    }
}


class Program{

public static void main(String[] args) 
{
    double temp1=2000.0;
    double temp2=3000.0;
    Saving_account saver1=new Saving_account(temp1);
    Saving_account saver2=new Saving_account(temp2);
    saver1.Set_rate(4);
    saver1.Set_rate(5);
    saver1.Calculate_monthlyInterest();
    saver2.Calculate_monthlyInterest();

}
}
