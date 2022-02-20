package CoursePackages.Course.Lesson24AbstractInterface;

public class Test1 {

}

class A {
    String s = "Hello";
    void abc () {
        System.out.println("???");
    }
}

class B extends A {
    String s = "Bye";
    void abc () {
        System.out.println("!!!");
    }
}

class C extends B{
    public static void main(String[] args) {
        C c = new C();
        c.abc();
        System.out.println(c.s);
    }
}
