package CoursePackages.Course.Lesson25PolymorphismInstanceof;

public class NewClass {

}
class Car {
    static int a = 5;

    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();
        System.out.println(c1.a);
        c1 = null;
        System.out.println(c1.a);
        // instanceof является ли ссылка объектом Object,
        // то есть ли связь между объектами
        System.out.println(c1 instanceof Object); // false
        System.out.println(c2 instanceof Car); // true
    }

}
