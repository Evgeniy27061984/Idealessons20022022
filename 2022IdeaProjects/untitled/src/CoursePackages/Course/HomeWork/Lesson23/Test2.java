package CoursePackages.Course.HomeWork.Lesson23;


class X1 {
    String s1 = "hello";
}
class Y1 extends X2 {
boolean bool = false;
}


public class Test2 {
    public static void main(String[] args) {
        X2 x = new Y1();
        //System.out.println(x.s1 + " " + x.bool);
    }
}
