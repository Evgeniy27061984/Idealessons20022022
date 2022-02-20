package CoursePackages.Course.Lesson12;

public class Car {
    int engine;
    int doorCount;

    public Car(int engine, int doorCount) {
        this.engine = engine;
        this.doorCount = doorCount;
    }
}

class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car(2, 4);
        Car car2 = new Car(3, 5);

        if (car1.engine > car2.engine) {
            if (car1.doorCount > car2.doorCount) {
                System.out.println("1 машина больше");
            } else {
                System.out.println("1 машина больше, кроме дверей");
            }
        }
        else {
            System.out.println("2 машина больше");
        }



    }


}
