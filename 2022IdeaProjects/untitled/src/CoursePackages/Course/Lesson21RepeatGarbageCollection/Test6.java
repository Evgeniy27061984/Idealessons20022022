package CoursePackages.Course.Lesson21RepeatGarbageCollection;

public class Test6 {
    int abc() {
        return 5;
    }
    int abc2(int i) {
        if (i > 10) {
        return 5;
        }else {
            return 7;
        }
    }
    void abc3(int i) {
        if (i > 3) {
            return; // закончить метод
        }
        return; // закончить метод
    }

    public static void main(String[] args) {
        int a = new Test6().abc();
        System.out.println(a);
        new Test6().abc();

        System.out.println(new Test6().abc2(9));
    }
}
