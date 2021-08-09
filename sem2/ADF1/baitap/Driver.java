import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class Driver {

    public Driver(double width, double height, String color, boolean filled,double radius){
        super(width,height,color,filled,radius);
    }
    

    public static void main(String[] args) {
        
        GeometricObject geometry = new GeometricObject();
        geometry.getDateCreated();

        double sum1,sum2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of geometries :");
        sum1 = input.nextInt();

        for(int i=0;i<n;i++){
        Circle circle = new Circle();
        circle.setColor("red");
        circle.setFilled(true);
        circle.setRadius(12);//bien tam thoi
        System.out.println("Circle : { Color = " + circle.getColor() + "  |  Radius = " + circle.getRadius() + " | Diameter = " + circle.getDiameter() + "  |  Perimeter = " + circle.getPerimeter() + "  |  Area = " + circle.getArea() + "  }");
            sum1 += circle.getArea();  
    
    }

      for(int i=0;i<n;i++){

        Rectangle rectangle = new Rectangle(2, 3, "red", true);
        rectangle.setHeight(2);
        rectangle.setWidth(4);
        System.out.println("Rectangle : { Color = " + circle.getColor() + "  |  Height = " + rectangle.getHeight() + " | Width = " + rectangle.getWidth() + "  |  Perimeter = " + rectangle.getPerimeter() + "  |  Area = " + rectangle.getArea() + "  }");

           sum2 += rectangle.getArea();
      }

      double sum = sum1+sum2;

      System.out.println("Sum of Circles Area :" +sum1);
      System.out.println("Sum of Retangle Area :" +sum2);
      System.out.println("Sum of sum :" +sum);


    }
    
}
