package hotel;

import java.util.Scanner;

public class HotelTest {

    public HotelTest(){
    }

    public static void main(String[] args) {

        HotelTest objBeach = new HotelTest();

        Scanner input = new Scanner(System.in);

        String choice ="";

        while (!choice.equals("3")){

            System.out.println("\nWelcome to Hotel Beach International.\n" + "Select a task you want to perform:");
            System.out.println("******************************************");

            System.out.println("1. Change the total number of rooms");
            System.out.println("2. Book one or more rooms");
            System.out.println("3. Exit");
            System.out.println("******************************************");

            System.out.println("Enter your choice");
            choice = input.next();

            try {

                if (choice.equals("1")) {
                    objBeach.setCapacity();
                } else if (choice.equals("2")) {
                    objBeach.bookRooms();
                } else if (choice.equals("3")) {
                    return;
                } else {
                    System.out.println("\nInvalid choice.");
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    private void bookRooms() {
    }

    private void setCapacity() {
    }
}
