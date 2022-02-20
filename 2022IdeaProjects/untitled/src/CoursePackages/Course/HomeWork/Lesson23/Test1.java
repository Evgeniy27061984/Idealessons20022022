package CoursePackages.Course.HomeWork.Lesson23;


class X {}
class Y extends X {}

public class Test1 {
    public static void abc(X x, Y y) {
        System.out.println("hello");
    }
    public static void abc(Y y, X x) {
        System.out.println("bye");

    }
    public static void main(String[] args) {
        Y a = new Y();
        //abc(a,a);
    }
}

