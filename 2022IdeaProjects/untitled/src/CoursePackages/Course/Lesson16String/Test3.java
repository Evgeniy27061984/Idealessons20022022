package CoursePackages.Course.Lesson16String;

public class Test3 {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        String s = "kk";
        System.out.println(a + b + s); // 10kk
        System.out.println("" + a + b + s); // 55kk
        System.out.println("" + (a + b) + s); // 10kk

        int c = 7;
        String e = "Hello";
        String y = e + c;
        // String z = 8 + c; ошибка
        System.out.println(y);

    }


}
