package CoursePackages.Course.Lesson4;

public class Car {
    String color = "white";
    String engine = "V6";


    Car () { // дефолтный конструктор

    }
    Car (String color1, String engine2) {
        color = color1;
        engine = engine2;

    }
}

class CarTest {
    public static void main(String[] args) {
            Car car = new Car ();
            Car car2 = car; // равны одна ссылка
            Car car3;
            Car car4 = new Car ("black","V8");

 System.out.println(new Car().color); // можно вызвать один раз без создания ссылки
        System.out.println(car4.color);
    }

}