package CoursePackages.Course.Lesson8;

public class Car {
    String color = "red";
    String engine = "v6";
}

class Human {
    String name = "Ivan";
    //Car c = new Car();
    final Car c = new Car();

    public static void main(String[] args) {
        Human h = new Human();
       // h.c = new Car();
       // h.c = new Car();
        h.c.engine = "v8";

    }

}
