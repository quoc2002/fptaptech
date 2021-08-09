import java.util.Scanner;
public class TestAccount3 {
    public static void main(String[] args){
        String[] accountDetails = new String[4];
        String[] bankDetails = new String[3];
        Scanner input = new Scanner(System.in);

        System.out.print("ENTER Account Number:");
        accountDetails[0] = input.nextLine();
        System.out.print("enter Name:");
        accountDetails[1] = input.nextLine();
        System.out.print("enter type: ");
        accountDetails[2] = input.nextLine();
        System.out.print("enter Blance: ");
        accountDetails[3] = input.nextLine();

        System.out.print("enter bank id :");
        bankDetails[0] = input.nextLine();
        System.out.print("enter bank name:");
        bankDetails[1] = input.nextLine();
        System.out.print("enter branch :");
        bankDetails[2] = input.nextLine();

        System.out.println("------------------------------------------");
        Account objAccount1 = new Account();

        objAccount1.addDetails(accountDetails);
        objAccount1.displayDetails();
        System.out.println("--------------------------------------------");

        Bank objAccount1 = new Bank();
        objAccount1.addBankDetails(bankDetails);

        objBank1.displayBankDetails();
    }
    
}
