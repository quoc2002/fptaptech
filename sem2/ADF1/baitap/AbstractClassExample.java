
import java.util.*;

abstract class Shape{

    int rarius, width, length;
    abstract void printArea();//cho phep "Ghi de" o lop ke thua
    Scanner input = new Scanner(System.in);   

}
class Rectangle extends Shape{
    void printArea(){
        System.out.println("Tinh dien tich HCN");
        System.out.println("Nhap thong so kt(dai,rong): ");
        //width = input.nextInt();
        
        //length = input.nextInt();
        System.out.println("Dien tich: " + width*length);

    }

}
class Cricle extends Shape{
    void printArea(){
        System.out.println("Tinh dien tich hinh tron");
        //System.out.println("Nhap ban kinh");

    }

}




public class AbstractClassExample {
     public static void main(String[] args) {
         Rectangle rectangle = new Rectangle();
         rectangle.printArea
     }
}
