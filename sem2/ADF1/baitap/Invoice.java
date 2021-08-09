import java.util.Scanner;

public class Invoice {
    private static int points = 0;

    public static void main(String[] args) {
        int orderedShirts, orderedTrousers;
        int priceOfShirt = 300;
        int priceOfTrouser = 700;
        int costOfShirts, costOfTrousers, totalCost;
        double discount, netPay;


        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of Shirts to order: ");
        orderedShirts = input.nextInt();
        System.out.println("Enter the number of Trousers to order: ");
        orderedTrousers = input.nextInt();

        //
        costOfShirts = priceOfShirt * orderedShirts;
        costOfTrousers = priceOfTrouser * orderedTrousers;
        totalCost = costOfShirts + costOfTrousers;

        //
        discount = totalCost > 3000 ? totalCost * 10 / 100 : 0;
        netPay = totalCost - discount;

        //
        points = (int)(netPay > 3000 ? netPay /100 : 0);

        //
    }
    
}
