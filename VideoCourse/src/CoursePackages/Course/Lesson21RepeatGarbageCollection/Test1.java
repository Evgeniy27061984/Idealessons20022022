package CoursePackages.Course.Lesson21RepeatGarbageCollection;

public class Test1 {
    public static void main(String[] args) {
        int a = 4;
        System.out.println(a > 4 ? 5 : 6); //6

        // int b = (a > 4) ? 7 : "привет"; нельзя разные типы
        int b = (a > 4) ? 7 : 4;

    }
}
