interface Human{
    void learn();
    void work();
    
}
interface Reruiment{
    boolean screening(int score);
    boolean interview(boolean selected);
}
class Person{
    int age;
    String name;
    void personTalk(){

    }
}
class Programer extends Person implements Human,Reruiment{
    public boolean screening(int score){
        return ture;
    }
    public boolean interview(boolean sclected){
        return ture;
    }
    public void learn(String str){
        //trien khai code
    }
    public void work(){
        System.out.println("working");
    }
}
class Dancer extends Person implements Human,Reruiment{
    public void work(){
        System.out.println("Dancing");
    }
}


public class HrManagementApplication {
    public static void main(String[] args) {
        Programer programer=new Programer();
        programer.work();
        Dancer dancer =new Dancer();
        dancer.work();
    }

}
