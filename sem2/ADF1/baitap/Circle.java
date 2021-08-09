import java.util.Scanner;
import java.util.Date;
public abstract class  Circle  extends GeometricObject{

    protected double radius;

    public Circle(double radius,String color, boolean filled){

        super(color,filled);
        this.radius = radius;
    }

    public void setRadius(double radius){

        Scanner input = new Scanner(System.in);
        do{
            System.out.println("\nEnter the length of radius :");
             radius = input.nextDouble();
             if(radius <=0){
                 System.out.println("\nThe length is invalid");
             }
        }while(radius <= 0);
    }
    public double getRadius(){
        return radius;
    }

    public double getDiameter(){
        return radius*2;
    }

    @Override
    public double getArea(){
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter(){
        return getDiameter() * 2;
    }
    
}
