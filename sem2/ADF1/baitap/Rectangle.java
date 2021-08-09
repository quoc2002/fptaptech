import java.util.Scanner;
import java.util.Date;

public class Rectangle extends GeometricObject{

    protected double width;
    protected double height;

    public Rectangle(double width, double height, String color, boolean filled){

        super(color, filled);
        this.width = width;
        this.height = height;

    }

    public void setHeight(double height){

        Scanner input = new Scanner(System.in);
        do{
            System.out.println("\nEnter the length of height :");
             height = input.nextDouble();
             if(height <=0){
                 System.out.println("\nThe length is invalid");
             }
        }while(height <= 0);
    }
    public double  getHeight(){
        return height;
    }


    public void setWidth(double width){

        Scanner input = new Scanner(System.in);
        do{
            System.out.println("\nEnter the length of width :");
             width = input.nextDouble();
             if(width <=0){
                 System.out.println("\nThe length is invalid");
             }
        }while(width <= 0);
    }
    public double  getWidth(){
        return width;
    }

     @Override
    public double getArea(){
        return height * width;
    }
    @Override
    public double getPerimeter(){
        return (height + width) *2;
    }

    
    
}
