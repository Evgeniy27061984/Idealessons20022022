package CoursePackages.Course.Lesson6ThisOverLoad;

public class MethodOverLoading {
   //плохо разные имена Надо знать все имена
//    void showInt(int i) {
//        System.out.println(i);
//    }
//
//    void showBoolean(boolean b) {
//        System.out.println(b);
//    }
//
//    void showString(String s) {
//        System.out.println(s);
//    }

    void show(int i) {
        System.out.println(i);
    }

    void show(boolean b) {
        System.out.println(b);
    }

    void show(String s) {
        System.out.println(s);
    }

    void show(String s, int x) {
        System.out.println(s);
    }

    void show( int x, String s) {
        System.out.println(s);
    }

}

class TestMethodOverLoading {
    public static void main(String[] args) {
        MethodOverLoading mO = new MethodOverLoading();
//        int a = 500;
//        mO.showInt(a);
//
//        boolean b = true;
//        mO.showBoolean(b);
//
//        String s = "Привет";
//        mO.showString(s);

        int a = 500;
        mO.show(a);

        boolean b = true;
        mO.show(b);

        String s = "Привет";
        mO.show(s);
    }
}


