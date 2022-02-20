package CoursePackages.Course.HomeWork.Lesson23;

public class Z {
//    public Z() {
//        System.out.println("Z1");
//    }
    public Z(int z) {
        System.out.println("Z2");
    }
    public boolean abc() {
        return false;
    }

    public static void main(String[] args) {
        Z z = new F(18);
        System.out.println(z.abc());
    }
}

class F extends Z {
    public F(int z) {
        super(z); // вызывается сначало super
        System.out.println("F");
    }
    public boolean abc() {
        return true;
    }
}