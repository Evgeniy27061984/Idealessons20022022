package CoursePackages.Course.Lesson9;

public class Car {
    String color;
    String engine;
    public static int count;
    //static int count2 = this.color; нельзя так как может сущ. без объекта

    public Car(String color, String engine) {
        count++;
        this.color = color;
        this.engine = engine;

    }

    public void showColor() {
        System.out.println("Цвет " + color);
        this.changeColor("red");
    }

    public void changeColor(String color3) {
        int price = 5000;
        price += 100;
        color = color3;
        System.out.println("Цвет изменился" + color);
    }

}

class TestCar  {
    public static void main(String[] args) {
        Car car = new Car("red", "V6");
        car.changeColor("blue");
        System.out.println(car.color);
    }


}