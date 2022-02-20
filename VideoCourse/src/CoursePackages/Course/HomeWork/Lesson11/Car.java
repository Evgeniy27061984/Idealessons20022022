package CoursePackages.Course.HomeWork.Lesson11;

public class Car {
    String color;
    String engine;
    int doorCount;

    public Car (String color,String engine,int doorCount) {
        this.color = color;
        this.engine = engine;
        this.doorCount = doorCount;
    }
}

class TestCar {


     void doorCountChange (Car c, int door) {
        c.doorCount = door;
    }


    void classChange (Car c1, Car c2) {
        String color = c1.color;
        c1.color = c2.color;
        c2.color = color;
    }

    public static void main(String[] args) {
        TestCar t = new TestCar();
        Car car1 = new Car ("black", "V6", 4);
        Car car2 = new Car ("white", "V8", 3);
        t.doorCountChange(car1,5);
        t.classChange(car1, car2);
        System.out.println("цвет " + car1.color + " " +
                " двигатель " + car1.engine + " " + " дверь " +  car1.doorCount);

        System.out.println("цвет " + car2.color + " " +
                " двигатель " + car2.engine + " " + " дверь " +  car2.doorCount);
    }
}
