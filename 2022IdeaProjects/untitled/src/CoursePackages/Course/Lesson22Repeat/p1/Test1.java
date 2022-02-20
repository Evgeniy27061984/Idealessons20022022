package CoursePackages.Course.Lesson22Repeat.p1;

import CoursePackages.Course.Lesson22Repeat.Human;

public class Test1 extends Human{
    public static void main(String[] args) {
        // Human.rest(); не видит потому что default
        System.out.println(Human.salary); // виден потому что наследник
        Human h = new Human();
        System.out.println(h.salary);
        System.out.println(h.name);
    }
}
