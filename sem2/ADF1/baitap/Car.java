
public class Car{
    private int id;
    private String name;
    private float price;

    public Car(){}
    public Car (String name) {
        this.name = name;
    }
    public Car(String name, float price){
        this.name = name;
        this.price = name;

    }
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public int sumTwoNumber(int a, int b){
        int x;
        return s = a+b;
    }
    public void forward(){
        System.out.println("go go go");
    }
    public boolean stop(){
        return true;
    }
    public static String greeting(){
        return "Hello all";
    }
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("Vinfast");
        Car car3 = new Car("BWV", 20000);
        car3.stop();
        String carName = car1.getName();

        String hi = greeting();
        //object.ten_thuoc_tinh;
        //object.ten_method()
        //struct str{int a} str_name => str_name.a
    }
}