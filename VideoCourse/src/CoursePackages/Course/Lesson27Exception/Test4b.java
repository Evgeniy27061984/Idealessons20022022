package CoursePackages.Course.Lesson27Exception;

public class Test4b {
    void abc() throws NullPointerException { //объявлено выброшено
        String s = null;
        System.out.println(s.length());
    }

    public static void main(String[] args) {
        int [] array = {1,3,5};
        System.out.println("Hello");
    }
}
//Exception - checked обязательно проверять
//RuntimeException - unchecked необязательно проверять