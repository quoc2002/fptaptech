

import java.util.Scanner;
public class CompacDisc { // Add and display details of the CDs
    private String ID;
    private String type;
    private String artist;
    private double price;
    private float discount;


    public void setPrice(double price){
           this.price = price;
           Scanner input = new Scanner(System.in);
           System.out.print("Enter price :");
          price = input.nextDouble();
    }
    public  double getPrice(){
           return this.price;
    }


    public void setID(String ID){
            this.ID = ID;
            Scanner input = new Scanner(System.in);
            System.out.print("Enter your ID :");
           ID = input.next();
    }
   public String getID(){
       return this.ID;
   }

   public void setType(String type){
    this.type = type;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter type :");
   type = input.next();
}
public  String getType(){
    return this.type;
}


public void setArtist(String artist){
    this.artist = artist;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Artist :");
     artist = input.next();
}
public  String getArtist(){
    return this.artist;
}

public void setDiscount(float discount){
    this.discount = discount;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Discount :");
   discount = input.nextFloat();
}
public  double getDiscount(){
    return this.discount;
}

  public void main(String[] args){
      setPrice(price);
     
      setID(ID);
      
      setType(type);
     
      setArtist(artist);
      
      setDiscount(discount);
     
      System.out.println("------------------------------");
      System.out.println("|   ID     |      Type      |      Artist      |      Price     |        Discount      |");
      System.out.printf("|    %s    |     %s     |     %s     |     %lf    |    %f   |\n",this.ID,this.type,this.artist,this.price,this.discount);
  }

}
