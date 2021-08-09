

interface Testing {
    
    public void moveObject();
    public void stopObject();
    public void startObject();
    public void turnObject();
}

class Toy implements Testing{
      private String id;
      private String name;
      private double price;
      private String color;
      private String type;


      public void moveObject(){} // thuc hien cac method o day
      public void stopObject(){}
      public void startObject(){}
      public void turnObject(){}

}


 abstract class  Order implements Testing{
      private String orderID;
      private int quantity;
      private double payableAmount;
      private String  toyID;
     

      
      public void moveObject(){}
      public void stopObject(){}
      public void startObject(){}
      public void turnObject(){}

      public abstract int getStock();

}

class Stock extends Order{
   private int stock;

    public int getStock(){
        return this.stock;
    }

}

class TestToy{
    public static void main(String[] args){
        
    }
}
