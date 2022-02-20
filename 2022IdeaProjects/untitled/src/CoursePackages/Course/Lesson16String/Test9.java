package CoursePackages.Course.Lesson16String;

public class Test9 {
    public static void main(String[] args) {
            String s1 = new String("ok");
            String s2 = new String("ok");
                System.out.println(s1 == s2); // false
                System.out.println(s1.equals(s2));  // true переопределен toString
        String s3 = "hello";
        String s4 = "hello";
        System.out.println(s3 == s4); // true
        System.out.println(s3.equals(s4)); // true так уже есть в пуле

        String s5 = "Hello";
        String s6 = "hello";
        System.out.println(s5 == s6); // true
        System.out.println(s5.equalsIgnoreCase(s6)); // true так уже есть в пуле


    }
}
