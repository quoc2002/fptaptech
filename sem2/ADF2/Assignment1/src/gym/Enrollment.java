package gym;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Enrollment {

    public Enrollment(){
    }

    public void setMemberDetails(){

        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");

        try{
            System.out.println("Enter membership ID:");
            membershipID = input.nextInt();

            System.out.println("Enter member name:");
            memberName = input.next();

            System.out.println("Enter member age");
            age = input.nextInt();

            assert (age >= 18) : "Age entered is less than 16.";

            System.out.println("Enter membership type. Choose one from " + "the following:\n1. Silver \n2. Gold\n3. Platium");
            duration = input.nextInt();

            assert (duration >= 1) : "Duration of membership is less than a year.";

        } catch(InputMismatchException e){
            System.out.println("Exception occurred - Data type mismatch ." + "Try again...");
            return;
        }
    }
    private float computeFee(){

        float discount;

        float fees = 0;

        switch (membershipType){
            case 1:
                fees = 4000;
                break;
            case 2:
                fees = 7000;
                break;
            case 3:
                fees = 10000;
                break;
            default:

                assert false: "Incorrect option for membership type.";
        }
        if (age > 45){
            discount = 10;
        }else {
            discount = 3;
        }
        fees = fees - ((discount / 100) * fees);
        return  fees;
    }
    private String displayFacilities(){

        assert membershipType >= 1: "Membership type invalid";

        if (membershipType == 1){
            return "This membership includes only basic facilities";
        }
        if (membershipType == 2){
            return "This membership additionally includes spa and sauna.";
        }
        if (membershipType == 3){
            return "This membership additionally includes Power Yoga" + "and Kickboxing.";
        }

        assert membershipType > 3: "You have reached an unreachable location.";
        return "Error";
    }

       private float computeBill(float fees){

        assert fees > 0 : "Fees cannot be less than 0";

        float billAmount = 1000;

        billAmount = duration * fees;

        assert (billAmount > 3600): "Bill is too low";

        return billAmount;
       }

       public  void getMemberDetails(){
        Scanner input = new Scanner(System.in);

        float fees = computeFee();
           System.out.println("Basic Fee amount is:" + fees);

           System.out.println("Do you wish to calculate bill now? Enter y/n:");
           String answer = input.next();

           if (answer.equalsIgnoreCase("y")){
               System.out.println("Bill Amount is: " + computeBill(fees));
               String perks = displayFacilities();
               System.out.println(perks);
           }
       }
    private int membershipID;

    private String memberName;

    private int age;

    private int membershipType;

    private int duration;

    private String perks;
}
