package CoursePackages.Course.Lesson16String;

public class Car {
    String color;
    String engine;

    public Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    final static int a = 5;

    public Car abs (String color2) {
        Car c10 = new Car (color2,"v8");
        return c10;
    }

//    public static void main(String[] args) {
//            // a = 10; не может быть изменена
//    }

    public static void main(String[] args) {
        Car c = new Car ("red", "v6");
        Car c2 = c.abs("black");
        System.out.println(c.color);
    }

}

class TestCar {
    final static Car c = new Car ("red", "v6");

    public static void main(String[] args) {
       // c = new Car ("blue", "V6"); нельзя ссылаться
        c.color = "black"; // можно
    }
}
