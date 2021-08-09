

import java.util.Scanner;
public class Order { // add display order details of customers
    
    private String orderID;
    private String custID;
    private String custName;
    private int quantity;
    private double payableAmt;

    public void setOrderID(String orderID){
        this.orderID = orderID;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Order ID :");
       orderID = input.next();
    }
    public  String getOrderID(){
        return this.orderID;
    }


    public void setCustID(String custID){
        this.custID = custID;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Customer ID :");
       custID = input.next();
    }
    public  String getCustID(){
        return this.custID;
    }


    public void setCustName(String custName){
        this.custName = custName;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Customer name :");
       custName= input.next();
    }
    public  String getCustName(){
        return this.custName;
    }


    public void setQuantity(int quantity){
        this.quantity = quantity;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Quantity :");
       quantity= input.nextInt();
    }
    public  int getQuantity(){
        return this.quantity;
    }


    public void setPay(double payableAmt){
        this.payableAmt = payableAmt;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Payable Amp :");
       payableAmt = input.nextDouble();
    }
    public  double getPay(){
        return this.payableAmt;
    }



    public void main(String[] args){
        // lam tuong tu ben CompacDisc.java
        CompacDisc disc = new CompacDisc();
        System.out.println("\nPayable amount = " + this.quantity*disc.getPrice());

    }
}
