package CoursePackages.Course.Lesson10;

//import CoursePackages.Course.Lesson9.Car;
//import CoursePackages.Course.Lesson9.Student;
import CoursePackages.Course.HomeWork.Car1;
import CoursePackages.Course.Lesson9.*;
import CoursePackages.Course.HomeWork.*; //через пакет нельзя найти класс, надо казать пакет точно
//import CoursePackages.Course.Lesson8.*;  одинаковые классы в пакетах №9 и №8
import static CoursePackages.Course.Lesson9.Car.count;

public class A {
    public static void main(String[] args) {
        String st1 = new String("Hello");
        String st2 = new String();
        Car car = new Car ("reg", "v6");
        Student st = new Student();
    }

}

class B {
    Car1 l = new Car1();
    Student st = new Student();
    int v = count; // cтвтическая переменная
}
