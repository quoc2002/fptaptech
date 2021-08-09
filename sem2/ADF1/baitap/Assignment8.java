public class Assignment8 {

    private String id;
    private String type;
    private String stock;
    private float price;
    private String sales;
    private int orderQTY;
    
    public void argument(String id, String type, String stock, float price, String sales, int orderQTY ){
            this.id = id;
            this.type = type;
            this.stock = stock;
            this.price = price;
            this.sales = sales;
            this.orderQTY = orderQTY;

            Scanner input = new Scanner(System.in);

            System.out.println("\nPlease enter the number of Products:");
           int n = input.nextInt();

                     for(int i=0;i<n;i++){
                         System.out.println("Product "+ i+1 +" :");

            System.out.println("\nPlease enter the Products ID :");
            id = input.next();

            System.out.println("\nPlease enter the Products type :");
            type = input.next();

            System.out.println("\nPlease enter the Products stock :");
            stock = input.next();

            System.out.println("\nPlease enter the Products Price :");
            price = input.nextFloat();

            System.out.println("\nPlease enter the sales :");
            sales = input.next();

            System.out.println("\nPlease enter the Products Order quantity :");
            orderQTY = input.nextInt();
            }
    }

    // Add Garment
    // Show details

    public void main(String[] args){
        
        argument(id, type, stock, price, sales, orderQTY);
    }
}
