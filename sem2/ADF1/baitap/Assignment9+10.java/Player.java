

import java.util.Scanner;
public class Player extends Game {

    private String name;
    private int age;
    private String gender;
    private String match;

    public void displayDetails(String match){

        this.match = match;
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter the name of match :");
        match = input.next();
        Game game = new Game(); 
        System.out.print("Income of player :"+ game.calculateIncome());
        System.out.print("Bonus of player :"+ game.calculateBonus());

        TestMatch test = new TestMatch();
        System.out.print("Income of player in test match :"+ test.calculateIncome());
        System.out.print("Bonus of player in test match :"+ test.calculateBonus());
    }

    public void setName(String name){
        this.name = name; 
    }
    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age; 
    }
    public int getAge(){
        return this.age;
    }

    public void setGender(String gender){
        this.gender = gender; 
    }
    public String getGender(){
        return this.gender;
    }

   
}
