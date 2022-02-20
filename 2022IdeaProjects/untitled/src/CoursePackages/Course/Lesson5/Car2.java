package CoursePackages.Course.Lesson5;

public class Car2 {
    String color;
    String engine;
    int speed;

    int gas (int speed2) {
        speed += speed2;
        return speed;
    }

    int slowly (int speed2) {
        speed -= speed2;
        return speed;
    }

    void show () {
        System.out.println(color + " " + engine +  " " + speed);
    }
}

class CarTest {
    public static void main(String[] args) {
        Car2 volvo = new Car2();
            volvo.color = "white";
            volvo.engine = "v6";
            volvo.speed = 100;

        volvo.show();
        volvo.gas(1);
        volvo.show();
        volvo.slowly(2);
        volvo.show();
    }
}
