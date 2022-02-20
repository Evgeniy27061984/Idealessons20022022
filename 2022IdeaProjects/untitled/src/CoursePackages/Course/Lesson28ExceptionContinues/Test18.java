package CoursePackages.Course.Lesson28ExceptionContinues;

public class Test18 {
    void abc() {
        System.out.println("method abc");
        throw new StackOverflowError();//рекурсия
    }
    void def() {
        try{
            abc();
            return;
        }
        finally {
            System.out.println("finally");
        }
    }

    public static void main(String[] args) {
        Test18 t = new Test18();
        t.def();//Exception in thread "main" java.lang.StackOverflowError
    }

}
