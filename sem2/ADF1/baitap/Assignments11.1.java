package accountpkg;
import bankpkg.Itransaction;
importjava.text.DecinalFormat;


public class Assignments11.1 extends Assignments11  {
    private double dailyInterest;
    private int dayofYear;
    public SavingAccount(String accountNummber,String accountHolderName,String account){
        super(accountNumber,accountHolderName,accountType,balance);
        this.dayofYear=dayofYear;
        System.out.println("Daily Interest is: $ " + calulateInterest());
        System.out.println("________________________");
        @Override
        public void checkBalance(String accountNumber) {
            throw new UnsupportedOperationException("Not supported yet.")
        }
    }
}
