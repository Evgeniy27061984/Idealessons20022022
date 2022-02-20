package CoursePackages.Course.HomeWork.Lesson26;

public class Test {
    void abc(short s) {
        System.out.println("byte");
    }
    void abc(int i) {
        System.out.println("int");
    }
    void abc(float f) {
        System.out.println("float");
    }
    void abc(Object o) {
        System.out.println("Object");
    }

    public static void main(String[] args) {
        Test t = new Test();
        char c = 55;
        t.abc(c); //int
        t.abc(false); //object
        t.abc(3.14); // object
        t.abc((float)3.14); // float
    }


}
