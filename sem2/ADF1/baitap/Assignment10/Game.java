package Assignments.Assignment10;

import java.util.Scanner;
public class Game { 
    /* method : caculate income of the player
                caculate the bonus based on their performance */

                private double price;
                protected int numGames;
                private String performance;
                protected int grade;

            public void setIncome(int numGames){
                this.numGames = numGames;
                Scanner input = new Scanner(System.in);
                System.out.print("\nEnter the number of games :");
                numGames = input.nextInt();
            }
            public double calculateIncome(){

                // calculate the income of player
                return this.numGames*this.price;
            }


            public void setBonus(int grade){
                this.grade = grade;
                Scanner input = new Scanner(System.in);
                System.out.print("\nEnter the grade of games :");
               grade = input.nextInt();
            }
            public double calculateBonus(){
                // calculate the bonus based on performance and the grade; Performance is rated as good, average, and best.
                     return this.grade*0.01;
            }
    
}
