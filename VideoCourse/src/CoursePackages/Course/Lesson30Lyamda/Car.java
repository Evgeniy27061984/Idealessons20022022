package CoursePackages.Course.Lesson30Lyamda;
import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.function.Consumer;

public class Car {
    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }
}

class Test10 {
    public static ArrayList<Car> createThreeCar(Supplier<Car> carSupplier) {
        ArrayList<Car> a1 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            a1.add(carSupplier.get());
        }
        return a1;
    }

    public static void changeCar(Car car, Consumer <Car> consumer) {
        consumer.accept(car);

    }

    public static void main(String[] args) {
        ArrayList<Car> ourCars =
                createThreeCar(() -> new Car("Mercedes", "white", 2));
        System.out.println(ourCars.toString());
        changeCar(ourCars.get(0), car -> {car.color = "black"; System.out.println("ghg");});
//        Consumer <Car> consumer = car -> {
//            car.color = "black";
//            System.out.println("ghg");
//        };
//        consumer.accept(ourCars.get(0));
        System.out.println(ourCars.toString());
    }
}
