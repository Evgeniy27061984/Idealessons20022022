package CoursePackages.Course.Lesson27Exception;

public class Test2 {
    public static void main(String[] args) {
        int array [] = {1,4,0};
        String s = null;
        System.out.println(s.length());//java.lang.NullPointerException
        System.out.println(array[5]); //java.lang.ArrayIndexOutOfBoundsException
        System.out.println("Hello");
    }
}
