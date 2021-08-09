class Car {
    public void accelerate() {
        System.out.println("Car is accelerating!");
    }
}

class LuxuryCar extends Car {
    public void service() {
        System.out.println("LuxuryCar is in service!");
    }
}
public class Main02 {
    public static void main(String[] args) {
        Car c = new LuxuryCar();
        // We can not use c.service()
        // But we can  use downcasing to use
        ((LuxuryCar) c).service();
    }
}
