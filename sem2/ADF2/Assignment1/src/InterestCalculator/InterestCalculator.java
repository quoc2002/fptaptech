package InterestCalculator;

import java.util.Scanner;

public class InterestCalculator {
    public InterestCalculator(){
    }

    public static void main(String[] args) {

        long prAmount = 0;

        float ratef = 0.0f;

        int yr = 0;

        double simpleInterest = 0.0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Principal Amount: ");
        prAmount = input.nextLong();

        System.out.println("Enter the rate in percentage: ");
        ratef = input.nextFloat();

        System.out.println("Enter the duration in year(s): ");
        yr = input.nextInt();

        System.out.println("Processing...");
        System.out.println("************************************");

        Integer year = new Integer(yr);

        Float rate = new Float(ratef);

        Long principal = new Long(prAmount);

        simpleInterest = (principal * rate * year) / 100;

    }

}
