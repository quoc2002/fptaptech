import java.util.ArrayList;
import java.util.Iterator;
public class Bank {
    String bankID;
    Sting bankName;
    String branch;
    private ArrayList bankDetails = new ArrayList();
    public static final float interestRate = 3.5F;
    public Bank(){
        bankID = "not specified";
        bankName = "not specified";
        branch = "not specified";
    }

    public Bank(String bankID, String bankName, String branch){
        this.bankID = bankID;
        this.bankName = bankName;
        this.branch = branch;
    }
    public void  addBankDetails(String[] details){
        System.out.println("adding bank  details. please wait...");
        for (int i = 0; i<details.lenght;i++){
            bankDetails.add(details[i]);
        }
    }

    public void displayBankDetails(){
        System.out.println("bank details of customer");
        System.out.println("bank ID. bank Name \t branch Interst(%");
        System.out.println("-----------------------------------------------");
        Iterator iBank = bankDetails.iterator();
        while (iBank.hasNext()){
            System.out.println(iBank.next() + " "); 
        }
        System.out.print(intereatRate);
        System.out.println("");
    }
}
