






package accountpkg;
import java.text.DecimalFormat;




public class SavingAccount extends Account{

    private double dailyInterest;
    private int daysOfYear;


    public SavingAccount(String accountNumber, String accountHolderName,
    String accountType, double balance, int daysOfYear)
    {
        super(accountNumber, accountHolderName, accountType, balance);
        this.daysOfYear=daysOfYear;
    }
    public double calcuteInterest(){


        dailyInterest = (super.getBalance() * bankpkg.Bank.interestRate / 100)
            / daysOfYear;

            DecimalFormat twoDForm = new DecimalFormat("#.00");
            return Double.valueOf(twoDForm.format(dailyInterest));
    }



    @Override
    public void displayDetails(){

        super.displayDetails();

        System.out.println("Daily Interset is: $"+ calcuteInterest());
        System.out.println("---------------------------------------");
        

    }



}
    

