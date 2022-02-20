package CoursePackages.Course.Lesson28Localdate;

public class Test2 {
    public static void main(String[] args) {
        Car c = Car.createdCar();
    }
}
class Car {
    private Car() {}
    static Car createdCar() {
        return new Car();
    }

}
