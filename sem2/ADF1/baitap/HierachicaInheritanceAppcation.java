
class ParentClass{
    int a;
    void setData(int a)
    {
        this.a = a;
    }
}
class  ChildClass1 extends ParentClass{
    void showDataClass1(){
        System.out.println("ChildClass1");
        System.out.println("Valuee of a: " +a);
    }
}
class  ChildClass2 extends ParentClass{
    void showDataClass2(){
        System.out.println("ChildClass2");
        System.out.println("Valuee of a: " +a);
    }
}
public class HierachicaInheritanceAppcation {
    public static void main(String[] args) {
        
        ChildClass1 childclass1 = new ChildClass1();
        childclass1.setData(30);
        childclass1.showDataClass1();

        ChildClass2 childclass2 = new ChildClass2();
        childclass2.setData(30);
        childclass2.showDataClass2();

    }
    
}
