
class Car {
    public String color;

    public Car() {
        System.out.println("Car is building.");
    }
}

class SportCar extends Car {
    public SportCar() {
        super();
        System.out.println("SportCar is building.");
    }
}

public class Main {
    public static void main(String[] args) {
        SportCar sportCar = new SportCar();
    }
}
