
import java.util.Scanner;



public class Customer {

   public static void main(String[] args) {
        //Declare the variables
        long customerCode;
        String customerName;
        int customerAge;
        double deposiAmout;

        System.out.println("Enter the details for the new customer.");
        //Create the object of Scanner class to accept values
        Scanner input = new Scanner(System.in);

        // accept values and initialize the variables
        System.out.println("Enter the Four-digit Customer Code: ");
        customerCode = input.nextLong();
        System.out.println("Enter the Customer First Name: ");
        customerName =  input.next();
        System.out.println("Enter the Customer Age: ");
        deposiAmout = input.nextDouble();

        //displayy the value of variables
        System.out.println("\nCustomerCode \t\t CustomerName \t\t CustomerAge \t\t DepositAmout");
        System.out.println("------------------------------------------------------------------------------------");

        System.out.format("%08d \t\t\t", customerCode);
        System.out.format("%s \t\t\t", customerName);
        System.out.format("%d \t\t\t", customerAge);
        System.out.format("%.2f\n", deposiAmout);
   } 
}
