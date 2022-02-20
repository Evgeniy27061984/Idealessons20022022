package CoursePackages.Course.Lesson24AbstractInterface;

public class Test4 extends Test5 {
    public Test4 () {
        System.out.println("4");
    }
    String s = "R";
}

class Test5 {
    public Test5 () {
        System.out.println("5");
    }
    String t = "g";
}

class Test6 {
    public static void main(String[] args) {
        Test5 v = new Test4();
        String r =v.t;
    }

}
