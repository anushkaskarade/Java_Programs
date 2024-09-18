
class Account
{
    private static  double annualInterestRate;

    private double saving_balance=0;

    public  Account(double temp)
    {
        this.saving_balance=temp;
    }  

    public static void Setrate(double rate)
    {
        annualInterestRate=rate/100;
    }


    public void CalculatemonthlyInterest()
    { 
       double monthInterest=0;
       monthInterest=(saving_balance*annualInterestRate)/12;
       saving_balance=saving_balance+monthInterest;
       System.out.println("The Total saving balance is: "+saving_balance);
    }
}


class Saving_account{
    public static void main(String[] args) 
{
    Account saver1=new Account(2000);
    Account saver2=new Account(3000);
    saver1.Setrate(4);
    saver1.Setrate(5);
    saver1.CalculatemonthlyInterest();
    saver2.CalculatemonthlyInterest();

}
}
