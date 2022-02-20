package CoursePackages.Lesson1.Lesson6;

public class MethodOverLoading2 {

    int sum (int i1, int i2) {
        return i1 + i2;
    }

    String sum (String s1, String s2) {
        return s1 + s2;
    }

}

class TestMethodOverLoading2 {
    public static void main(String[] args) {
        MethodOverLoading2 mO = new MethodOverLoading2();
        System.out.println(mO.sum(1,3)); // имена методов одинаковые
        System.out.println(mO.sum("Привет"," мир")); // имена методов одинаковые


    }
}
