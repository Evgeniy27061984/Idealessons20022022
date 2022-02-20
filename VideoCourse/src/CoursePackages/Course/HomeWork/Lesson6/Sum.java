package CoursePackages.Lesson1.HomeWork.Lesson6;

public class Sum {
    void sum() {
        System.out.println("0");
    }
    void sum(int a) {
        System.out.println(a);
    }

    void sum(int a,int b) {
        System.out.println(a + b);
    }

    void sum(int a,int b,int c) {
        System.out.println(a + b + c);
    }

    void sum(int a,int b,int c, int d) {
        System.out.println(a + b + c + d);
    }

    void sum(int a,int b,int c, int d, int e) {
        System.out.println(a + b + c + d);
    }
}

class TestSum {
    public static void main(String[] args) {
        Sum s = new Sum();
        s.sum(3, 7);
    }
}