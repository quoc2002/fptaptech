package Account;

import java.util.Scanner

public class AccountTransaction {

    String accountNumber;
    double balance = 25000;


    public static void main(String[] args) {

        double amountIn;
        int choice;

        IBankingValidation validationDeposit,validationWithdraw;
        IBankingOperation canWithdrawMoney,canDepositMoney;

        Scanner input = new Scanner(System.in);
        AccountTransaction objAccountTrans = new AccountTransaction();
        validationWithdraw = (bal)->bal<=200;
        validationDeposit = (bal)->bal>10000;

        canWithdrawMoney = (aa,amount)->(return objAccountTrans.balance-amount;);

        canDepositMoney = (aa,amount)->(return objAccountTrans.balance+amount);

        System.out.println("Enter the account number");
        objAccountTrans.accountNumber=input.nextLine();
        System.out.println("Enter the option");
        System.out.println("1: Deposit Money");
        System.out.println("2: Withdraw Money");
        choice= input.nextInt();

        if (choice==1)
        {
            System.out.println("Enter the amount to be deposited");
            amountIn= input.nextDouble();
            if (validationDeposit.validate(amountIn))
            {
                System.out.println("Unable to perfom operation deposit is more than 10000");
            }
            else
            {
                System.out.println("Account Number: " + objAccountTrans.accountNumber + "Balance after Deposit: " + objAccountTrans.transaction(canDepositMoney,amountIn,objAccountTrans));

            }
        }
        else if (choice == 2)
        {
            System.out.println("Your available balance is : " + objAccountTrans.balance);
            System.out.println("Enter the amount to be withdrawn");
            amountIn=input.nextDouble();
            double bal= objAccountTrans.transaction(canDepositMoney,amountIn,objAccountTrans);
        }
        if (validationWithdraw.validate(bal))
        {
            System.out.println("Unable to perform operation as after withdrawal balance woyld be less than 200 and your current balance is :" + bal);
        }
        else
        {
            System.out.println("Account Number: " + objAccountTrans.accountNumber + "Balance after withdrawal : "+ objAccountTrans.transaction(canWithdrawMoney,amountIn,objAccountTrans));
        }
    }
    else
    {
        System.out.println("Invalid Choice");
    }
}
        @FunctionalInterface
    interface IBankingOperation
        {
            boolean validate(double amount);
        }

        public double transaction(IBankingOperation operation,double amount,AccountTransaction a)
        {
            return operation.operate(a,amount);
        }