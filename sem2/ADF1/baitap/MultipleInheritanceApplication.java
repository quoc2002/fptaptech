
class ParentClass{
    int a;
    void setData(int a){
        this.a = a;
    }

}
class ChildClass extends ParentClass{
   void showDataChild(){
       System.out.println("Valude of a:" +a);
   }
}
class ChildChildClass extends ChildClass{
  void display(){
      System.out.println("In ChildChildClass");
  }
}

public class MultipleInheritanceApplication {
    public static void main(String[] args) {
        
    
    ChildChildClass childchildClass = new ChildChildClass();
    childchildClass.setData(30);
    childchildClass.showDataChild();
}
}