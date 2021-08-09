
import java.util.Scanner;
import java.util.Date;

public abstract class GeometricObject {

    protected String color;
    protected boolean filled;

    public GeometricObject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public void setColor(String color){
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter the color :");
        color = input.next();
    }
    public String getColor(){
        return color;
    }

    public void setFilled(boolean filled){
        Scanner input = new Scanner(System.in);
        System.out.println("\nIs the geometry filled ? (Y/N question )");
        String f = input.next();
        if( f == "yes"){
            filled = true;
        }else if( f == "no"){
            filled = false;
        }else{
            System.out.println("Invalid answer !");
        }
    }
    public isFilled(){
        return filled;
    }

    public void getDateCreated(){
        System.out.println("The currenr time is :" +time);
    }
    
    public abstract double getArea();  /// Dien tich
    public abstract double getPerimeter(); // Chu vi
    
}
